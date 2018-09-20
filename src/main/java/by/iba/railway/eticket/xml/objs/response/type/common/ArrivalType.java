package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalType", propOrder = {
    "value"
})
public class ArrivalType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "Time")
    protected String time;
    @XmlAttribute(name = "Stop")
    protected String stop;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String value) {
        this.time = value;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String value) {
        this.stop = value;
    }

}
