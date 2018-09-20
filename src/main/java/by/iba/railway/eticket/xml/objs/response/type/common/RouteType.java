package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteType", propOrder = {
    "station"
})
public class RouteType {

    @XmlElement(name = "Station")
    protected List<String> station;
    @XmlAttribute(name = "CodeFrom")
    protected String codeFrom;
    @XmlAttribute(name = "CodeTo")
    protected String codeTo;

    public List<String> getStation() {
        if (station == null) {
            station = new ArrayList<String>();
        }
        return this.station;
    }

    public String getCodeFrom() {
        return codeFrom;
    }

    public void setCodeFrom(String codeFrom) {
        this.codeFrom = codeFrom;
    }

    public String getCodeTo() {
        return codeTo;
    }

    public void setCodeTo(String codeTo) {
        this.codeTo = codeTo;
    }

    public void setStation(List<String> station) {
        this.station = station;
    }
}
