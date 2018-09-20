package by.iba.railway.eticket.xml.objs.response.type.G62;

import by.iba.railway.eticket.xml.objs.response.type.common.*;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route",
    "departure",
    "arrival",
    "timeInWay",
    "elRegPossible",
    "departureTrain",
    "length",
    "brand",
    "firmName",
    "comments",
    "car"
})
public class TrainG62Type {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "Departure", required = true)
    protected DepartureType departure;
    @XmlElement(name = "Arrival", required = true)
    protected ArrivalType arrival;
    @XmlElement(name = "TimeInWay", required = true)
    protected String timeInWay;
    @XmlElement(name = "ElRegPossible", required = true)
    protected String elRegPossible;
    @XmlElement(name = "DepartureTrain")
    protected DateTime departureTrain;
    @XmlElement(name = "Length")
    protected String length;
    @XmlElement(name = "Brand", required = true)
    protected String brand;
    @XmlElement(name = "FirmName", required = true)
    protected String firmName;
    @XmlElement(name = "Comments", required = true)
    protected CommentsType comments;
    @XmlElement(name = "Car")
    protected List<CarG62Type> car;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Number2")
    protected String number2;
    @XmlAttribute(name = "Type")
    protected String type;

    public List<CarG62Type> getCar() {
        if (car == null) {
            car = new ArrayList<CarG62Type>();
        }
        return this.car;
    }

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
    }

    public DepartureType getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureType departure) {
        this.departure = departure;
    }

    public ArrivalType getArrival() {
        return arrival;
    }

    public void setArrival(ArrivalType arrival) {
        this.arrival = arrival;
    }

    public String getTimeInWay() {
        return timeInWay;
    }

    public void setTimeInWay(String timeInWay) {
        this.timeInWay = timeInWay;
    }

    public String getElRegPossible() {
        return elRegPossible;
    }

    public void setElRegPossible(String elRegPossible) {
        this.elRegPossible = elRegPossible;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public CommentsType getComments() {
        return comments;
    }

    public void setComments(CommentsType comments) {
        this.comments = comments;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DateTime getDepartureTrain() {
        return departureTrain;
    }

    public void setDepartureTrain(DateTime departureTrain) {
        this.departureTrain = departureTrain;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setCar(List<CarG62Type> car) {
        this.car = car;
    }
}
