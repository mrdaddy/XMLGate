package by.iba.railway.eticket.xml.objs.response.type.G51;

import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route",
    "arrival"
})
public class TrainType {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "Arrival", required = true)
    protected ArrivalG51Type arrival;
    @XmlAttribute(name = "Number")
    protected String number;

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
    }

    public ArrivalG51Type getArrival() {
        return arrival;
    }

    public void setArrival(ArrivalG51Type arrival) {
        this.arrival = arrival;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
