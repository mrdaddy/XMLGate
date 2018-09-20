package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G62.TrainsG62Type;
import by.iba.railway.eticket.xml.objs.response.type.common.PassRouteType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "passRoute",
    "trains"
})
public class TrainCarPlacesG62Response extends BaseResponse {

    @XmlElement(name = "PassRoute", required = true)
    protected PassRouteType passRoute;
    @XmlElement(name = "Trains", required = true)
    protected TrainsG62Type trains;

    public PassRouteType getPassRoute() {
        return passRoute;
    }

    public void setPassRoute(PassRouteType passRoute) {
        this.passRoute = passRoute;
    }

    public TrainsG62Type getTrains() {
        return trains;
    }

    public void setTrains(TrainsG62Type trains) {
        this.trains = trains;
    }

}
