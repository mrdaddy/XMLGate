package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierType", namespace = "by.iba.railway.eticket.xml.objs.response.type.buyticket", propOrder = {
    "value"
})
public class CarrierType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Code")
    protected Integer code;
    @XmlAttribute(name = "Inn")
    protected String inn;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

}
