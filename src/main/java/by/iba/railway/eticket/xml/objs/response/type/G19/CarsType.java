package by.iba.railway.eticket.xml.objs.response.type.G19;

import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CarsType", propOrder = {
    "route",
    "stopTime",
    "depTime",
    "arvTime",
    "timeInWay",
    "railway",
    "daysOfGo"
})
public class CarsType {
    
    protected RouteType route;
    protected String stopTime;    
    protected String depTime;    
    protected String arvTime;    
    protected String timeInWay;
    protected RailwayType railway;
    protected String daysOfGo;

    @XmlElement(name = "Route")
    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType value) {
        this.route = value;
    }
    @XmlElement(name = "StopTime")
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String value) {
        this.stopTime = value;
    }
    @XmlElement(name = "DepTime")
    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String value) {
        this.depTime = value;
    }
    @XmlElement(name = "ArvTime")
    public String getArvTime() {
        return arvTime;
    }

    public void setArvTime(String value) {
        this.arvTime = value;
    }
    @XmlElement(name = "TimeInWay")
    public String getTimeInWay() {
        return timeInWay;
    }

    public void setTimeInWay(String value) {
        this.timeInWay = value;
    }
    @XmlElement(name = "Railway")
    public RailwayType getRailway() {
        return railway;
    }

    public void setRailway(RailwayType value) {
        this.railway = value;
    }
    @XmlElement(name = "DaysOfGo")
    public String getDaysOfGo() {
        return daysOfGo;
    }

    public void setDaysOfGo(String value) {
        this.daysOfGo = value;
    }

}
