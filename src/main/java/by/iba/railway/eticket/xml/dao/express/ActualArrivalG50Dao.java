package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.ActualArrivalG50Request;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.ActualArrivalG50Response;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class ActualArrivalG50Dao extends BaseScheduleDao<ActualArrivalG50Response,ActualArrivalG50Request> {
    protected String type = "ActualArrival";

    public ActualArrivalG50Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    //TODO probably getActualArrivalTrain must return list
    public by.iba.railway.eticket.xml.objs.response.type.G50.TrainType getActualArrivalTrain(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        ActualArrivalG50Request request = new ActualArrivalG50Request(new TrainType(trainNumber),arrivalDate);
        ActualArrivalG50Response response = sendRequest(request);

        return response.getTrain();
    }
    public ActualArrivalG50Response getActualArrivalInfo(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        ActualArrivalG50Request request = new ActualArrivalG50Request(new TrainType(trainNumber),arrivalDate);
        ActualArrivalG50Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<ActualArrivalG50Request> getRequestClass() {
        return ActualArrivalG50Request.class;
    }

    @Override
    public Class<ActualArrivalG50Response> getResponseClass() {
        return ActualArrivalG50Response.class;
    }
}
