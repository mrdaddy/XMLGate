package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerType", propOrder = {
    "value"
})
public class PassengerType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Doc")
    protected String doc;
    @XmlAttribute(name = "Name")
    protected String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
