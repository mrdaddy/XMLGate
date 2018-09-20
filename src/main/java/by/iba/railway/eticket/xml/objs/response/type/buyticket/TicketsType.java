package by.iba.railway.eticket.xml.objs.response.type.buyticket;

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
public class TicketsType {

    @XmlElement(name = "Ticket")
    protected List<TicketType> ticket;

    public List<TicketType> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<TicketType>();
        }
        return this.ticket;
    }

    public void setTicket(List<TicketType> ticket) {
        this.ticket = ticket;
    }
}
