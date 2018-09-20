package by.iba.railway.eticket.xml.objs.request.type.buyticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlankType", propOrder = {
    "returnDate",
    "passenger",
    "seatsCount",
    "tariff",
    "tariffCode"
})
public class BlankType {

    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "Passenger")
    protected List<PassengerType> passenger;
    @XmlElement(name = "SeatsCount", required = true)
    protected String seatsCount;
    @XmlElement(name = "Tariff", required = true)
    protected String tariff;
    @XmlElement(name = "TariffCode", required = false)
    private String tariffCode;

    public BlankType() {
    }

    public BlankType(List<PassengerType> passenger) {
        this.passenger = passenger;
    }

    public List<PassengerType> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<PassengerType>();
        }
        return this.passenger;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(String seatsCount) {
        this.seatsCount = seatsCount;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public void setPassenger(List<PassengerType> passenger) {
        this.passenger = passenger;
    }

    public String getTariffCode() {
        return tariffCode;
    }

    public void setTariffCode(String tariffCode) {
        this.tariffCode = tariffCode;
    }
}
