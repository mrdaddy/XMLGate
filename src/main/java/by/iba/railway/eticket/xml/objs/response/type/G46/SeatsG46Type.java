package by.iba.railway.eticket.xml.objs.response.type.G46;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatsType", propOrder = {
    "value"
})
public class SeatsG46Type {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "First")
    protected Integer first;
    @XmlAttribute(name = "Last")
    protected Integer last;
    @XmlAttribute(name = "Count")
    protected Integer count;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
