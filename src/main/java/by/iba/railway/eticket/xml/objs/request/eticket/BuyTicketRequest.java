package by.iba.railway.eticket.xml.objs.request.eticket;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengersType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.RequirementsType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GtETicket_Request")
@XmlType(name = "GtETicket_RequestType", propOrder = {
    "stationFrom",
    "stationTo",
    "depDate",
    "depTime",
    "train",
    "car",
    "requirements",
    "creditCard",
    "passengers"
})
public class BuyTicketRequest extends BaseRequest {

    @XmlElement(name = "StationFrom", required = true)
    protected String stationFrom;
    @XmlElement(name = "StationTo", required = true)
    protected String stationTo;
    @XmlElement(name = "DepDate", required = true)
    protected String depDate;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "Car", required = true)
    protected CarType car;
    @XmlElement(name = "Requirements", required = true)
    protected RequirementsType requirements;
    @XmlElement(name = "CreditCard", required = true)
    protected String creditCard;
    @XmlElement(name = "Passengers", required = true)
    protected PassengersType passengers;

    public BuyTicketRequest() {
        type = "BuyTicket";
    }

    public BuyTicketRequest(String stationFrom, String stationTo, String depDate, String depTime, TrainType train, CarType car, RequirementsType requirements, String creditCard, PassengersType passengers) {
        this();
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.depDate = depDate;
        this.depTime = depTime;
        this.train = train;
        this.car = car;
        this.requirements = requirements;
        this.creditCard = creditCard;
        this.passengers = passengers;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public RequirementsType getRequirements() {
        return requirements;
    }

    public void setRequirements(RequirementsType requirements) {
        this.requirements = requirements;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public PassengersType getPassengers() {
        return passengers;
    }

    public void setPassengers(PassengersType passengers) {
        this.passengers = passengers;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }
}
