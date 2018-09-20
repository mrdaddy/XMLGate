package by.iba.railway.eticket.xml.objs.response.type.G60;

import by.iba.railway.eticket.xml.objs.response.type.common.*;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffType", propOrder = {
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
    "elRegPossible",
    "seats"
})
public class TariffType {

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
    @XmlElement(name = "ElRegPossible", required = true)
    protected ElRegPossibleType elRegPossible;
    @XmlElement(name = "Seats", required = true)
    protected SeatsType seats;

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

    public ElRegPossibleType getElRegPossible() {
        return elRegPossible;
    }

    public void setElRegPossible(ElRegPossibleType elRegPossible) {
        this.elRegPossible = elRegPossible;
    }

    public SeatsType getSeats() {
        return seats;
    }

    public void setSeats(SeatsType seats) {
        this.seats = seats;
    }

    public String getSaleOnFour() {
        return saleOnFour;
    }

    public void setSaleOnFour(String saleOnFour) {
        this.saleOnFour = saleOnFour;
    }

    public String getSellingInternetForbidden() {
        return sellingInternetForbidden;
    }

    public void setSellingInternetForbidden(String sellingInternetForbidden) {
        this.sellingInternetForbidden = sellingInternetForbidden;
    }
}
