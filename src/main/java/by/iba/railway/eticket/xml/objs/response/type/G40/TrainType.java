package by.iba.railway.eticket.xml.objs.response.type.G40;

import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "route",
    "dateTimeInfo",
    "daysOfGo"
})
public class TrainType {

    @XmlElement(name = "Route", required = true)
    protected RouteType route;
    @XmlElement(name = "DateTimeInfo", required = true)
    protected String dateTimeInfo;
    @XmlElement(name = "DaysOfGo", required = true)
    protected String daysOfGo;
    @XmlAttribute(name = "Number")
    protected String number;

    public RouteType getRoute() {
        return route;
    }

    public void setRoute(RouteType route) {
        this.route = route;
    }

    public String getDateTimeInfo() {
        return dateTimeInfo;
    }

    public void setDateTimeInfo(String dateTimeInfo) {
        this.dateTimeInfo = dateTimeInfo;
    }

    public String getDaysOfGo() {
        return daysOfGo;
    }

    public void setDaysOfGo(String daysOfGo) {
        this.daysOfGo = daysOfGo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
