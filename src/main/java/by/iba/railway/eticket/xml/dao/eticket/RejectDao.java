package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.RejectRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.RejectResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class RejectDao extends BaseDao<RejectResponse,RejectRequest> {
    protected String type = "Reject";

    public RejectDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public BaseOrderType getRejectOrder(String orderId) throws XmlParserSystemException, BusinessSystemException {
        RejectRequest request = new RejectRequest(new OrderType(orderId));
        RejectResponse response = sendRequest(request);

        return response.getOrder();
    }
    public RejectResponse getRejectInfo(String orderId) throws XmlParserSystemException, BusinessSystemException {
        RejectRequest request = new RejectRequest(new OrderType(orderId));
        RejectResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<RejectRequest> getRequestClass() {
        return RejectRequest.class;
    }

    @Override
    public Class<RejectResponse> getResponseClass() {
        return RejectResponse.class;
    }
}
