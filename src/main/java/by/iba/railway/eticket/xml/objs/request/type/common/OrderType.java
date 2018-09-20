package by.iba.railway.eticket.xml.objs.request.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "value"
})
public class OrderType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "TicketID")
    protected String ticketID;
    @XmlAttribute(name = "ExpressID")
    private String expressID;
    @XmlAttribute(name = "SetReg")
    protected String setReg;
    @XmlAttribute(name = "AutoReject")
    protected String autoReject;
    @XmlAttribute(name = "PayAgent")
    protected String payAgent;

    public OrderType() {
    }

    public OrderType(String id, String autoReject) {
        this.id = id;
        this.autoReject = autoReject;
    }

    public OrderType(String id, String ticketID, String setReg) {
        this.id = id;
        this.ticketID = ticketID;
        this.setReg = setReg;
    }

    public OrderType(String id, String ticketID, String setReg, String payAgent) {
        this.id = id;
        this.ticketID = ticketID;
        this.setReg = setReg;
        this.payAgent = payAgent;
    }

    public OrderType(String id, String ticketID, String setReg, String payAgent, String expressID) {
        this.id = id;
        this.ticketID = ticketID;
        this.setReg = setReg;
        this.payAgent = payAgent;
        this.setExpressID(expressID);
    }

    public OrderType(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSetReg() {
        return setReg;
    }

    public void setSetReg(String setReg) {
        this.setReg = setReg;
    }

    public String getAutoReject() {
        return autoReject;
    }

    public void setAutoReject(String autoReject) {
        this.autoReject = autoReject;
    }

    public String getPayAgent() {
        return payAgent;
    }

    public void setPayAgent(String payAgent) {
        this.payAgent = payAgent;
    }

    public String getExpressID() {
        return expressID;
    }

    public void setExpressID(String expressID) {
        this.expressID = expressID;
    }
}
