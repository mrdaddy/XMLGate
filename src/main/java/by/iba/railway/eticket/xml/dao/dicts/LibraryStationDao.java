package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryStationRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.LibraryStationResponse;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class LibraryStationDao extends BaseDao<LibraryStationResponse, LibraryStationRequest>{
    protected String type = "Station";

    public LibraryStationDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<StationType> getStationsByCodesOrNames(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException {
        LibraryStationRequest request = new LibraryStationRequest(codes, names);
        LibraryStationResponse response = sendRequest(request);

        return response.getStation();
    }
    public StationType getStationByCodeOrName(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException {
        List<StationType> stations = getStationsByCodesOrNames(codes, names);
        return stations != null ? stations.get(0) : null;
    }
    @Override
    public Class<LibraryStationRequest> getRequestClass() {
        return LibraryStationRequest.class;
    }
    @Override
    public Class<LibraryStationResponse> getResponseClass() {
        return LibraryStationResponse.class;
    }
}
