package by.iba.railway.eticket.xml.objs.response.type.G11;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.express.interfaces.Direction;
import by.iba.railway.eticket.xml.objs.response.type.common.PassRouteType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionG11Type", propOrder = {
    "trains",
    "notAllTrains",
    "passRoute"
})
public class DirectionG11Type extends BaseResponse implements Direction{
    @XmlElement(name = "Trains")
    protected List<TrainsType> trains;
    @XmlElement(name = "NotAllTrains")
    protected String notAllTrains;
    @XmlElement(name = "PassRoute")
    protected PassRouteType passRoute;

    public List<TrainsType> getTrains() {
        if(trains == null)
            trains = new ArrayList<TrainsType>();
        return trains;
    }

    public String getNotAllTrains() {
        return notAllTrains;
    }

    public void setNotAllTrains(String notAllTrains) {
        this.notAllTrains = notAllTrains;
    }

    public PassRouteType getPassRoute() {
        return passRoute;
    }

    public void setPassRoute(PassRouteType passRoute) {
        this.passRoute = passRoute;
    }

    public void setTrains(List<TrainsType> trains) {
        this.trains = trains;
    }
}
