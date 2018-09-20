package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseOrderType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ExpressID")
    protected String expressID;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpressID() {
        return expressID;
    }

    public void setExpressID(String expressID) {
        this.expressID = expressID;
    }
}
