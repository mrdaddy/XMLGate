package by.iba.railway.eticket.xml.objs.response.dicts;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "GtLocal_Response")
@XmlType(name = "GtLocal_ResponseType", propOrder = {
    "railway"
})
public class LibraryRailwayResponse extends BaseResponse {
    
    protected List<RailwayType> railway;
    
    @XmlElement(name = "Railway")
    public List<RailwayType> getRailway() {
        if (railway == null) {
            railway = new ArrayList<RailwayType>();
        }
        return this.railway;
    }

    public void setRailway(List<RailwayType> railway) {
        this.railway = railway;
    }
}
