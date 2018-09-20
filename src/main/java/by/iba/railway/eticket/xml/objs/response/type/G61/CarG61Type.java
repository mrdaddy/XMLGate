package by.iba.railway.eticket.xml.objs.response.type.G61;

import by.iba.railway.eticket.xml.objs.response.type.common.ElRegPossibleType;
import by.iba.railway.eticket.xml.objs.response.type.common.SeatsType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {
    "elRegPossible",
    "station",
    "nonSmoking",
    "selBedding",
    "designCar",
    "seats",
    "seatsSex",
    "typePlaces",
    "places"
})
public class CarG61Type {

    @XmlElement(name = "ElRegPossible", required = true)
    protected ElRegPossibleType elRegPossible;
    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "NonSmoking", required = true)
    protected String nonSmoking;
    @XmlElement(name = "SelBedding", required = true)
    private String selBedding;
    @XmlElement(name = "DesignCar", required = true)
    protected DesignCarType designCar;
    @XmlElement(name = "Seats", required = true)
    protected SeatsType seats;
    @XmlElement(name = "SeatsSex", required = true)
    protected SeatsSexType seatsSex;
    @XmlElement(name = "TypePlaces", required = true)
    protected String typePlaces;
    @XmlElement(name = "Places", required = true)
    protected String places;
    @XmlAttribute(name = "Number")
    protected String number;

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

    public DesignCarType getDesignCar() {
        return designCar;
    }

    public void setDesignCar(DesignCarType designCar) {
        this.designCar = designCar;
    }

    public SeatsType getSeats() {
        return seats;
    }

    public void setSeats(SeatsType seats) {
        this.seats = seats;
    }

    public SeatsSexType getSeatsSex() {
        return seatsSex;
    }

    public void setSeatsSex(SeatsSexType seatsSex) {
        this.seatsSex = seatsSex;
    }

    public String getTypePlaces() {
        return typePlaces;
    }

    public void setTypePlaces(String typePlaces) {
        this.typePlaces = typePlaces;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSelBedding() {
        return selBedding;
    }

    public void setSelBedding(String selBedding) {
        this.selBedding = selBedding;
    }
}
