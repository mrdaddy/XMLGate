package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CountryType", propOrder = {
    "code",
    "tlf",
    "name"
})
public class CountryType {
  
    protected String code;    
    protected String tlf;    
    protected String name;
    
    @XmlAttribute(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }
    @XmlAttribute(name = "Tlf")
    public String getTlf() {
        return tlf;
    }

    public void setTlf(String value) {
        this.tlf = value;
    }
    @XmlAttribute(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}