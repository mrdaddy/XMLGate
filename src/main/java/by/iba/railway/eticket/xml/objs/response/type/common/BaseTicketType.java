package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class BaseTicketType {

    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ExpressID")
    protected String expressID;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpressID() {
        return expressID;
    }

    public void setExpressID(String expressID) {
        this.expressID = expressID;
    }
}
