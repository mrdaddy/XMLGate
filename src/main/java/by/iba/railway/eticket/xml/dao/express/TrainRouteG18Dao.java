package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.TrainRouteG18Request;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.TrainRouteG18Response;
import by.iba.railway.eticket.xml.objs.response.type.G18.RoutesType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class TrainRouteG18Dao extends BaseScheduleDao<TrainRouteG18Response,TrainRouteG18Request> {
    protected String type = "TrainRoute";

    public TrainRouteG18Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<RoutesType> getTrainRoutes(String trainNumber, String station, String date, String answer, String standard) throws XmlParserSystemException, BusinessSystemException {
        TrainRouteG18Request request = new TrainRouteG18Request(new TrainType(trainNumber), station, date, answer, standard);
        TrainRouteG18Response response = sendRequest(request);

        return response.getRoutes();
    }
    public by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType getTrainRouteTrain(String trainNumber, String station, String date, String answer, String standard) throws XmlParserSystemException, BusinessSystemException {
        TrainRouteG18Request request = new TrainRouteG18Request(new TrainType(trainNumber), station, date, answer, standard);
        TrainRouteG18Response response = sendRequest(request);

        return response.getTrain();
    }
    public TrainRouteG18Response getTrainRouteInfo(String trainNumber, String station, String date, String answer, String standard) throws XmlParserSystemException, BusinessSystemException {
        TrainRouteG18Request request = new TrainRouteG18Request(new TrainType(trainNumber), station, date, standard, answer);
        TrainRouteG18Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<TrainRouteG18Request> getRequestClass() {
        return TrainRouteG18Request.class;
    }

    @Override
    public Class<TrainRouteG18Response> getResponseClass() {
        return TrainRouteG18Response.class;
    }
}
