package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElRegPossibleType", propOrder = {
    "uk",
    "akp"
})
public class ElRegPossibleType {

    @XmlElement(name = "UK", required = true)
    protected String uk;
    @XmlElement(name = "AKP", required = true)
    protected String akp;

    public String getUK() {
        return uk;
    }

    public void setUK(String value) {
        this.uk = value;
    }

    public String getAKP() {
        return akp;
    }

    public void setAKP(String value) {
        this.akp = value;
    }

}
