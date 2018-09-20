package by.iba.railway.eticket.xml.objs.response.type.G51;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalType", propOrder = {
    "value"
})
public class ArrivalG51Type {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ScheduleTime")
    protected String scheduleTime;
    @XmlAttribute(name = "DelayTime")
    protected String delayTime;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(String delayTime) {
        this.delayTime = delayTime;
    }
}
