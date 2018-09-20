package by.iba.railway.eticket.xml.objs.response.type.expressstatus;

import by.iba.railway.eticket.xml.objs.response.type.common.BaseTicketType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "_return"
})
public class TicketType extends BaseTicketType{

    @XmlElement(name = "Return", required = true)
    protected ReturnType _return;
    @XmlAttribute(name = "State")
    protected Integer state;

    public ReturnType get_return() {
        return _return;
    }

    public void set_return(ReturnType _return) {
        this._return = _return;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
