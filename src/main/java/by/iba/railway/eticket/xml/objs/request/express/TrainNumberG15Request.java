package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "train"
})
public class TrainNumberG15Request extends BaseRequest {

    @XmlElement(name = "Train", required = true)
    protected String train;

    public TrainNumberG15Request() {
        this.type = "TrainNumber";
    }

    public TrainNumberG15Request(String train) {
        this();
        this.train = train;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

}
