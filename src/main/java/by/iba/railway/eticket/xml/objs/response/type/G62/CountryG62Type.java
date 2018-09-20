package by.iba.railway.eticket.xml.objs.response.type.G62;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "name2",
    "distance",
    "tariffBillet"
})
public class CountryG62Type {

    @XmlElement(name = "Name")
    protected String name2;
    @XmlElement(name = "Distance")
    protected String distance;
    @XmlElement(name = "TariffBillet")
    protected String tariffBillet;
    @XmlAttribute(name = "Code")
    protected Integer code;
    @XmlAttribute(name = "Name")
    protected String name;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTariffBillet() {
        return tariffBillet;
    }

    public void setTariffBillet(String tariffBillet) {
        this.tariffBillet = tariffBillet;
    }
}
