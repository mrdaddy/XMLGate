package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryStationListRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.LibraryStationResponse;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class LibraryStationListDao extends BaseDao<LibraryStationResponse, LibraryStationListRequest>{
    protected String type = "StationList";

    public LibraryStationListDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }

    public List<StationType> getStationsList(String name, String roadCode,
                                             String countryCode) throws XmlParserSystemException, BusinessSystemException {
        LibraryStationListRequest request = new LibraryStationListRequest(name, roadCode, countryCode);
        LibraryStationResponse response = sendRequest(request);

        return response.getStation();
    }
    public List<StationType> getStationsList() throws XmlParserSystemException, BusinessSystemException {
        LibraryStationListRequest request = new LibraryStationListRequest(true);
        LibraryStationResponse response = sendRequest(request);

        return response.getStation();
    }
    public StationType getStation(String name, String roadCode,
                                             String countryCode) throws XmlParserSystemException, BusinessSystemException {
        LibraryStationListRequest request = new LibraryStationListRequest(name, roadCode, countryCode);
        LibraryStationResponse response = sendRequest(request);

        return response.getStation() != null ? response.getStation().get(0) : null;
    }
    @Override
    public Class<LibraryStationListRequest> getRequestClass() {
        return LibraryStationListRequest.class;
    }
    @Override
    public Class<LibraryStationResponse> getResponseClass() {
        return LibraryStationResponse.class;
    }
}
