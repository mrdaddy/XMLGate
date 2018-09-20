package by.iba.railway.eticket.xml.objs.response.type.G1x;

import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route"
})
public class TrainType {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlAttribute(name = "Number")
    protected String number;

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
}
