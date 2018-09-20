package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.PlacesG60Request;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;
import by.iba.railway.eticket.xml.objs.response.express.PlacesG60Response;
import by.iba.railway.eticket.xml.objs.response.type.G61.DirectionG61Type;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class PlacesG60Dao extends BaseScheduleDao<PlacesG60Response, PlacesG60Request> {
    protected String type = "Places";

    public PlacesG60Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<DirectionG61Type> getPlacesBetweenStationsDirections(String stationFrom, String showWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException {
        PlacesG60Request request = new PlacesG60Request(stationFrom, showWithoutPlaces, directions,carrier,tariff,stationTo);
        PlacesG60Response response = sendRequest(request);

        return response.getDirection();
    }
    public PlacesG60Response getPlacesInfo(String stationFrom, String showWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException {
        PlacesG60Request request = new PlacesG60Request(stationFrom, showWithoutPlaces, directions,carrier,tariff,stationTo);
        PlacesG60Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<PlacesG60Request> getRequestClass() {
        return PlacesG60Request.class;
    }
    @Override
    public Class<PlacesG60Response> getResponseClass() {
        return PlacesG60Response.class;
    }
}
