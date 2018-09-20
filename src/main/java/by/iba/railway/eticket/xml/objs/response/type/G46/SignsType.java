package by.iba.railway.eticket.xml.objs.response.type.G46;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignsType", propOrder = {
    "sign"
})
public class SignsType {

    @XmlElement(name = "Sign")
    protected List<String> sign;

    public List<String> getSign() {
        if (sign == null) {
            sign = new ArrayList<String>();
        }
        return this.sign;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }
}
