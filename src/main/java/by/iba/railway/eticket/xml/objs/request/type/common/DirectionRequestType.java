package by.iba.railway.eticket.xml.objs.request.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionRequestType", propOrder = {
    "depDate",
    "fullDay",
    "depTime",
    "arvTime",
    "carrier"
})
public class DirectionRequestType {

    @XmlElement(name = "DepDate", required = true)
    protected Time depDate;
    @XmlElement(name = "FullDay", required = true)
    protected String fullDay;
    @XmlElement(name = "DepTime", required = true)
    protected Time depTime;
    @XmlElement(name = "ArvTime", required = true)
    protected Time arvTime;
    @XmlElement(name = "Carrier", required = false)
    protected String carrier;
    @XmlAttribute(name = "Type")
    protected String type;

    public Time getDepDate() {
        return depDate;
    }

    public void setDepDate(Time value) {
        this.depDate = value;
    }

    public String getFullDay() {
        return fullDay;
    }

    public void setFullDay(String value) {
        this.fullDay = value;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time value) {
        this.depTime = value;
    }

    public Time getArvTime() {
        return arvTime;
    }

    public void setArvTime(Time value) {
        this.arvTime = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
