package by.iba.railway.eticket.xml.objs.response.type.common;

import by.iba.railway.eticket.xml.objs.response.type.G60.PlacesType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
        "firmName",
        "comments",
        "brand",
        "places",
        "elRegPossible",
        "departure",
        "arrival",
        "timeInWay",
        "route"
})
public class TrainG60Type {
    @XmlElement(name = "FirmName")
    protected String firmName;
    @XmlElement(name = "Comments")
    protected CommentsType comments;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Places")
    protected PlacesType places;
    @XmlElement(name = "ElRegPossible")
    protected ElRegPossibleType elRegPossible;
    @XmlElement(name = "Departure")
    protected DepartureType departure;
    @XmlElement(name = "Arrival")
    protected ArrivalType arrival;
    @XmlElement(name = "TimeInWay")
    protected String timeInWay;
    @XmlElement(name = "Route")
    protected RouteType route;

    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Number2")
    protected String number2;
    @XmlAttribute(name = "Type")
    protected String type;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PlacesType getPlaces() {
        return places;
    }

    public void setPlaces(PlacesType places) {
        this.places = places;
    }

    public ElRegPossibleType getElRegPossible() {
        return elRegPossible;
    }

    public void setElRegPossible(ElRegPossibleType elRegPossible) {
        this.elRegPossible = elRegPossible;
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

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
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
}
