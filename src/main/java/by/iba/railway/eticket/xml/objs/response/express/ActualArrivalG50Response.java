package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G50.TrainType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "train"
})
public class ActualArrivalG50Response extends BaseResponse {

    @XmlElement(name = "Train", required = true)
    protected TrainType train;

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }
}
