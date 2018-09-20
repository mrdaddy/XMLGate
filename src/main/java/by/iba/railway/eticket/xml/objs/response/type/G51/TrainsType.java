package by.iba.railway.eticket.xml.objs.response.type.G51;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainsType", propOrder = {
    "train"
})
public class TrainsType {

    @XmlElement(name = "Train")
    protected List<TrainType> train;

    public List<TrainType> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainType>();
        }
        return this.train;
    }

}
