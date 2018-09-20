package by.iba.railway.eticket.xml.objs.response.type.G62;

import by.iba.railway.eticket.xml.objs.response.type.common.CarrierType;
import by.iba.railway.eticket.xml.objs.response.type.common.ClassServiceType;
import by.iba.railway.eticket.xml.objs.response.type.common.ElRegPossibleType;
import by.iba.railway.eticket.xml.objs.response.type.common.SeatsType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "classService",
    "classServiceInt",
    "addSigns",
    "tariff",
    "tariffService",
    "tariffBillet",
    "tariffPlac",
    "carrier",
    "owner",
    "saleOnTwo",
    "saleOnFour",
    "sellingInternetForbidden",
    "distance",
    "country",
    "elRegPossible",
    "station",
    "selBedding",
    "nonSmoking",
    "seats",
    "places"
})
public class FareType {

    @XmlElement(name = "ClassService", required = true)
    protected ClassServiceType classService;
    @XmlElement(name = "ClassServiceInt", required = true)
    protected String classServiceInt;
    @XmlElement(name = "AddSigns", required = true)
    protected String addSigns;
    @XmlElement(name = "Tariff")
    protected Float tariff;
    @XmlElement(name = "TariffService")
    protected Float tariffService;
    @XmlElement(name = "TariffBillet")
    protected Float tariffBillet;
    @XmlElement(name = "TariffPlac")
    protected Float tariffPlac;
    @XmlElement(name = "Carrier", required = true)
    protected CarrierType carrier;
    @XmlElement(name = "Owner", required = true)
    protected OwnerG62Type owner;
    @XmlElement(name = "SaleOnTwo", required = true)
    protected String saleOnTwo;
    @XmlElement(name = "SaleOnFour")
    protected String saleOnFour;
    @XmlElement(name = "SellingInternetForbidden")
    protected String sellingInternetForbidden;
    @XmlElement(name = "Distance")
    protected Integer distance;
    @XmlElement(name = "Country")
    protected List<CountryG62Type> country;
    @XmlElement(name = "ElRegPossible", required = true)
    protected ElRegPossibleType elRegPossible;
    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "SelBedding", required = false)
    private String selBedding;
    @XmlElement(name = "NonSmoking", required = true)
    protected String nonSmoking;
    @XmlElement(name = "Seats", required = true)
    protected SeatsType seats;
    @XmlElement(name = "Places", required = true)
    protected String places;

    public List<CountryG62Type> getCountry() {
        if (country == null) {
            country = new ArrayList<CountryG62Type>();
        }
        return this.country;
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

    public Float getTariffService() {
        return tariffService;
    }

    public void setTariffService(Float tariffService) {
        this.tariffService = tariffService;
    }

    public Float getTariffBillet() {
        return tariffBillet;
    }

    public void setTariffBillet(Float tariffBillet) {
        this.tariffBillet = tariffBillet;
    }

    public Float getTariffPlac() {
        return tariffPlac;
    }

    public void setTariffPlac(Float tariffPlac) {
        this.tariffPlac = tariffPlac;
    }

    public CarrierType getCarrier() {
        return carrier;
    }

    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    public OwnerG62Type getOwner() {
        return owner;
    }

    public void setOwner(OwnerG62Type owner) {
        this.owner = owner;
    }

    public String getSaleOnTwo() {
        return saleOnTwo;
    }

    public void setSaleOnTwo(String saleOnTwo) {
        this.saleOnTwo = saleOnTwo;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public ElRegPossibleType getElRegPossible() {
        return elRegPossible;
    }

    public void setElRegPossible(ElRegPossibleType elRegPossible) {
        this.elRegPossible = elRegPossible;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getNonSmoking() {
        return nonSmoking;
    }

    public void setNonSmoking(String nonSmoking) {
        this.nonSmoking = nonSmoking;
    }

    public SeatsType getSeats() {
        return seats;
    }

    public void setSeats(SeatsType seats) {
        this.seats = seats;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getSaleOnFour() {
        return saleOnFour;
    }

    public void setSaleOnFour(String saleOnFour) {
        this.saleOnFour = saleOnFour;
    }

    public void setCountry(List<CountryG62Type> country) {
        this.country = country;
    }

    public String getSelBedding() {
        return selBedding;
    }

    public void setSelBedding(String selBedding) {
        this.selBedding = selBedding;
    }

    public String getSellingInternetForbidden() {
        return sellingInternetForbidden;
    }

    public void setSellingInternetForbidden(String sellingInternetForbidden) {
        this.sellingInternetForbidden = sellingInternetForbidden;
    }
}
