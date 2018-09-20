package by.iba.railway.eticket.xml.objs.response.type.dicts;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationsType", propOrder = {
    "value"
})
public class StationsType {
//TODO remove unused xmlValue, value
    @XmlValue
    protected String value;
    @XmlAttribute(name = "LastUpdate")
    protected String lastUpdate;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

}
