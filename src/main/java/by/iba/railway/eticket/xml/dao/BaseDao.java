package by.iba.railway.eticket.xml.dao;

import by.iba.railway.eticket.xml.exception.*;
import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.RequestClass;
import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.ResponseClass;
import by.iba.railway.eticket.xml.objs.response.express.interfaces.Direction;
import by.iba.railway.eticket.xml.objs.response.express.interfaces.Directionsable;
import by.iba.railway.eticket.xml.objs.response.type.common.ErrorType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;
import org.apache.commons.codec.binary.Base64;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Calendar;

public abstract class BaseDao<T extends BaseResponse, K extends BaseRequest>
        implements SendRequest<T, K>, RequestClass<K>, ResponseClass<T> {

    // Url for connection
    private String siteUrl;
    private String login;
    private String password;
    protected String type;
    protected static boolean simalateBuyTicket = false;
    protected static boolean isShowResponse = true;
    protected static int CON_TIMEOUT_MS = 12 * 1000;
    protected int timeout;
    private CallbackStatistic statistic;

    private boolean debug;

    protected boolean useLog = false;
    protected LocalLogger logger = new LocalLogger("BaseDao");

    public BaseDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        this.siteUrl = siteUrl;
        this.login = login;
        this.password = password;
        this.debug = debug;
        this.timeout = timeout;
        this.statistic = statistic;
    }


    public Class<K> getRequestClass() {
        return null;
    }

    public Class<T> getResponseClass() {
        return null;
    }

    public T sendRequest(K request) throws XmlParserSystemException, BusinessSystemException {
        long startTime = Calendar.getInstance().getTimeInMillis();
        try {
            StringWriter writer = new StringWriter();

            String xmlRequest = marshalString(request,getRequestClass(),writer);
            if(debug) {
                logger.debug("Express Request:\r\n" + writer.toString());
            }
            String response = getDataString(writer.toString());
            updateStat(startTime, CallbackStatistic.ResponseStatus.SUCCESS, request, null);
            String xmlResponse = response;
            if(debug) {
                logger.debug("Express Response:\r\n" + response);
            }

            if(response.contains(GETAWAY_RESPONSE_TAG)==false
                    && response.contains(EXPRESS_RESPONSE_TAG)==false
                    && response.contains(ETICKET_RESPONSE_TAG)==false
                    && response.contains("Error") == true){
                Unmarshaller jaxbErrorUnmarshaller = JAXBContext.newInstance(
                        ErrorType.class).createUnmarshaller();
                StringReader reader = new StringReader(response);
                ErrorType responseErrorObject = (ErrorType) jaxbErrorUnmarshaller.unmarshal(reader);
                reader.close();
                String code = responseErrorObject.getCode();
                String value = responseErrorObject.getValue();
                String xmlFailRequest = writer.toString();
                updateStat(startTime, CallbackStatistic.ResponseStatus.ERROR_EXPRESS, request, code);
                throw new BusinessSystemException(code, value, xmlFailRequest);
            }

            /*
			 * SchemaFactory sf =
			 * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			 * Schema schema = sf.newSchema(new File(
			 * "src/main/resources/com/iba/railway/model/response/xsd/schedule-station-g19.xsd"
			 * )); jaxbUnmarshaller.setSchema(schema);
			 */
            T responseObject = unmarshalString(response,getResponseClass());
            if (responseObject.getError() != null) {
                String code = responseObject.getError().getCode();
                String value = responseObject.getError().getValue();
                String xmlFailRequest = writer.toString();
                writer.close();
                if (response.contains(GETAWAY_RESPONSE_TAG))
                    throw new GatewaySystemException(code, value, xmlFailRequest);
                else if (response.contains(EXPRESS_RESPONSE_TAG))
                    throw new ExpressSystemException(code, value, xmlFailRequest);
                else if (response.contains(ETICKET_RESPONSE_TAG))
                    throw new EticketSystemException(code, value, xmlFailRequest);
            }
            if(responseObject instanceof Directionsable)
                for(Direction direction : ((Directionsable)responseObject).getDirection())
                    if(direction.getError()!=null){
                        String code = direction.getError().getCode();
                        String value = direction.getError().getValue();
                        String xmlFailRequest = writer.toString();
                        throw new ExpressSystemException(code, value, xmlFailRequest);
                    }
            responseObject.setXmlRequest(xmlRequest);
            responseObject.setXmlResponse(xmlResponse);

            return responseObject;
        } catch (BusinessSystemException e) {
            throw e;
        } catch (SocketTimeoutException e) {
            updateStat(startTime, CallbackStatistic.ResponseStatus.ERROR_GATEWAY, request, null);
            logger.info("Read timed out for request class: "+request.getClass().getSimpleName()+" ("+request.getType()+") : "+timeout);
            throw new XmlParserSystemException("timeout");
        } catch (Exception e) {
            updateStat(startTime, CallbackStatistic.ResponseStatus.ERROR_GATEWAY, request, null);
            XmlParserSystemException e1 = new XmlParserSystemException(e.getMessage());
            logger.error(e);
            e1.initCause(e);
            throw e1;
        }
    }

    private void updateStat(long startTime, CallbackStatistic.ResponseStatus action, K request, String errorCode) {
        if(statistic!=null) {
            statistic.saveQueryTime(request.getType(),action, Calendar.getInstance().getTimeInMillis()-startTime, errorCode);
        }
    }

    public <T> String marshalString(T object, Class<T> classType, StringWriter writer) throws JAXBException {
        Marshaller m = JAXBContext.newInstance(classType)
                .createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(object, writer);
        String marshalString = writer.toString();
        return marshalString;
    }

    public <T> T unmarshalString(String string, Class<T> classType) throws JAXBException {
        Unmarshaller jaxbUnmarshaller = JAXBContext.newInstance(
                classType).createUnmarshaller();
        StringReader reader = new StringReader(string);
        @SuppressWarnings("unchecked")
        T object = (T) jaxbUnmarshaller.unmarshal(reader);
        reader.close();
        return object;
    }

    protected String getDataString(String data) throws Exception {
        StringBuilder response = new StringBuilder("");
        URL url = new URL(siteUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        String userpass = login + ":" + password;
        String basicAuth = "Basic "
                + new String(Base64.encodeBase64(userpass.getBytes()));
        conn.setRequestProperty("Authorization", basicAuth);
        conn.setConnectTimeout(CON_TIMEOUT_MS);
        conn.setReadTimeout(timeout);
        conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

        OutputStreamWriter writer = new OutputStreamWriter(
                conn.getOutputStream(),"UTF-8");
        //conn.disconnect();
        writer.write(data);
        writer.flush();
        writer.close();
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream(),"UTF-8"));
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}