package by.iba.railway.eticket.xml.objs.response.type.G46;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainType", propOrder = {
    "car"
})
public class TrainType {

    @XmlElement(name = "Car")
    protected List<CarType> car;
    @XmlAttribute(name = "Number")
    protected String number;

    public List<CarType> getCar() {
        if (car == null) {
            car = new ArrayList<CarType>();
        }
        return this.car;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public void setCar(List<CarType> car) {
        this.car = car;
    }
}
