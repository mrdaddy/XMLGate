package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.ReturnTicketRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.ReturnTicketResponse;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class ReturnTicketDao extends BaseDao<ReturnTicketResponse,ReturnTicketRequest> {
    protected String type = "ReturnTicket";

    public ReturnTicketDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public ReturnTicketResponse getReturnTicketInfo(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException {
        ReturnTicketRequest request = new ReturnTicketRequest(new OrderType(orderId, ticketId, null), "Info");
        ReturnTicketResponse response = sendRequest(request);
        return response;
    }

    public ReturnTicketResponse getReturnTicketReturn(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException {
        ReturnTicketRequest request = new ReturnTicketRequest(new OrderType(orderId, ticketId, null), "Return");
        ReturnTicketResponse response = sendRequest(request);
        return response;
    }
    @Override
    public Class<ReturnTicketRequest> getRequestClass() {
        return ReturnTicketRequest.class;
    }

    @Override
    public Class<ReturnTicketResponse> getResponseClass() {
        return ReturnTicketResponse.class;
    }
}
