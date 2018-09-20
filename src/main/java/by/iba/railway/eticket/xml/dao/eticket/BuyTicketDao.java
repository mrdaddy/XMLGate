package by.iba.railway.eticket.xml.dao.eticket;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.BuyTicketRequest;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengersType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.RequirementsType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.eticket.BuyTicketResponse;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class BuyTicketDao extends BaseDao<BuyTicketResponse,BuyTicketRequest> {
    protected String type = "BuyTicket";

    public BuyTicketDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public BuyTicketResponse getBuyTicketInfo(String stationFrom, String stationTo, String depDate, String depTime, TrainType train, CarType car, RequirementsType requirements, String creditCard, PassengersType passengers) throws XmlParserSystemException, BusinessSystemException {
        BuyTicketRequest request = new BuyTicketRequest(stationFrom,stationTo,depDate,depTime,train,car,requirements,creditCard,passengers);
        BuyTicketResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<BuyTicketRequest> getRequestClass() {
        return BuyTicketRequest.class;
    }

    @Override
    public Class<BuyTicketResponse> getResponseClass() {
        return BuyTicketResponse.class;
    }
}
