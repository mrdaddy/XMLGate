package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "stationFrom",
    "stationTo",
    "tariff",
    "carrier",
    "direction"
})
public class PlacesG60Request extends BaseRequest{

    @XmlElement(name = "StationFrom", required = true)
    protected String stationFrom;
    @XmlElement(name = "StationTo", required = true)
    protected String stationTo;
    @XmlElement(name = "Tariff", required = false)
    protected TariffType tariff;
    @XmlElement(name = "Carrier", required = false)
    protected String carrier;
    @XmlElement(name = "Direction")
    protected List<DirectionRequestType> direction;
    @XmlAttribute(name = "ShowWithoutPlaces")
    protected String showWithoutPlaces;

    public PlacesG60Request() {
        this.type = "Places";
    }

    public PlacesG60Request(String stationFrom, String showWithoutPlaces, List<DirectionRequestType> direction, String carrier, TariffType tariff, String stationTo) {
        this();
        this.stationFrom = stationFrom;
        this.showWithoutPlaces = showWithoutPlaces;
        this.direction = direction;
        this.carrier = carrier;
        this.tariff = tariff;
        this.stationTo = stationTo;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String value) {
        this.stationFrom = value;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String value) {
        this.stationTo = value;
    }

    public TariffType getTariff() {
        return tariff;
    }

    public void setTariff(TariffType value) {
        this.tariff = value;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String value) {
        this.carrier = value;
    }

    public List<DirectionRequestType> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionRequestType>();
        }
        return this.direction;
    }

    public String getShowWithoutPlaces() {
        return showWithoutPlaces;
    }

    public void setShowWithoutPlaces(String value) {
        this.showWithoutPlaces = value;
    }

    public void setDirection(List<DirectionRequestType> direction) {
        this.direction = direction;
    }
}
