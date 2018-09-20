package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryCountryRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.LibraryCountryResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class LibraryCountryDao extends BaseDao<LibraryCountryResponse,LibraryCountryRequest> {
	protected String type="Country";
	//TODO: getInfo can not put because of other input params
	public LibraryCountryDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
		super(siteUrl, login, password, debug, timeout, statistic);
	}
    public CountryType getCountry(String code) throws XmlParserSystemException, BusinessSystemException {
        List<CountryType> countries = getCountriesByCodes(code);
        return countries != null ? countries.get(0) : null;
    }
	public List<CountryType> getCountries() throws XmlParserSystemException, BusinessSystemException {
		LibraryCountryRequest request = new LibraryCountryRequest(true);
        LibraryCountryResponse response = sendRequest(request);

        return response.getCountries();
	}
	public List<CountryType> getCountriesByCodes(String... code) throws XmlParserSystemException, BusinessSystemException {
		LibraryCountryRequest request = new LibraryCountryRequest(code);
        LibraryCountryResponse response = sendRequest(request);

        return response.getCountries();
	}

	@Override
	public Class<LibraryCountryRequest> getRequestClass() {
		return LibraryCountryRequest.class;
	}
	@Override
	public Class<LibraryCountryResponse> getResponseClass() {
		return LibraryCountryResponse.class;
	}

}
