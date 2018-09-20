package by.iba.railway.eticket.xml.objs.response.type.G50;

import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;
import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route",
    "dateAndTimeByDeparture",
    "arvSchedule",
    "delayTime",
    "arvActual",
    "station"
})
public class TrainType {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "DateAndTimeByDeparture", required = true)
    protected String dateAndTimeByDeparture;
    @XmlElement(name = "ArvSchedule", required = true)
    protected DateTime arvSchedule;
    @XmlElement(name = "DelayTime", required = true)
    protected String delayTime;
    @XmlElement(name = "ArvActual", required = true)
    protected DateTime arvActual;
    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlAttribute(name = "Number")
    protected String number;

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
    }

    public String getDateAndTimeByDeparture() {
        return dateAndTimeByDeparture;
    }

    public void setDateAndTimeByDeparture(String dateAndTimeByDeparture) {
        this.dateAndTimeByDeparture = dateAndTimeByDeparture;
    }

    public DateTime getArvSchedule() {
        return arvSchedule;
    }

    public void setArvSchedule(DateTime arvSchedule) {
        this.arvSchedule = arvSchedule;
    }

    public String getDelayTime() {
        return delayTime;
    }

    public DateTime getArvActual() {
        return arvActual;
    }

    public void setArvActual(DateTime arvActual) {
        this.arvActual = arvActual;
    }

    public void setDelayTime(String delayTime) {
        this.delayTime = delayTime;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
