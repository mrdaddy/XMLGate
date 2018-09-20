package by.iba.railway.eticket.xml.objs.request.type.G61;

import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionType", propOrder = {
    "depDate",
    "depTime",
    "train"
})
public class DirectionType {

    @XmlElement(name = "DepDate", required = true)
    protected String depDate;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlAttribute(name = "Type")
    protected String type;

    public DirectionType() {
    }

    public DirectionType(String depDate, String depTime, String type, TrainType train) {
        this.depDate = depDate;
        this.depTime = depTime;
        this.train = train;
        this.type = type;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
