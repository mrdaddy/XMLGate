package by.iba.railway.eticket.xml.objs.response.type.G62;

import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerG62Type", propOrder = {
    "country",
    "railway"
})
public class OwnerG62Type {

    @XmlElement(name = "Country", required = true)
    protected CountryG62Type country;
    @XmlElement(name = "Railway", required = true)
    protected RailwayType railway;
    @XmlAttribute(name = "Type")
    protected String type;

    public CountryG62Type getCountry() {
        return country;
    }

    public void setCountry(CountryG62Type country) {
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
