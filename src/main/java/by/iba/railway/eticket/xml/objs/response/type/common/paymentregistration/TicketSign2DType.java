package by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration;

import by.iba.railway.eticket.xml.objs.response.type.common.BaseTicketType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "sign2D"
})
public class TicketSign2DType extends BaseTicketType{

    @XmlElement(name = "Sign2D", required = true)
    protected String sign2D;

    public String getSign2D() {
        return sign2D;
    }

    public void setSign2D(String sign2D) {
        this.sign2D = sign2D;
    }
}
