package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerType", propOrder = {
    "country",
    "railway"
})
public class OwnerType {

    @XmlElement(name = "Country", required = true)
    protected CountryType country;
    @XmlElement(name = "Railway", required = true)
    protected RailwayType railway;
    @XmlAttribute(name = "Type")
    protected String type;

    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType country) {
        this.country = country;
    }

    public RailwayType getRailway() {
        return railway;
    }

    public void setRailway(RailwayType railway) {
        this.railway = railway;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
