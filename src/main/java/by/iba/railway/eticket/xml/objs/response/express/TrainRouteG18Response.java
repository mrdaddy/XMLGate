package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G18.RoutesType;
import by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "train",
    "routes"
})
public class TrainRouteG18Response extends BaseResponse {

    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "Routes")
    protected List<RoutesType> routes;

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public List<RoutesType> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesType> routes) {
        this.routes = routes;
    }
}
