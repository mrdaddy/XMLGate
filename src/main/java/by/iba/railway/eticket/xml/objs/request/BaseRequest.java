package by.iba.railway.eticket.xml.objs.request;


import javax.xml.bind.annotation.XmlAttribute;

public class BaseRequest {

    protected String type;
    
    @XmlAttribute(name = "Type", required = true)
    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }
}

