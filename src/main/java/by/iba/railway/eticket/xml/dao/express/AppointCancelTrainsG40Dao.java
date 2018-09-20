package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.AppointCancelTrainsG40Request;
import by.iba.railway.eticket.xml.objs.request.type.G40.DateType;
import by.iba.railway.eticket.xml.objs.response.express.AppointCancelTrainsG40Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class AppointCancelTrainsG40Dao extends BaseScheduleDao<AppointCancelTrainsG40Response,AppointCancelTrainsG40Request> {
    protected String type = "AppointCancelTrains";

    public AppointCancelTrainsG40Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<by.iba.railway.eticket.xml.objs.response.type.G40.TrainType> getAppointCancelTrains(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException {
        AppointCancelTrainsG40Request request = new AppointCancelTrainsG40Request(trainNumbers, datePeriod);
        AppointCancelTrainsG40Response response = sendRequest(request);

        return response.getTrain();
    }
    public AppointCancelTrainsG40Response getAppointCancelInfo(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException {
        AppointCancelTrainsG40Request request = new AppointCancelTrainsG40Request(trainNumbers, datePeriod);
        AppointCancelTrainsG40Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<AppointCancelTrainsG40Request> getRequestClass() {
        return AppointCancelTrainsG40Request.class;
    }

    @Override
    public Class<AppointCancelTrainsG40Response> getResponseClass() {
        return AppointCancelTrainsG40Response.class;
    }
}
