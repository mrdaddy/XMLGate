package by.iba.railway.eticket.xml.objs.response.type.G61;

import by.iba.railway.eticket.xml.objs.response.express.interfaces.Trains;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainsType", propOrder = {
    "train"
})
public class TrainsG61Type implements Trains{

    @XmlElement(name = "Train")
    protected List<TrainG61Type> train;
    @XmlAttribute(name = "Date")
    protected String date;

    public List<TrainG61Type> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainG61Type>();
        }
        return this.train;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public void setTrain(List<TrainG61Type> train) {
        this.train = train;
    }
}
