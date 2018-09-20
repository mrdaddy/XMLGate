package by.iba.railway.eticket.xml.objs.request.express;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "GtExpress_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtExpress_RequestType", propOrder = {
    "stationFrom",
    "stationTo",
    "directions",
    "standard",
    "filter"
})
public class ScheduleRouteG11Request extends BaseRequest {

    @XmlElement(name = "StationFrom")
    protected String stationFrom;
    @XmlElement(name = "StationTo")
    protected String stationTo;
    @XmlElement(name = "Direction")
    protected List<DirectionRequestType> directions;
    @XmlElement(name = "Standard")
    protected String standard;
    @XmlElement(name = "Filter")
    protected String filter;

    public ScheduleRouteG11Request(){ this.type="ScheduleRoute"; }
    public ScheduleRouteG11Request(String stationFrom, String stationTo, List<DirectionRequestType> directions) {
        this();
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.directions = directions;
    }

    public ScheduleRouteG11Request(String stationFrom, String stationTo, List<DirectionRequestType> directions, String standard, String filter) {
        this();
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.directions = directions;
        this.standard = standard;
        this.filter = filter;
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

    public List<DirectionRequestType> getDirections() {
        return directions;
    }

    public void setDirections(List<DirectionRequestType> directions) {
        this.directions = directions;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
