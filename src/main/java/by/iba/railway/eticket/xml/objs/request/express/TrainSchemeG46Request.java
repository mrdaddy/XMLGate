package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "train",
    "date"
})
public class TrainSchemeG46Request extends BaseRequest{

    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "Date", required = true)
    protected String date;

    public TrainSchemeG46Request() {
        this.type = "TrainScheme";
    }

    public TrainSchemeG46Request(TrainType train, String date) {
        this();
        this.train = train;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }
}
