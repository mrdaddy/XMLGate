package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryRailwayRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.LibraryRailwayResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class LibraryRailwayDao extends BaseDao<LibraryRailwayResponse, LibraryRailwayRequest>{
    protected String type = "Railway";
    //TODO: getInfo can not put because of other input params
    public LibraryRailwayDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout,statistic);
    }
    public RailwayType getRailway(String code) throws XmlParserSystemException, BusinessSystemException {
        List<RailwayType> railways = getRailwaysByCodes(code);
        return railways != null ? railways.get(0) : null;
    }
    public List<RailwayType> getRailways() throws XmlParserSystemException, BusinessSystemException {
        LibraryRailwayRequest request = new LibraryRailwayRequest(true);
        LibraryRailwayResponse response = sendRequest(request);

        return response.getRailway();
    }
    public List<RailwayType> getRailwaysByCodes(String... code) throws XmlParserSystemException, BusinessSystemException {
        LibraryRailwayRequest request = new LibraryRailwayRequest(code);
        LibraryRailwayResponse response = sendRequest(request);

        return response.getRailway();
    }
    @Override
    public Class<LibraryRailwayRequest> getRequestClass() {
        return LibraryRailwayRequest.class;
    }
    @Override
    public Class<LibraryRailwayResponse> getResponseClass() {
        return LibraryRailwayResponse.class;
    }
}
