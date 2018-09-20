package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.PaymentRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.response.eticket.PaymentResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.RegistrationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.TicketSign2DType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class PaymentDao extends BaseDao<PaymentResponse,PaymentRequest> {
    protected String type = "Payment";

    public PaymentDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<TicketSign2DType> getPaymentTickets(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        PaymentRequest request = null;
        if(isElectronicReg)
            request = new PaymentRequest(new OrderType(orderId,null,"1",payAgent));
        else
            request = new PaymentRequest(new OrderType(orderId,null,"0",payAgent));
        PaymentResponse response = sendRequest(request);

        return response.getTickets() != null ? response.getTickets().getTicket() : null;
    }
    public RegistrationType getPaymentRegistration(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        PaymentRequest request = null;
        if(isElectronicReg)
            request = new PaymentRequest(new OrderType(orderId,null,"1",payAgent));
        else
            request = new PaymentRequest(new OrderType(orderId,null,"0",payAgent));
        PaymentResponse response = sendRequest(request);

        return response.getRegistration();
    }
    public BaseOrderType getPaymentOrder(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        PaymentRequest request = null;
        if(isElectronicReg)
            request = new PaymentRequest(new OrderType(orderId,null,"1",payAgent));
        else
            request = new PaymentRequest(new OrderType(orderId,null,"0",payAgent));
        PaymentResponse response = sendRequest(request);

        return response.getOrder();
    }
    public PaymentResponse getPaymentInfo(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        PaymentRequest request = null;
        if(isElectronicReg)
            request = new PaymentRequest(new OrderType(orderId,null,"1",payAgent));
        else
            request = new PaymentRequest(new OrderType(orderId,null,"0",payAgent));
        PaymentResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<PaymentRequest> getRequestClass() {
        return PaymentRequest.class;
    }

    @Override
    public Class<PaymentResponse> getResponseClass() {
        return PaymentResponse.class;
    }
}
