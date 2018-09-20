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
    "code",
    "list"
})
public class LibraryCountryRequest extends BaseRequest {

    
    protected List<String> code;
    protected String list;
    
	public LibraryCountryRequest() { this.type="Country"; }
    public LibraryCountryRequest(boolean isAll) {
        this();
        if(isAll == true)
            this.list = "";
    }
    public LibraryCountryRequest(String... code) {
		this();
        if(code != null && code.length != 0)
		    this.code = Arrays.asList(code);
	}
    @XmlElement(name = "Code")
    public List<String> getCode() {
        if (code == null) {
            code = new ArrayList<String>();
        }
        return this.code;
    }
    @XmlElement(name = "List")
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
