package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G40.TrainType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "train"
})
public class AppointCancelTrainsG40Response extends BaseResponse{

    @XmlElement(name = "Train")
    protected List<TrainType> train;

    public List<TrainType> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainType>();
        }
        return this.train;
    }

    public void setTrain(List<TrainType> train) {
        this.train = train;
    }
}
