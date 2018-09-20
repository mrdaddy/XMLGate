package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.SetAutoRejectRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.SetAutoRejectResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class SetAutoRejectDao extends BaseDao<SetAutoRejectResponse,SetAutoRejectRequest> {
    protected String type = "SetAutoReject";

    public SetAutoRejectDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public BaseOrderType getSetAutoRejectOrder(String orderId, String autoRejectPeriodInMinutes) throws XmlParserSystemException, BusinessSystemException {
        SetAutoRejectRequest request = new SetAutoRejectRequest(new OrderType(orderId,autoRejectPeriodInMinutes));
        SetAutoRejectResponse response = sendRequest(request);

        return response.getOrder();
    }
    public SetAutoRejectResponse getSetAutoRejectInfo(String orderId, String autoRejectPeriodInMinutes) throws XmlParserSystemException, BusinessSystemException {
        SetAutoRejectRequest request = new SetAutoRejectRequest(new OrderType(orderId,autoRejectPeriodInMinutes));
        SetAutoRejectResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<SetAutoRejectRequest> getRequestClass() {
        return SetAutoRejectRequest.class;
    }

    @Override
    public Class<SetAutoRejectResponse> getResponseClass() {
        return SetAutoRejectResponse.class;
    }
}
