//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.14 at 03:03:23 PM AST 
//


package by.iba.railway.eticket.xml.objs.response.type.G19;

import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route",
    "stopTime",
    "arvTime",
    "depTime",
    "timeInWay",
    "railway",
    "daysOfGo",
    "carType",
    "cars"
})
public class TrainG19Type {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "StopTime", required = true)
    protected String stopTime;
    @XmlElement(name = "ArvTime", required = true)
    protected String arvTime;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "TimeInWay", required = true)
    protected String timeInWay;
    @XmlElement(name = "Railway", required = true)
    protected RailwayType railway;
    @XmlElement(name = "DaysOfGo", required = true)
    protected String daysOfGo;
    @XmlElement(name = "CarType", required = true)
    protected String carType;
    @XmlElement(name = "Cars")
    protected List<CarsType> cars;
    @XmlAttribute(name = "Number")
    protected String number;

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType value) {
        this.route = value;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String value) {
        this.stopTime = value;
    }

    public String getArvTime() {
        return arvTime;
    }

    public void setArvTime(String value) {
        this.arvTime = value;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String value) {
        this.depTime = value;
    }

    public String getTimeInWay() {
        return timeInWay;
    }

    public void setTimeInWay(String value) {
        this.timeInWay = value;
    }

    public RailwayType getRailway() {
        return railway;
    }

    public void setRailway(RailwayType value) {
        this.railway = value;
    }

    public String getDaysOfGo() {
        return daysOfGo;
    }

    public void setDaysOfGo(String value) {
        this.daysOfGo = value;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String value) {
        this.carType = value;
    }

    public List<CarsType> getCars() {
        if (cars == null) {
            cars = new ArrayList<CarsType>();
        }
        return this.cars;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public void setCars(List<CarsType> cars) {
        this.cars = cars;
    }
}
