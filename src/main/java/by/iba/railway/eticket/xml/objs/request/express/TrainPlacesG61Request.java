package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "stationFrom",
    "stationTo",
    "tariff",
    "direction"
})
public class TrainPlacesG61Request extends BaseRequest{

    @XmlElement(name = "StationFrom", required = true)
    protected String stationFrom;
    @XmlElement(name = "StationTo", required = true)
    protected String stationTo;
    @XmlElement(name = "Tariff", required = true)
    protected TariffType tariff;
    @XmlElement(name = "Direction")
    protected List<DirectionType> direction;
    @XmlAttribute(name = "ShowWithoutPlaces")
    protected String showWithoutPlaces;
    @XmlAttribute(name = "DetailNumPlaces")
    protected String detailNumPlaces;
    @XmlAttribute(name = "DetailTypePlaces")
    protected String detailTypePlaces;

    public TrainPlacesG61Request() {
        this.type = "TrainPlaces";
    }

    public TrainPlacesG61Request(String stationFrom, TariffType tariff, String stationTo) {
        this();
        this.stationFrom = stationFrom;
        this.tariff = tariff;
        this.stationTo = stationTo;
        this.direction = new ArrayList<DirectionType>();
    }

    public TrainPlacesG61Request(String stationFrom, String stationTo, TariffType tariff, List<DirectionType> direction, String showWithoutPlaces, String detailNumPlaces, String detailTypePlaces) {
        this();
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.tariff = tariff;
        this.direction = direction;
        this.showWithoutPlaces = showWithoutPlaces;
        this.detailNumPlaces = detailNumPlaces;
        this.detailTypePlaces = detailTypePlaces;
    }

    public List<DirectionType> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionType>();
        }
        return this.direction;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }

    public TariffType getTariff() {
        return tariff;
    }

    public void setTariff(TariffType tariff) {
        this.tariff = tariff;
    }

    public String getShowWithoutPlaces() {
        return showWithoutPlaces;
    }

    public void setShowWithoutPlaces(String showWithoutPlaces) {
        this.showWithoutPlaces = showWithoutPlaces;
    }

    public String getDetailNumPlaces() {
        return detailNumPlaces;
    }

    public void setDetailNumPlaces(String detailNumPlaces) {
        this.detailNumPlaces = detailNumPlaces;
    }

    public String getDetailTypePlaces() {
        return detailTypePlaces;
    }

    public void setDetailTypePlaces(String detailTypePlaces) {
        this.detailTypePlaces = detailTypePlaces;
    }

    public void setDirection(List<DirectionType> direction) {
        this.direction = direction;
    }
}
