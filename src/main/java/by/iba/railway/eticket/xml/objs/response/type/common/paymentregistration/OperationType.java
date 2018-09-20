package by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration;

import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OperationType")
 public class OperationType extends DateTime {
    @XmlAttribute(name = "HP")
    protected String HP;
    @XmlAttribute(name = "DB")
    protected String DB;
    @XmlAttribute(name = "HT")
    protected String HT;

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getDB() {
        return DB;
    }

    public void setDB(String DB) {
        this.DB = DB;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }
}
