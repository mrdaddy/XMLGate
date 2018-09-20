package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "station",
    "date"
})
public class ScheduleStationG19Request extends BaseRequest{

    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "Date", required = true)
    protected String date;

    public ScheduleStationG19Request(){ this.type="ScheduleStation"; }
    public ScheduleStationG19Request(String station, String date) {
        this();
        this.station = station;
        this.date = date;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String value) {
        this.station = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

}
