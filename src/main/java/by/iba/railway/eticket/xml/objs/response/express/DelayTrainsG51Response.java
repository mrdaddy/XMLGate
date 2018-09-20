package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G51.TrainsType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
    "date",
    "station",
    "trains"
})
public class DelayTrainsG51Response extends BaseResponse{

    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "Trains", required = true)
    protected TrainsType trains;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public TrainsType getTrains() {
        return trains;
    }

    public void setTrains(TrainsType trains) {
        this.trains = trains;
    }
}
