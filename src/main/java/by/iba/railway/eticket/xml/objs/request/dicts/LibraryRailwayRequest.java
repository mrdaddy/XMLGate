package by.iba.railway.eticket.xml.objs.request.dicts;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "GtLocal_Request")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtLocal_RequestType", propOrder = {
    "code",
    "list"
})
public class LibraryRailwayRequest extends BaseRequest {

    @XmlElement(name = "Code")
    protected List<String> code;
    @XmlElement(name = "List", required = true)
    protected String list;

    public LibraryRailwayRequest(){ this.type="Railway";}
    public LibraryRailwayRequest(boolean isAll){
        this();
        if(isAll == true)
            this.list = "";
    }
    public LibraryRailwayRequest(String... code) {
        this();
        if(code != null && code.length != 0)
            this.code = Arrays.asList(code);
    }
    public List<String> getCode() {
        if (code == null) {
            code = new ArrayList<String>();
        }
        return this.code;
    }

    public String getList() {
        return list;
    }

    public void setList(String value) {
        this.list = value;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }
}
