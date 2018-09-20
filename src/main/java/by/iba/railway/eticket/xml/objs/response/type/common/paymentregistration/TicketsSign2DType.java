package by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketsType", propOrder = {
    "ticket"
})
public class TicketsSign2DType {

    @XmlElement(name = "Ticket")
    protected List<TicketSign2DType> ticket;

    public List<TicketSign2DType> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<TicketSign2DType>();
        }
        return this.ticket;
    }

    public void setTicket(List<TicketSign2DType> ticket) {
        this.ticket = ticket;
    }
}
