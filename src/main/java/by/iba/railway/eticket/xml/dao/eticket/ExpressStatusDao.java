package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.ExpressStatusRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.ExpressStatusResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.expressstatus.TicketType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class ExpressStatusDao extends BaseDao<ExpressStatusResponse,ExpressStatusRequest> {
    protected String type = "ExpressStatus";

    public ExpressStatusDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public BaseOrderType getExpressStatusOrder(String orderId) throws XmlParserSystemException, BusinessSystemException {
        ExpressStatusRequest request = new ExpressStatusRequest(new OrderType(orderId));
        ExpressStatusResponse response = sendRequest(request);

        return response.getOrder();
    }
    public List<TicketType> getExpressStatusTickets(String orderId) throws XmlParserSystemException, BusinessSystemException {
        ExpressStatusRequest request = new ExpressStatusRequest(new OrderType(orderId));
        ExpressStatusResponse response = sendRequest(request);

        return response.getTickets() != null ? response.getTickets().getTicket() : null;
    }
    public ExpressStatusResponse getExpressStatusInfo(String orderId) throws XmlParserSystemException, BusinessSystemException {
        ExpressStatusRequest request = new ExpressStatusRequest(new OrderType(orderId));

        return sendRequest(request);
    }
    @Override
    public Class<ExpressStatusRequest> getRequestClass() {
        return ExpressStatusRequest.class;
    }

    @Override
    public Class<ExpressStatusResponse> getResponseClass() {
        return ExpressStatusResponse.class;
    }
}
