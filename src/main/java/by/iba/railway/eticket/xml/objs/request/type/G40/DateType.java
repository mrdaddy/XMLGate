package by.iba.railway.eticket.xml.objs.request.type.G40;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "value"
})
public class DateType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "From")
    protected String from;
    @XmlAttribute(name = "To")
    protected String to;

    public DateType() {
    }

    public DateType(String value) {
        this.value = value;
    }

    public DateType(String from, String to) {
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

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
