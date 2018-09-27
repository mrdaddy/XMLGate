package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DepartureType")
public class DepartureType extends DateTime{

    @XmlAttribute(name = "Train")
    protected String train;
    @XmlAttribute(name = "TrainCat")
    protected String trainCat;
    @XmlAttribute(name = "TrainType")
    protected String trainType;
    @XmlAttribute(name = "Station")
    protected String station;
    @XmlAttribute(name = "StationCode")
    protected String stationCode;

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getTrainCat() {
        return trainCat;
    }

    public void setTrainCat(String trainCat) {
        this.trainCat = trainCat;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
}
