package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.ScheduleStationG19Request;
import by.iba.railway.eticket.xml.objs.response.express.ScheduleStationG19Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class ScheduleStationG19Dao extends BaseScheduleDao<ScheduleStationG19Response, ScheduleStationG19Request> {
    protected String type = "ScheduleStation";

    public ScheduleStationG19Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public ScheduleStationG19Response getScheduleStationInfo(String station, String date) throws XmlParserSystemException, BusinessSystemException {
        ScheduleStationG19Request request = new ScheduleStationG19Request(station,date);
        ScheduleStationG19Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<ScheduleStationG19Request> getRequestClass() {
        return ScheduleStationG19Request.class;
    }
    @Override
    public Class<ScheduleStationG19Response> getResponseClass() {
        return ScheduleStationG19Response.class;
    }
}
