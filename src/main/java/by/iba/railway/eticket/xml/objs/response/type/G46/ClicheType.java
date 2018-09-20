package by.iba.railway.eticket.xml.objs.response.type.G46;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClicheType", propOrder = {
    "station",
    "seats"
})
public class ClicheType {

    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "Seats", required = true)
    protected SeatsG46Type seats;

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public SeatsG46Type getSeats() {
        return seats;
    }

    public void setSeats(SeatsG46Type seats) {
        this.seats = seats;
    }
}
