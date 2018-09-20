package by.iba.railway.eticket.xml.objs.response.type.G46;

import by.iba.railway.eticket.xml.objs.response.type.common.ClassServiceType;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {
    "route",
    "railway",
    "signs",
    "classService",
    "seats",
    "cliche"
})
public class CarType {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "Railway", required = true)
    protected RailwayType railway;
    @XmlElement(name = "Signs", required = true)
    protected SignsType signs;
    @XmlElement(name = "ClassService", required = true)
    protected ClassServiceType classService;
    @XmlElement(name = "Seats", required = true)
    protected SeatsG46Type seats;
    @XmlElement(name = "Cliche")
    protected List<ClicheType> cliche;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "NumberInt")
    private String numberInt;
    @XmlAttribute(name = "Type")
    protected String type;

    public List<ClicheType> getCliche() {
        if (cliche == null) {
            cliche = new ArrayList<ClicheType>();
        }
        return this.cliche;
    }

    public String getNumberInt() { return numberInt; }

    public void setNumberInt(String numberInt) { this.numberInt = numberInt; }

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
    }

    public RailwayType getRailway() {
        return railway;
    }

    public void setRailway(RailwayType railway) {
        this.railway = railway;
    }

    public SignsType getSigns() {
        return signs;
    }

    public void setSigns(SignsType signs) {
        this.signs = signs;
    }

    public ClassServiceType getClassService() {
        return classService;
    }

    public void setClassService(ClassServiceType classService) {
        this.classService = classService;
    }

    public SeatsG46Type getSeats() {
        return seats;
    }

    public void setSeats(SeatsG46Type seats) {
        this.seats = seats;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCliche(List<ClicheType> cliche) {
        this.cliche = cliche;
    }
}
