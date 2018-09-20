package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatsType", propOrder = {
    "value"
})
public class SeatsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Count")
    protected Integer count;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
