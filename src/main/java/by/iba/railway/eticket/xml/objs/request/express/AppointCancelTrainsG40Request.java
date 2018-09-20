package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.G40.DateType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "trains",
    "date"
})
public class AppointCancelTrainsG40Request extends BaseRequest {

    @XmlElement(name = "Trains", required = true)
    protected String trains;
    @XmlElement(name = "Date", required = true)
    protected DateType date;

    public AppointCancelTrainsG40Request() {
        this.type = "AppointCancelTrains";
    }

    public AppointCancelTrainsG40Request(String trains, DateType date) {
        this();
        this.trains = trains;
        this.date = date;
    }

    public String getTrains() {
        return trains;
    }

    public void setTrains(String trains) {
        this.trains = trains;
    }

    public DateType getDate() {
        return date;
    }

    public void setDate(DateType date) {
        this.date = date;
    }
}
