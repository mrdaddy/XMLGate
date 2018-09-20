package by.iba.railway.eticket.xml.objs.response.eticket;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.expressstatus.TicketsType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtETicket_Response")
@XmlType(name = "GtETicket_ResponseType", propOrder = {
    "order",
    "tickets"
})
public class ExpressStatusResponse extends BaseResponse {

    @XmlElement(name = "Order", required = true)
    protected BaseOrderType order;
    @XmlElement(name = "Tickets", required = true)
    protected TicketsType tickets;

    public BaseOrderType getOrder() {
        return order;
    }

    public void setOrder(BaseOrderType order) {
        this.order = order;
    }

    public TicketsType getTickets() {
        return tickets;
    }

    public void setTickets(TicketsType tickets) {
        this.tickets = tickets;
    }
}
