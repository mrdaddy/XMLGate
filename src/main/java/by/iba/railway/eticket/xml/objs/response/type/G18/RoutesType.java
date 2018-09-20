package by.iba.railway.eticket.xml.objs.response.type.G18;

import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesType", propOrder = {
    "title",
    "route",
    "stop"
})
public class RoutesType {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Route")
    protected List<RouteType> route;
    @XmlElement(name = "Stop")
    protected List<StopType> stop;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<RouteType> getRoute() {
        if (route == null) {
            route = new ArrayList<RouteType>();
        }
        return this.route;
    }
    public List<StopType> getStop() {
        if (stop == null) {
            stop = new ArrayList<StopType>();
        }
        return this.stop;
    }

    public void setRoute(List<RouteType> route) {
        this.route = route;
    }

    public void setStop(List<StopType> stop) {
        this.stop = stop;
    }
}
