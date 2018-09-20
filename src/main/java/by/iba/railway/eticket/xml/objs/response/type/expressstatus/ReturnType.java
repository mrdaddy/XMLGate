package by.iba.railway.eticket.xml.objs.response.type.expressstatus;

import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;
import by.iba.railway.eticket.xml.objs.response.type.common.buyreturnticket.IIType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnType", propOrder = {
    "retTypeInfo",
    "info",
    "operation",
    "payment",
    "timeBeforeDep",
    "agent",
    "subagent",
    "tariffInsurance",
    "tariffRetB",
    "tariffRetP",
    "tariffRetServ",
    "tariffRetCom",
    "tariffCom",
    "II"
})
public class ReturnType {

    @XmlElement(name = "RetTypeInfo", required = true)
    protected String retTypeInfo;
    @XmlElement(name = "Info", required = true)
    protected String info;
    @XmlElement(name = "Operation", required = true)
    protected DateTime operation;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "TimeBeforeDep")
    protected String timeBeforeDep;
    @XmlElement(name = "Agent")
    protected String agent;
    @XmlElement(name = "Subagent")
    protected String subagent;
    @XmlElement(name = "II")
    protected IIType II;
    @XmlAttribute(name = "RetTariff")
    protected Float retTariff;
    @XmlAttribute(name = "KRS")
    protected String krs;
    @XmlElement(name = "TariffInsurance")
    private Float tariffInsurance;
    @XmlElement(name = "TariffRetB")
    private Float tariffRetB;
    @XmlElement(name = "TariffRetP")
    private Float tariffRetP;
    @XmlElement(name = "TariffRetServ")
    private Float tariffRetServ;
    @XmlElement(name = "TariffRetCom")
    private Float tariffRetCom;
    @XmlElement(name = "TariffCom")
    private Float tariffCom;

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

    public DateTime getOperation() {
        return operation;
    }

    public void setOperation(DateTime operation) {
        this.operation = operation;
    }

    public Float getRetTariff() {
        return retTariff;
    }

    public void setRetTariff(Float retTariff) {
        this.retTariff = retTariff;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getTimeBeforeDep() {
        return timeBeforeDep;
    }

    public void setTimeBeforeDep(String timeBeforeDep) {
        this.timeBeforeDep = timeBeforeDep;
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

    public IIType getII() {
        return II;
    }

    public void setII(IIType II) {
        this.II = II;
    }

    public Float getTariffRetB() {
        return tariffRetB;
    }

    public void setTariffRetB(Float tariffRetB) {
        this.tariffRetB = tariffRetB;
    }

    public Float getTariffRetP() {
        return tariffRetP;
    }

    public void setTariffRetP(Float tariffRetP) {
        this.tariffRetP = tariffRetP;
    }

    public Float getTariffRetServ() {
        return tariffRetServ;
    }

    public void setTariffRetServ(Float tariffRetServ) {
        this.tariffRetServ = tariffRetServ;
    }

    public Float getTariffRetCom() {
        return tariffRetCom;
    }

    public void setTariffRetCom(Float tariffRetCom) {
        this.tariffRetCom = tariffRetCom;
    }

    public Float getTariffCom() {
        return tariffCom;
    }

    public void setTariffCom(Float tariffCom) {
        this.tariffCom = tariffCom;
    }

    public Float getTariffInsurance() {
        return tariffInsurance;
    }

    public void setTariffInsurance(Float tariffInsurance) {
        this.tariffInsurance = tariffInsurance;
    }
}
