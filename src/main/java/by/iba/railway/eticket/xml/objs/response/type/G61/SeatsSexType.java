package by.iba.railway.eticket.xml.objs.response.type.G61;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatsSexType", propOrder = {
    "value"
})
public class SeatsSexType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SeatsMale")
    protected Integer seatsMale;
    @XmlAttribute(name = "SeatsFemale")
    protected Integer seatsFemale;
    @XmlAttribute(name = "SeatsMixed")
    protected Integer seatsMixed;
    @XmlAttribute(name = "SeatsUndef")
    protected Integer seatsUndef;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getSeatsMale() {
        return seatsMale;
    }

    public void setSeatsMale(Integer seatsMale) {
        this.seatsMale = seatsMale;
    }

    public Integer getSeatsFemale() {
        return seatsFemale;
    }

    public void setSeatsFemale(Integer seatsFemale) {
        this.seatsFemale = seatsFemale;
    }

    public Integer getSeatsMixed() {
        return seatsMixed;
    }

    public void setSeatsMixed(Integer seatsMixed) {
        this.seatsMixed = seatsMixed;
    }

    public Integer getSeatsUndef() {
        return seatsUndef;
    }

    public void setSeatsUndef(Integer seatsUndef) {
        this.seatsUndef = seatsUndef;
    }
}
