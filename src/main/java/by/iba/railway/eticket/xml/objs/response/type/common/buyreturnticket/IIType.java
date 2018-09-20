package by.iba.railway.eticket.xml.objs.response.type.common.buyreturnticket;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IIType", propOrder = {
    "value"
})
public class IIType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "WB")
    protected String wb;
    @XmlAttribute(name = "WM")
    protected String wm;
    @XmlAttribute(name = "HP")
    protected String hp;
    @XmlAttribute(name = "DB")
    protected String db;
    @XmlAttribute(name = "HT")
    protected String ht;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    public String getWm() {
        return wm;
    }

    public void setWm(String wm) {
        this.wm = wm;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }
}
