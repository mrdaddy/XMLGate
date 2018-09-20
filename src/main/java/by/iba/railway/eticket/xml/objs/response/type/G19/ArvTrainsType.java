package by.iba.railway.eticket.xml.objs.response.type.G19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArvTrainsType", propOrder = {
    "train"
})
public class ArvTrainsType {
	@XmlElement(name = "Train")
    protected List<TrainG19Type> train;
   
    public List<TrainG19Type> getTrain() {
        if (train == null) {
            train = new ArrayList<TrainG19Type>();
        }
        return this.train;
    }

    public void setTrain(List<TrainG19Type> train) {
        this.train = train;
    }
}
