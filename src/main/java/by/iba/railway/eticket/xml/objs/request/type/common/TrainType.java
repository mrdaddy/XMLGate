package by.iba.railway.eticket.xml.objs.request.type.common;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "value"
})
public class TrainType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Number")
    protected String number;

    public TrainType() {
    }

    public TrainType(String number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
