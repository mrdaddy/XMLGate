package by.iba.railway.eticket.xml.objs.response.eticket;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;
import by.iba.railway.eticket.xml.objs.response.type.common.buyreturnticket.IIType;
import by.iba.railway.eticket.xml.objs.response.type.returnticket.TicketsType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtETicket_Response")
@XmlType(name = "GtEticket_ResponseType", propOrder = {
    "order",
    "paymentType",
    "reject",
    "retTariff",
    "retTypeInfo",
    "info",
    "timeBeforeDep",
    "operation",
    "agent",
    "subagent",
    "tickets",
    "ii"
})
public class ReturnTicketResponse extends BaseResponse {

    @XmlElement(name = "Order", required = true)
    protected BaseOrderType order;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "Reject", required = false)
    protected String reject;
    @XmlElement(name = "RetTariff")
    protected Float retTariff;
    @XmlElement(name = "RetTypeInfo", required = true)
    protected String retTypeInfo;
    @XmlElement(name = "Info", required = true)
    protected String info;
    @XmlElement(name = "TimeBeforeDep", required = true)
    protected String timeBeforeDep;
    @XmlElement(name = "Operation", required = true)
    protected DateTime operation;
    @XmlElement(name = "Agent", required = false)
    protected String agent;
    @XmlElement(name = "Subagent", required = false)
    protected String subagent;
    @XmlElement(name = "Tickets", required = true)
    protected TicketsType tickets;
    @XmlElement(name = "II", required = true)
    protected IIType ii;
    @XmlAttribute(name = "Action")
    protected String action;

    public BaseOrderType getOrder() {
        return order;
    }

    public void setOrder(BaseOrderType order) {
        this.order = order;
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Float getRetTariff() {
        return retTariff;
    }

    public void setRetTariff(Float retTariff) {
        this.retTariff = retTariff;
    }

    public String getRetTypeInfo() {
        return retTypeInfo;
    }

    public void setRetTypeInfo(String retTypeInfo) {
        this.retTypeInfo = retTypeInfo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTimeBeforeDep() {
        return timeBeforeDep;
    }

    public void setTimeBeforeDep(String timeBeforeDep) {
        this.timeBeforeDep = timeBeforeDep;
    }

    public DateTime getOperation() {
        return operation;
    }

    public void setOperation(DateTime operation) {
        this.operation = operation;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getSubagent() {
        return subagent;
    }

    public void setSubagent(String subagent) {
        this.subagent = subagent;
    }

    public TicketsType getTickets() {
        return tickets;
    }

    public void setTickets(TicketsType tickets) {
        this.tickets = tickets;
    }

    public IIType getIi() {
        return ii;
    }

    public void setIi(IIType ii) {
        this.ii = ii;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
