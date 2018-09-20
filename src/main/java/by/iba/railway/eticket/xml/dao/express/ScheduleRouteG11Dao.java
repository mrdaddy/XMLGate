package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.ScheduleRouteG11Request;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;
import by.iba.railway.eticket.xml.objs.response.express.ScheduleRouteG11Response;
import by.iba.railway.eticket.xml.objs.response.type.G11.DirectionG11Type;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class ScheduleRouteG11Dao extends BaseScheduleDao<ScheduleRouteG11Response, ScheduleRouteG11Request> {
    protected String type = "ScheduleRoute";

    public ScheduleRouteG11Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<DirectionG11Type> getScheduleRouteDirections(String stationFrom, String stationTo, List<DirectionRequestType> directions, String standard, String filter) throws XmlParserSystemException, BusinessSystemException {
        ScheduleRouteG11Request request = new ScheduleRouteG11Request(stationFrom,stationTo,directions,standard,filter);
        ScheduleRouteG11Response response = sendRequest(request);

        return response.getDirection();
    }
    public ScheduleRouteG11Response getScheduleRouteInfo(String stationFrom, String stationTo, List<DirectionRequestType> directions, String standard, String filter) throws XmlParserSystemException, BusinessSystemException {
        ScheduleRouteG11Request request = new ScheduleRouteG11Request(stationFrom,stationTo,directions,standard,filter);
        ScheduleRouteG11Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<ScheduleRouteG11Request> getRequestClass() {
        return ScheduleRouteG11Request.class;
    }
    @Override
    public Class<ScheduleRouteG11Response> getResponseClass() {
        return ScheduleRouteG11Response.class;
    }
}
