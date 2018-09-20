package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import by.iba.railway.eticket.xml.objs.response.type.common.BaseTicketType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "tariff",
    "tariffEuro",
    "tariffNDS",
    "tariffBP",
    "tariffB",
    "tariffP",
    "tariffInsurance",
    "tariffService",
    "tariffServiceNDS",
    "tariffType",
    "tariffCom",
    "tariffComNDS",
    "tariffInfo",
    "passCount",
    "seats",
    "seatsType",
    "d5",
    "passenger"
})
public class TicketType extends BaseTicketType{

    @XmlElement(name = "TariffCom")
    private Float tariffCom;
    @XmlElement(name = "TariffComNDS")
    private Float tariffComNDS;
    @XmlElement(name = "Tariff")
    protected Float tariff;
    @XmlElement(name = "TariffEuro")
    protected Float tariffEuro;
    @XmlElement(name = "TariffNDS")
    protected Float tariffNDS;
    @XmlElement(name = "TariffBP")
    protected Float tariffBP;
    @XmlElement(name = "TariffB")
    protected Float tariffB;
    @XmlElement(name = "TariffP")
    protected Float tariffP;
    @XmlElement(name = "TariffInsurance")
    protected Float tariffInsurance;
    @XmlElement(name = "TariffService")
    protected Float tariffService;
    @XmlElement(name = "TariffServiceNDS")
    protected Float tariffServiceNDS;
    @XmlElement(name = "TariffType", required = true)
    protected String tariffType;
    @XmlElement(name = "TariffInfo", required = true)
    protected String tariffInfo;
    @XmlElement(name = "PassCount")
    protected Integer passCount;
    @XmlElement(name = "Seats", required = true)
    protected String seats;
    @XmlElement(name = "SeatsType", required = true)
    protected String seatsType;
    @XmlElement(name = "D5", required = true)
    protected String d5;
    @XmlElement(name = "Passenger")
    protected List<PassengerType> passenger;
    @XmlAttribute(name = "NumberReservation")
    protected String numberReservation;
    @XmlAttribute(name = "ListPassIssued")
    private String listPassIssued;

    public List<PassengerType> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<PassengerType>();
        }
        return this.passenger;
    }

    public Float getTariff() {
        return tariff;
    }

    public void setTariff(Float tariff) {
        this.tariff = tariff;
    }

    public Float getTariffEuro() {
        return tariffEuro;
    }

    public void setTariffEuro(Float tariffEuro) {
        this.tariffEuro = tariffEuro;
    }

    public Float getTariffNDS() {
        return tariffNDS;
    }

    public void setTariffNDS(Float tariffNDS) {
        this.tariffNDS = tariffNDS;
    }

    public Float getTariffBP() {
        return tariffBP;
    }

    public void setTariffBP(Float tariffBP) {
        this.tariffBP = tariffBP;
    }

    public Float getTariffInsurance() {
        return tariffInsurance;
    }

    public void setTariffInsurance(Float tariffInsurance) {
        this.tariffInsurance = tariffInsurance;
    }

    public Float getTariffService() {
        return tariffService;
    }

    public void setTariffService(Float tariffService) {
        this.tariffService = tariffService;
    }

    public Float getTariffServiceNDS() {
        return tariffServiceNDS;
    }

    public void setTariffServiceNDS(Float tariffServiceNDS) {
        this.tariffServiceNDS = tariffServiceNDS;
    }

    public String getTariffType() {
        return tariffType;
    }

    public void setTariffType(String tariffType) {
        this.tariffType = tariffType;
    }

    public String getTariffInfo() {
        return tariffInfo;
    }

    public void setTariffInfo(String tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    public Integer getPassCount() {
        return passCount;
    }

    public void setPassCount(Integer passCount) {
        this.passCount = passCount;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getSeatsType() {
        return seatsType;
    }

    public void setSeatsType(String seatsType) {
        this.seatsType = seatsType;
    }

    public String getD5() {
        return d5;
    }

    public void setD5(String d5) {
        this.d5 = d5;
    }

    public String getNumberReservation() {
        return numberReservation;
    }

    public void setNumberReservation(String numberReservation) {
        this.numberReservation = numberReservation;
    }

    public Float getTariffB() {
        return tariffB;
    }

    public void setTariffB(Float tariffB) {
        this.tariffB = tariffB;
    }

    public Float getTariffP() {
        return tariffP;
    }

    public void setTariffP(Float tariffP) {
        this.tariffP = tariffP;
    }

    public void setPassenger(List<PassengerType> passenger) {
        this.passenger = passenger;
    }

    public Float getTariffCom() {
        return tariffCom;
    }

    public void setTariffCom(Float tariffCom) {
        this.tariffCom = tariffCom;
    }

    public Float getTariffComNDS() {
        return tariffComNDS;
    }

    public void setTariffComNDS(Float tariffComNDS) {
        this.tariffComNDS = tariffComNDS;
    }

    public String getListPassIssued() {
        return listPassIssued;
    }

    public void setListPassIssued(String listPassIssued) {
        this.listPassIssued = listPassIssued;
    }
}
