package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.TrainPlacesG61Request;
import by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.response.express.TrainPlacesG61Response;
import by.iba.railway.eticket.xml.objs.response.type.G61.DirectionG61Type;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class TrainPlacesG61Dao extends BaseScheduleDao<TrainPlacesG61Response,TrainPlacesG61Request> {
    protected String type = "TrainPlaces";

    public TrainPlacesG61Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public List<DirectionG61Type> getTrainPlacesDirections(String stationFrom, String stationTo, TariffType tariff, List<DirectionType> directions, String showWithoutPlaces, String detailNumPlaces, String detailTypePlaces) throws XmlParserSystemException, BusinessSystemException {
        TrainPlacesG61Request request = new TrainPlacesG61Request(stationFrom,stationTo,tariff,directions,showWithoutPlaces,detailNumPlaces,detailTypePlaces);
        TrainPlacesG61Response response = sendRequest(request);

        return response.getDirection();
    }
    public TrainPlacesG61Response getTrainPlacesInfo(String stationFrom, String stationTo, TariffType tariff, List<DirectionType> directions, String showWithoutPlaces, String detailNumPlaces, String detailTypePlaces) throws XmlParserSystemException, BusinessSystemException {
        TrainPlacesG61Request request = new TrainPlacesG61Request(stationFrom,stationTo,tariff,directions,showWithoutPlaces,detailNumPlaces,detailTypePlaces);
        TrainPlacesG61Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<TrainPlacesG61Request> getRequestClass() {
        return TrainPlacesG61Request.class;
    }

    @Override
    public Class<TrainPlacesG61Response> getResponseClass() {
        return TrainPlacesG61Response.class;
    }
}
