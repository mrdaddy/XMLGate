package by.iba.railway.eticket.xml.objs.request.dicts;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GtLocal_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtLocal_RequestType", propOrder = {
    "name",
    "railway",
    "country",
    "list"
})
public class LibraryStationListRequest extends BaseRequest {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Railway", required = true)
    protected String railway;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "List", required = true)
    protected String list;
    public LibraryStationListRequest(){ this.type="StationList"; }
    public LibraryStationListRequest(boolean isAll){
        this();
        if(isAll == true)
            this.list = "";
    }
    public LibraryStationListRequest(String name, String railwayCode, String countryCode) {
        this();
        this.name = name;
        this.railway = railwayCode;
        this.country = countryCode;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getRailway() {
        return railway;
    }

    public void setRailway(String value) {
        this.railway = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getList() {
        return list;
    }

    public void setList(String value) {
        this.list = value;
    }

}
