package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.TrainNumberG15Request;
import by.iba.railway.eticket.xml.objs.response.express.TrainNumberG15Response;
import by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

import java.util.List;

public class TrainNumberG15Dao extends BaseScheduleDao<TrainNumberG15Response, TrainNumberG15Request> {
    protected String type = "TrainNumber";

    public TrainNumberG15Dao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout,statistic);
    }
    public List<TrainType> getTrainByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException {
        TrainNumberG15Request request = new TrainNumberG15Request(trainNumber);
        TrainNumberG15Response response = sendRequest(request);

        return response.getTrain();
    }
    public TrainNumberG15Response getInfoByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException {
        TrainNumberG15Request request = new TrainNumberG15Request(trainNumber);
        TrainNumberG15Response response = sendRequest(request);

        return response;
    }
    @Override
    public Class<TrainNumberG15Request> getRequestClass() {
        return TrainNumberG15Request.class;
    }
    @Override
    public Class<TrainNumberG15Response> getResponseClass() {
        return TrainNumberG15Response.class;
    }
}
