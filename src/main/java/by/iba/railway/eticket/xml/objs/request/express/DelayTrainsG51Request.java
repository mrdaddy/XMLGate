package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "station",
    "arvDate"
})
public class DelayTrainsG51Request extends BaseRequest{

    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "ArvDate", required = true)
    protected String arvDate;

    public DelayTrainsG51Request() {
        this.type = "DelayTrains";
    }

    public DelayTrainsG51Request(String station, String arvDate) {
        this();
        this.station = station;
        this.arvDate = arvDate;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getArvDate() {
        return arvDate;
    }

    public void setArvDate(String arvDate) {
        this.arvDate = arvDate;
    }
}
