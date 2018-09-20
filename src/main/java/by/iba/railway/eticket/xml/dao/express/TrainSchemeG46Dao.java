package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.TrainSchemeG46Request;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.TrainSchemeG46Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class TrainSchemeG46Dao extends BaseScheduleDao<TrainSchemeG46Response,TrainSchemeG46Request> {
    protected String type = "TrainScheme";

    public TrainSchemeG46Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public by.iba.railway.eticket.xml.objs.response.type.G46.TrainType getTrainSchemeTrain(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        TrainSchemeG46Request request = new TrainSchemeG46Request(new TrainType(trainNumber), date);
        TrainSchemeG46Response response = sendRequest(request);

        return response.getTrain();
    }
    public String getTrainSchemeSignsInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        TrainSchemeG46Request request = new TrainSchemeG46Request(new TrainType(trainNumber), date);
        TrainSchemeG46Response response = sendRequest(request);

        return response.getSignsInfo();
    }
    public TrainSchemeG46Response getTrainSchemeInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        TrainSchemeG46Request request = new TrainSchemeG46Request(new TrainType(trainNumber), date);
        TrainSchemeG46Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<TrainSchemeG46Request> getRequestClass() {
        return TrainSchemeG46Request.class;
    }

    @Override
    public Class<TrainSchemeG46Response> getResponseClass() {
        return TrainSchemeG46Response.class;
    }
}
