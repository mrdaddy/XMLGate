package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "train",
    "arvDate"
})
public class ActualArrivalG50Request extends BaseRequest{
    public ActualArrivalG50Request() {
        type = "ActualArrival";
    }

    public ActualArrivalG50Request(TrainType train, String arvDate) {
        this();
        this.train = train;
        this.arvDate = arvDate;
    }

    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "ArvDate", required = true)
    protected String arvDate;

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public String getArvDate() {
        return arvDate;
    }

    public void setArvDate(String arvDate) {
        this.arvDate = arvDate;
    }
}
