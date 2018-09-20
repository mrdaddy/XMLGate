package by.iba.railway.eticket.xml.objs.response.type.G62;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {
    "fare"
})
public class CarG62Type {

    @XmlElement(name = "Fare")
    protected List<FareType> fare;
    @XmlAttribute(name = "Number")
    protected Integer number;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "SubType")
    private String subType;
    @XmlAttribute(name = "TrainLetter")
    protected String trainLetter;
    @XmlAttribute(name = "TypeShow")
    private String typeShow;

    public List<FareType> getFare() {
        if (fare == null) {
            fare = new ArrayList<FareType>();
        }
        return this.fare;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrainLetter() {
        return trainLetter;
    }

    public void setTrainLetter(String trainLetter) {
        this.trainLetter = trainLetter;
    }

    public void setFare(List<FareType> fare) {
        this.fare = fare;
    }

    public String getTypeShow() {
        return typeShow;
    }

    public void setTypeShow(String typeShow) {
        this.typeShow = typeShow;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
