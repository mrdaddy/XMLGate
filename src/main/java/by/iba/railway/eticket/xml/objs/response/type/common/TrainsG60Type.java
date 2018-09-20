package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainsType", propOrder = {
    "train"
})
public class TrainsG60Type {

    @XmlElement(name = "Train")
    protected List<TrainG60Type> train;
    @XmlAttribute(name = "Date")
    protected String date;

    public List<TrainG60Type> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainG60Type>();
        }
        return this.train;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public void setTrain(List<TrainG60Type> train) {
        this.train = train;
    }
}
