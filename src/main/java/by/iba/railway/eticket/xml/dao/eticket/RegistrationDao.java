package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.RegistrationRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.RegistrationResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.RegistrationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.TicketSign2DType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class RegistrationDao extends BaseDao<RegistrationResponse,RegistrationRequest> {
    protected String type = "Registration";

    public RegistrationDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }

    public RegistrationResponse getChangeRegistration(String orderId, String ticketId, boolean isElectronicReg) throws XmlParserSystemException, BusinessSystemException {
        RegistrationRequest request = null;
        if(isElectronicReg)
            request = new RegistrationRequest(new OrderType(orderId,ticketId,"1"));
        else
            request = new RegistrationRequest(new OrderType(orderId,ticketId,"0"));
        RegistrationResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<RegistrationRequest> getRequestClass() {
        return RegistrationRequest.class;
    }

    @Override
    public Class<RegistrationResponse> getResponseClass() {
        return RegistrationResponse.class;
    }
}
