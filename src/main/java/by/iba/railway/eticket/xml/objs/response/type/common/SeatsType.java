package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatsType", propOrder = {
    "value"
})
public class SeatsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SeatsUndef")
    protected Integer seatsUndef;
    @XmlAttribute(name = "SeatsDn")
    protected Integer seatsDn;
    @XmlAttribute(name = "SeatsUp")
    protected Integer seatsUp;
    @XmlAttribute(name = "SeatsLateralDn")
    protected Integer seatsLateralDn;
    @XmlAttribute(name = "SeatsLateralUp")
    protected Integer seatsLateralUp;
    @XmlAttribute(name = "FreeComp")
    protected Integer freeComp;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getSeatsUndef() {
        return seatsUndef;
    }

    public void setSeatsUndef(Integer seatsUndef) {
        this.seatsUndef = seatsUndef;
    }

    public Integer getSeatsDn() {
        return seatsDn;
    }

    public void setSeatsDn(Integer seatsDn) {
        this.seatsDn = seatsDn;
    }

    public Integer getSeatsUp() {
        return seatsUp;
    }

    public void setSeatsUp(Integer seatsUp) {
        this.seatsUp = seatsUp;
    }

    public Integer getSeatsLateralDn() {
        return seatsLateralDn;
    }

    public void setSeatsLateralDn(Integer seatsLateralDn) {
        this.seatsLateralDn = seatsLateralDn;
    }

    public Integer getSeatsLateralUp() {
        return seatsLateralUp;
    }

    public void setSeatsLateralUp(Integer seatsLateralUp) {
        this.seatsLateralUp = seatsLateralUp;
    }

    public Integer getFreeComp() {
        return freeComp;
    }

    public void setFreeComp(Integer freeComp) {
        this.freeComp = freeComp;
    }
}
