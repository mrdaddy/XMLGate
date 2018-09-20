package by.iba.railway.eticket.xml.objs.response.dicts;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "GtLocal_Response")
@XmlType(name = "GtLocal_ResponseType", propOrder = {
    "countries"
})
public class LibraryCountryResponse extends BaseResponse {

	
    protected List<CountryType> countries;
    
    @XmlElement(name = "Country") 
    public List<CountryType> getCountries() {
        if (countries == null) {
        	countries = new ArrayList<CountryType>();
        }
        return this.countries;
    }
    
	public void setCountries(List<CountryType> countries) {
		this.countries = countries;
	}
	
	/*public Class<LibraryCountryResponse> getClassType() {
		return LibraryCountryResponse.class;
	}*/
}

