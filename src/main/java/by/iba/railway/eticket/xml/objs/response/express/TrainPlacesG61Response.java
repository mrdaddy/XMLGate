package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G61.DirectionG61Type;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "direction"
})
public class TrainPlacesG61Response extends BaseResponse {

    @XmlElement(name = "Direction")
    protected List<DirectionG61Type> direction;
    @XmlAttribute(name = "ShowWithoutPlaces")
    protected String showWithoutPlaces;

    public List<DirectionG61Type> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionG61Type>();
        }
        return this.direction;
    }

    public String getShowWithoutPlaces() {
        return showWithoutPlaces;
    }

    public void setShowWithoutPlaces(String value) {
        this.showWithoutPlaces = value;
    }

    public void setDirection(List<DirectionG61Type> direction) {
        this.direction = direction;
    }
}
