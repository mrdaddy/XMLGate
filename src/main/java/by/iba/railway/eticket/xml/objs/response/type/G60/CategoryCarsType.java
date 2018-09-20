package by.iba.railway.eticket.xml.objs.response.type.G60;

import by.iba.railway.eticket.xml.objs.response.type.common.SeatsType;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryCarsType", propOrder = {
    "seats",
    "tariffs"
})
public class CategoryCarsType {

    @XmlElement(name = "Seats", required = true)
    protected SeatsType seats;
    @XmlElement(name = "Tariffs", required = true)
    protected TariffsType tariffs;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "IndexType")
    protected Integer indexType;
    @XmlAttribute(name = "FreeSeats")
    protected Integer freeSeats;

    public SeatsType getSeats() {
        return seats;
    }

    public void setSeats(SeatsType seats) {
        this.seats = seats;
    }

    public TariffsType getTariffs() {
        return tariffs;
    }

    public void setTariffs(TariffsType tariffs) {
        this.tariffs = tariffs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIndexType() {
        return indexType;
    }

    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    public Integer getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(Integer freeSeats) {
        this.freeSeats = freeSeats;
    }
}
