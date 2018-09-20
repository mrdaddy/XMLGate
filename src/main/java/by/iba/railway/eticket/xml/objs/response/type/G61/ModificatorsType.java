package by.iba.railway.eticket.xml.objs.response.type.G61;

import by.iba.railway.eticket.xml.objs.response.type.common.ArrivalType;
import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;
import by.iba.railway.eticket.xml.objs.response.type.common.DepartureType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Dzemianchyk_AI on 05.11.2015.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificatorsType", propOrder = {
        "type",
        "departure",
        "timeInWay",
        "arrival",
        "departureTrain",
        "length"


})
public class ModificatorsType {
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "Departure")
    private DepartureType departure;
    @XmlElement(name = "TimeInWay")
    private String timeInWay;
    @XmlElement(name = "Arrival")
    private ArrivalType arrival;
    @XmlElement(name = "DepartureTrain")
    private DateTime departureTrain;
    @XmlElement(name = "Length")
    private String length;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DepartureType getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureType departure) {
        this.departure = departure;
    }

    public String getTimeInWay() {
        return timeInWay;
    }

    public void setTimeInWay(String timeInWay) {
        this.timeInWay = timeInWay;
    }

    public ArrivalType getArrival() {
        return arrival;
    }

    public void setArrival(ArrivalType arrival) {
        this.arrival = arrival;
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
}
