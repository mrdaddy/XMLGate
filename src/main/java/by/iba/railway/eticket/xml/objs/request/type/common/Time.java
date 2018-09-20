package by.iba.railway.eticket.xml.objs.request.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "value"
})
public class Time {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "From")
    protected String from;
    @XmlAttribute(name = "To")
    protected String to;

    public Time() {
    }

    public Time(String from, String to, String value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public Time(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String value) {
        this.from = value;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String value) {
        this.to = value;
    }

}
