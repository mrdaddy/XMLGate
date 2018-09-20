package by.iba.railway.eticket.xml.objs.response.dicts;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.dicts.SUBKLType;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationsType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="GtLocal_Response")
@XmlType(name = "GtLocal_ResponseType", propOrder = {
    "stations",
    "SUBKL"
})
public class CheckUpdatesResponse extends BaseResponse {

    protected StationsType stations;
    protected SUBKLType subkl;    
    
    @XmlElement(name = "Stations")
    public StationsType getStations() {
        return stations;
    }

    public void setStations(StationsType value) {
        this.stations = value;
    }
    
    @XmlElement(name = "SUBKL")
    public SUBKLType getSUBKL() {
        return subkl;
    }

    public void setSUBKL(SUBKLType value) {
        this.subkl = value;
    }

}
