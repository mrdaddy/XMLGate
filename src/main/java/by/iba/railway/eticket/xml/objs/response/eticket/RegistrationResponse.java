package by.iba.railway.eticket.xml.objs.response.eticket;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.OperationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.RegistrationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.TicketsSign2DType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtETicket_Response")
@XmlType(name = "GtETicket_ResponseType", propOrder = {
    "order",
    "registration",
    "operation",
    "tickets"
})
public class RegistrationResponse extends BaseResponse{

    @XmlElement(name = "Order", required = true)
    protected BaseOrderType order;
    @XmlElement(name = "Registration", required = true)
    protected RegistrationType registration;
    @XmlElement(name = "Operation")
    protected OperationType operation;
    @XmlElement(name = "Tickets", required = true)
    protected TicketsSign2DType tickets;

    public BaseOrderType getOrder() {
        return order;
    }

    public void setOrder(BaseOrderType order) {
        this.order = order;
    }

    public RegistrationType getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    public TicketsSign2DType getTickets() {
        return tickets;
    }

    public void setTickets(TicketsSign2DType tickets) {
        this.tickets = tickets;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }
}
