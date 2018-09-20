package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.express.interfaces.Directionsable;
import by.iba.railway.eticket.xml.objs.response.type.G11.DirectionG11Type;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "direction"
})
public class ScheduleRouteG11Response extends BaseResponse implements Directionsable {

    protected List<DirectionG11Type> direction;

    @XmlElement(name = "Direction")
    public List<DirectionG11Type> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionG11Type>();
        }
        return this.direction;
    }

    public void setDirection(List<DirectionG11Type> direction) {
        this.direction = direction;
    }
}
