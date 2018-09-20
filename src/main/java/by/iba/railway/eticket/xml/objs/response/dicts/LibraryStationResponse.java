package by.iba.railway.eticket.xml.objs.response.dicts;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="GtLocal_Response")
@XmlType(name = "GtLocal_ResponseType", propOrder = {
    "station"
})
public class LibraryStationResponse extends BaseResponse {
	
    protected List<StationType> station;
    
    @XmlElement(name = "Station")
    public List<StationType> getStation() {
        if (station == null) {
            station = new ArrayList<StationType>();
        }
        return this.station;
    }

    public void setStation(List<StationType> station) {
        this.station = station;
    }
}
