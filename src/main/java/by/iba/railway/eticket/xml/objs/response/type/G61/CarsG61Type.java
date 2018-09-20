package by.iba.railway.eticket.xml.objs.response.type.G61;

import by.iba.railway.eticket.xml.objs.response.type.common.CarrierType;
import by.iba.railway.eticket.xml.objs.response.type.common.ClassServiceType;
import by.iba.railway.eticket.xml.objs.response.type.common.OwnerType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarsG61Type", propOrder = {
    "classService",
    "classServiceInt",
    "addSigns",
    "tariff",
    "tariff2",
    "tariffService",
    "carrier",
    "owner",
    "saleOnTwo",
    "saleOnFour",
    "sellingInternetForbidden",
    "car",
    "modificators",
    "uz"

})

public class CarsG61Type {

    @XmlElement(name = "ClassService", required = true)
    protected ClassServiceType classService;
    @XmlElement(name = "ClassServiceInt", required = true)
    protected String classServiceInt;
    @XmlElement(name = "AddSigns", required = true)
    protected String addSigns;
    @XmlElement(name = "Tariff")
    protected Float tariff;
    @XmlElement(name = "Tariff2")
    protected Float tariff2;
    @XmlElement(name = "TariffService")
    protected Float tariffService;
    @XmlElement(name = "Carrier", required = true)
    protected CarrierType carrier;
    @XmlElement(name = "Owner", required = true)
    protected OwnerType owner;
    @XmlElement(name = "SaleOnTwo", required = true)
    protected String saleOnTwo;
    @XmlElement(name = "SaleOnFour", required = true)
    protected String saleOnFour;
    @XmlElement(name = "SellingInternetForbidden")
    protected String sellingInternetForbidden;
    @XmlElement(name = "Car")
    protected List<CarG61Type> car;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeShow")
    private String typeShow;
    @XmlAttribute(name = "TrainLetter")
    protected String trainLetter;
    @XmlElement(name = "Modificators")
    protected ModificatorsType modificators;
    @XmlElement(name = "UZ")
    protected String uz;

    public List<CarG61Type> getCar() {
        if (car == null) {
            car = new ArrayList<CarG61Type>();
        }
        return this.car;
    }

    public ClassServiceType getClassService() {
        return classService;
    }

    public void setClassService(ClassServiceType classService) {
        this.classService = classService;
    }

    public String getClassServiceInt() {
        return classServiceInt;
    }

    public void setClassServiceInt(String classServiceInt) {
        this.classServiceInt = classServiceInt;
    }

    public String getAddSigns() {
        return addSigns;
    }

    public void setAddSigns(String addSigns) {
        this.addSigns = addSigns;
    }

    public Float getTariff() {
        return tariff;
    }

    public void setTariff(Float tariff) {
        this.tariff = tariff;
    }

    public Float getTariff2() {
        return tariff2;
    }

    public void setTariff2(Float tariff2) {
        this.tariff2 = tariff2;
    }

    public Float getTariffService() {
        return tariffService;
    }

    public void setTariffService(Float tariffService) {
        this.tariffService = tariffService;
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

    public String getSaleOnTwo() {
        return saleOnTwo;
    }

    public void setSaleOnTwo(String saleOnTwo) {
        this.saleOnTwo = saleOnTwo;
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

    public String getSaleOnFour() {
        return saleOnFour;
    }

    public void setSaleOnFour(String saleOnFour) {
        this.saleOnFour = saleOnFour;
    }

    public void setCar(List<CarG61Type> car) {
        this.car = car;
    }

    public ModificatorsType getModificators() {
        return modificators;
    }

    public void setModificators(ModificatorsType modificators) {
        this.modificators = modificators;
    }

    public String getUz() {
        return uz;
    }

    public void setUz(String uz) {
        this.uz = uz;
    }

    public String getTypeShow() {
        return typeShow;
    }

    public void setTypeShow(String typeShow) {
        this.typeShow = typeShow;
    }

    public String getSellingInternetForbidden() {
        return sellingInternetForbidden;
    }

    public void setSellingInternetForbidden(String sellingInternetForbidden) {
        this.sellingInternetForbidden = sellingInternetForbidden;
    }
}
