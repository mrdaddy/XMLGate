package by.iba.railway.eticket.xml.objs.request.eticket;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GtETicket_Request")
@XmlType(name = "GtETicket_RequestType", propOrder = {
    "order"
})
public class ReturnTicketRequest extends BaseRequest {

    @XmlElement(name = "Order", required = true)
    protected OrderType order;
    @XmlAttribute(name = "Action")
    protected String action;

    public ReturnTicketRequest() {
        type = "ReturnTicket";
    }

    public ReturnTicketRequest(OrderType order, String action) {
        this();
        this.action = action;
        this.order = order;
    }

    public OrderType getOrder() {
        return order;
    }

    public void setOrder(OrderType order) {
        this.order = order;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
