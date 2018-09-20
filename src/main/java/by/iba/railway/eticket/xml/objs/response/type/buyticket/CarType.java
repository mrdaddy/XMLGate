package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import by.iba.railway.eticket.xml.objs.response.type.common.CarrierType;
import by.iba.railway.eticket.xml.objs.response.type.common.ClassServiceType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {
    "classService",
    "addSigns",
    "carrier",
    "owner",
    "tripClass"
})
public class CarType {

    @XmlElement(name = "ClassService", required = true)
    protected ClassServiceType classService;
    @XmlElement(name = "AddSigns", required = true)
    protected String addSigns;
    @XmlElement(name = "Carrier", required = true)
    protected by.iba.railway.eticket.xml.objs.response.type.common.CarrierType carrier;
    @XmlElement(name = "Owner", required = true)
    protected OwnerType owner;
    @XmlElement(name = "TripClass")
    protected Integer tripClass;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Type")
    protected String type;

    public ClassServiceType getClassService() {
        return classService;
    }

    public void setClassService(ClassServiceType classService) {
        this.classService = classService;
    }

    public String getAddSigns() {
        return addSigns;
    }

    public void setAddSigns(String addSigns) {
        this.addSigns = addSigns;
    }

    public CarrierType getCarrier() {
        return carrier;
    }

    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    public OwnerType getOwner() {
        return owner;
    }

    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    public Integer getTripClass() {
        return tripClass;
    }

    public void setTripClass(Integer tripClass) {
        this.tripClass = tripClass;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
