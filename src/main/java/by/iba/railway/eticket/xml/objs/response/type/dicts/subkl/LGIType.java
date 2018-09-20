package by.iba.railway.eticket.xml.objs.response.type.dicts.subkl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LGIType", propOrder = {
    "l1",
    "nm",
    "gvc",
    "p"
})
public class LGIType {

    @XmlElement(name = "L1", required = true)
    protected String l1;
    @XmlElement(name = "NM", required = true)
    protected String nm;
    @XmlElement(name = "GVC")
    protected Integer gvc;
    @XmlElement(name = "P")
    protected Integer p;

    public String getL1() {
        return l1;
    }

    public void setL1(String value) {
        this.l1 = value;
    }

    public String getNM() {
        return nm;
    }

    public void setNM(String value) {
        this.nm = value;
    }

    public Integer getGVC() {
        return gvc;
    }

    public void setGVC(Integer value) {
        this.gvc = value;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer value) {
        this.p = value;
    }

}
