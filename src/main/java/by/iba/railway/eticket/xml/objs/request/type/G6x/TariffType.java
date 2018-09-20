package by.iba.railway.eticket.xml.objs.request.type.G6x;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffType", propOrder = {
    "value"
})
public class TariffType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Type")
    protected String type;

    public TariffType() {
    }

    public TariffType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
