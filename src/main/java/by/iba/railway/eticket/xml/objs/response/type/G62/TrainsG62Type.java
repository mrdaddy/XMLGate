package by.iba.railway.eticket.xml.objs.response.type.G62;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainsType", propOrder = {
    "train"
})
public class TrainsG62Type {

    @XmlElement(name = "Train", required = true)
    protected List<TrainG62Type> train;
    @XmlAttribute(name = "Date")
    protected String date;

    public List<TrainG62Type> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainG62Type>();
        }
        return this.train;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTrain(List<TrainG62Type> train) {
        this.train = train;
    }
}
