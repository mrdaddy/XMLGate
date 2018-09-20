package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.DelayTrainsG51Request;
import by.iba.railway.eticket.xml.objs.response.express.DelayTrainsG51Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class DelayTrainsG51Dao extends BaseScheduleDao<DelayTrainsG51Response,DelayTrainsG51Request> {
    protected String type = "DelayTrains";

    public DelayTrainsG51Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public DelayTrainsG51Response getDelayTrainsInfo(String station, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        DelayTrainsG51Request request = new DelayTrainsG51Request(station, arrivalDate);
        DelayTrainsG51Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<DelayTrainsG51Request> getRequestClass() {
        return DelayTrainsG51Request.class;
    }

    @Override
    public Class<DelayTrainsG51Response> getResponseClass() {
        return DelayTrainsG51Response.class;
    }
}
