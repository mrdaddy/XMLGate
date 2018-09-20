package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import by.iba.railway.eticket.xml.objs.response.type.common.DateTime;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ArrivalType")
public class ArrivalType extends DateTime{

    @XmlAttribute(name = "Train")
    protected String train;
    @XmlAttribute(name = "Station")
    protected String station;
    @XmlAttribute(name = "StationCode")
    protected Integer stationCode;

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Integer getStationCode() {
        return stationCode;
    }

    public void setStationCode(Integer stationCode) {
        this.stationCode = stationCode;
    }
}
