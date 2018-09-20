package by.iba.railway.eticket.xml.objs.response.type.G61;

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
@XmlType(name = "DirectionG61Type", propOrder = {
    "passRoute",
    "notAllTrains",
    "trains"
})
public class DirectionG61Type extends BaseResponse implements Direction{
    @XmlElement(name = "PassRoute")
    protected PassRouteType passRoute;
    @XmlElement(name = "NotAllTrains")
    protected String notAllTrains;
    @XmlElement(name = "Trains")
    protected List<TrainsG61Type> trains;

    public List<TrainsG61Type> getTrains() {
        if (trains == null) {
            trains = new ArrayList<TrainsG61Type>();
        }
        return this.trains;
    }

    public PassRouteType getPassRoute() {
        return passRoute;
    }

    public void setPassRoute(PassRouteType passRoute) {
        this.passRoute = passRoute;
    }

    public String getNotAllTrains() {
        return notAllTrains;
    }

    public void setNotAllTrains(String notAllTrains) {
        this.notAllTrains = notAllTrains;
    }

    public void setTrains(List<TrainsG61Type> trains) {
        this.trains = trains;
    }
}
