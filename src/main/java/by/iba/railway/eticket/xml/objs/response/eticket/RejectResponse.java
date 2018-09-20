package by.iba.railway.eticket.xml.objs.response.eticket;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtETicket_Response")
@XmlType(name = "GtETicket_ResponseType", propOrder = {
    "order"
})
public class RejectResponse extends BaseResponse{

    @XmlElement(name = "Order", required = true)
    protected BaseOrderType order;

    public BaseOrderType getOrder() {
        return order;
    }

    public void setOrder(BaseOrderType order) {
        this.order = order;
    }
}
