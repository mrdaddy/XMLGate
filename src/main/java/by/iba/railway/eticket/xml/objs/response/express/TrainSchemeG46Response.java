package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G46.TrainType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "train",
    "signsInfo"
})
public class TrainSchemeG46Response extends BaseResponse{

    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "SignsInfo", required = true)
    protected String signsInfo;

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType value) {
        this.train = value;
    }

    public String getSignsInfo() {
        return signsInfo;
    }

    public void setSignsInfo(String value) {
        this.signsInfo = value;
    }

}
