package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "stationFrom",
    "stationTo",
    "date",
    "depTime",
    "train",
    "car",
    "tariff"
})
public class TrainCarPlacesG62Request extends BaseRequest {

    @XmlElement(name = "StationFrom", required = true)
    protected String stationFrom;
    @XmlElement(name = "StationTo", required = true)
    protected String stationTo;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "DepTime", required = true)
    protected String depTime;
    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "Car", required = true)
    protected CarType car;
    @XmlElement(name = "Tariff", required = true)
    protected TariffType tariff;

    public TrainCarPlacesG62Request() {
        this.type = "TrainCarPlaces";
    }

    public TrainCarPlacesG62Request(String stationFrom, String stationTo, String date, String depTime, TrainType train, CarType car, TariffType tariff) {
        this();
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.date = date;
        this.depTime = depTime;
        this.train = train;
        this.car = car;
        this.tariff = tariff;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public TariffType getTariff() {
        return tariff;
    }

    public void setTariff(TariffType tariff) {
        this.tariff = tariff;
    }
}
