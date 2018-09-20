package by.iba.railway.eticket.xml.objs.request.eticket;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GtETicket_Request")
@XmlType(name = "GtETicket_RequestType", propOrder = {
    "order"
})
public class PaymentRequest extends BaseRequest {

    @XmlElement(name = "Order", required = true)
    protected OrderType order;

    public PaymentRequest() {
        type = "Payment";
    }

    public PaymentRequest(OrderType order) {
        this();
        this.order = order;
    }

    public OrderType getOrder() {
        return order;
    }

    public void setOrder(OrderType order) {
        this.order = order;
    }
}
