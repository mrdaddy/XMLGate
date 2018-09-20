package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerType", propOrder = {
    "value"
})
public class OwnerType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Type")
    protected String type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
