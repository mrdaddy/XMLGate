package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "train",
    "station",
    "date",
    "standard"
})
public class TrainRouteG18Request extends BaseRequest {

    @XmlElement(name = "Train", required = true)
    protected TrainType train;
    @XmlElement(name = "Station", required = true)
    protected String station;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Standard")
    protected String standard;
    @XmlAttribute(name = "Answer")
    protected String answer;

    public TrainRouteG18Request() {
        this.type = "TrainRoute";
    }

    public TrainRouteG18Request(TrainType train, String station, String date, String answer) {
        this();
        this.train = train;
        this.station = station;
        this.date = date;
        this.answer = answer;
    }

    public TrainRouteG18Request(TrainType train, String station, String date, String standard, String answer) {
        this();
        this.train = train;
        this.station = station;
        this.date = date;
        this.standard = standard;
        this.answer = answer;
    }

    public TrainType getTrain() {
        return train;
    }

    public void setTrain(TrainType train) {
        this.train = train;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
