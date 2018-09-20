package by.iba.railway.eticket.xml.objs.request.type.buyticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementsType", propOrder = {
    "seatsTop",
    "seatsBottom",
    "seatsRange",
    "seatsComp",
    "woBedding",
    "compType"
})
public class RequirementsType {

    @XmlElement(name = "SeatsTop", required = true)
    protected String seatsTop;
    @XmlElement(name = "SeatsBottom", required = true)
    protected String seatsBottom;
    @XmlElement(name = "SeatsRange", required = true)
    protected String seatsRange;
    @XmlElement(name = "SeatsComp", required = true)
    protected String seatsComp;
    @XmlElement(name = "WoBedding", required = true)
    protected String woBedding;
    @XmlElement(name = "CompType", required = true)
    protected String compType;

    public String getSeatsTop() {
        return seatsTop;
    }

    public void setSeatsTop(String seatsTop) {
        this.seatsTop = seatsTop;
    }

    public String getSeatsBottom() {
        return seatsBottom;
    }

    public void setSeatsBottom(String seatsBottom) {
        this.seatsBottom = seatsBottom;
    }

    public String getSeatsRange() {
        return seatsRange;
    }

    public void setSeatsRange(String seatsRange) {
        this.seatsRange = seatsRange;
    }

    public String getSeatsComp() {
        return seatsComp;
    }

    public void setSeatsComp(String seatsComp) {
        this.seatsComp = seatsComp;
    }

    public String getWoBedding() {
        return woBedding;
    }

    public void setWoBedding(String woBedding) {
        this.woBedding = woBedding;
    }

    public String getCompType() {
        return compType;
    }

    public void setCompType(String compType) {
        this.compType = compType;
    }
}
