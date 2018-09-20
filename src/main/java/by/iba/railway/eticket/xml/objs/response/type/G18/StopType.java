package by.iba.railway.eticket.xml.objs.response.type.G18;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
    "arvTime",
    "waitingTime",
    "depTime",
    "sign",
    "days",
    "distance"
})
public class StopType {

    @XmlElement(name = "ArvTime", required = true)
    protected String arvTime;
    @XmlElement(name = "WaitingTime", required = true)
    protected String waitingTime;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "Sign", required = true)
    protected String sign;
    @XmlElement(name = "Days")
    protected Integer days;
    @XmlElement(name = "Distance")
    protected Integer distance;
    @XmlAttribute(name = "Station")
    protected String station;
    @XmlAttribute(name = "Code")
    protected Integer code;

    public String getArvTime() {
        return arvTime;
    }

    public void setArvTime(String arvTime) {
        this.arvTime = arvTime;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
