package by.iba.railway.eticket.xml.objs.response.type.returnticket;

import by.iba.railway.eticket.xml.objs.response.type.common.BaseTicketType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "retTariff",
    "tariffInsurance",
    "tariffRetB",
    "tariffRetP",
    "tariffRetServ",
    "tariffRetCom",
    "tariffCom"
})
public class TicketType extends BaseTicketType{

    @XmlElement(name = "RetTariff")
    protected Float retTariff;
    @XmlElement(name = "TariffInsurance")
    protected Float tariffInsurance;
    @XmlAttribute(name = "KRS")
    protected String krs;
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

    public Float getRetTariff() {
        return retTariff;
    }

    public void setRetTariff(Float retTariff) {
        this.retTariff = retTariff;
    }

    public Float getTariffInsurance() {
        return tariffInsurance;
    }

    public void setTariffInsurance(Float tariffInsurance) {
        this.tariffInsurance = tariffInsurance;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
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
}
