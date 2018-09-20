package by.iba.railway.eticket.xml.objs.request.dicts;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "GtLocal_Request")
@XmlType(name = "GtLocal_RequestType", propOrder = {
    "codes",
    "names"
})
public class LibraryStationRequest extends BaseRequest {

    protected List<String> codes;
    protected List<String> names;
    public LibraryStationRequest(){ this.type="Station"; }
    public LibraryStationRequest(String[] codes, String[] names) {
        this();
        if(codes != null && codes.length != 0)
            this.codes = Arrays.asList(codes);
        if(names != null && names.length != 0)
            this.names = Arrays.asList(names);
    }
    @XmlElement(name = "Code")
    public List<String> getCodes() {
        if (codes == null) {
            codes = new ArrayList<String>();
        }
        return this.codes;
    }
    @XmlElement(name = "Name")
    public List<String> getNames() {
        if (names == null) {
            names = new ArrayList<String>();
        }
        return this.names;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
