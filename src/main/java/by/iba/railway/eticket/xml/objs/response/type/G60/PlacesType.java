package by.iba.railway.eticket.xml.objs.response.type.G60;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacesType", propOrder = {
    "cars"
})
public class PlacesType {

    @XmlElement(name = "Cars")
    protected List<CategoryCarsType> cars;

    public List<CategoryCarsType> getCars() {
        if (cars == null) {
            cars = new ArrayList<CategoryCarsType>();
        }
        return this.cars;
    }

    public void setCars(List<CategoryCarsType> cars) {
        this.cars = cars;
    }
}
