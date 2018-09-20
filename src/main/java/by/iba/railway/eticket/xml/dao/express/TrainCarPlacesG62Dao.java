package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.TrainCarPlacesG62Request;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.TrainCarPlacesG62Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class TrainCarPlacesG62Dao extends BaseScheduleDao<TrainCarPlacesG62Response,TrainCarPlacesG62Request> {
    protected String type = "TrainCarPlaces";

    public TrainCarPlacesG62Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public TrainCarPlacesG62Response getTrainCarPlacesInfo(String stationFrom, String stationTo, String date, String depTime, TrainType train, CarType car, TariffType tariff) throws XmlParserSystemException, BusinessSystemException {
        TrainCarPlacesG62Request request = new TrainCarPlacesG62Request(stationFrom, stationTo, date, depTime, train, car, tariff);
        TrainCarPlacesG62Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<TrainCarPlacesG62Request> getRequestClass() {
        return TrainCarPlacesG62Request.class;
    }

    @Override
    public Class<TrainCarPlacesG62Response> getResponseClass() {
        return TrainCarPlacesG62Response.class;
    }
}
