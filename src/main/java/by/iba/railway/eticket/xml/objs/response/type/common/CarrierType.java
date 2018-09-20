package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierType", namespace = "by.iba.railway.eticket.xml.objs.response.type.common", propOrder = {
    "value"
})
public class CarrierType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Name")
    protected String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
