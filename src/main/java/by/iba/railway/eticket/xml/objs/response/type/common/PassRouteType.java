package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassRouteType", propOrder = {
    "value"
})
public class PassRouteType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "From")
    protected String from;
    @XmlAttribute(name = "To")
    protected String to;
    @XmlAttribute(name = "CodeFrom")
    protected String codeFrom;
    @XmlAttribute(name = "CodeTo")
    protected String codeTo;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String value) {
        this.from = value;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String value) {
        this.to = value;
    }

    public String getCodeFrom() {
        return codeFrom;
    }

    public void setCodeFrom(String codeFrom) {
        this.codeFrom = codeFrom;
    }

    public String getCodeTo() {
        return codeTo;
    }

    public void setCodeTo(String codeTo) {
        this.codeTo = codeTo;
    }
}
