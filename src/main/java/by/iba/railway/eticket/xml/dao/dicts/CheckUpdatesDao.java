package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.CheckUpdatesRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.CheckUpdatesResponse;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class CheckUpdatesDao extends BaseDao<CheckUpdatesResponse, CheckUpdatesRequest>{
    protected String type = "CheckUpdates";

    public CheckUpdatesDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public String getStationsLastUpdate() throws XmlParserSystemException, BusinessSystemException {
        CheckUpdatesRequest request = new CheckUpdatesRequest();
        CheckUpdatesResponse response = sendRequest(request);

        return response.getStations().getLastUpdate();
    }
    public String getBenefitsLastUpdate() throws XmlParserSystemException, BusinessSystemException {
        CheckUpdatesRequest request = new CheckUpdatesRequest();
        CheckUpdatesResponse response = sendRequest(request);

        return response.getSUBKL().getLastUpdate();
    }
    public CheckUpdatesResponse getCheckUpdatesInfo() throws XmlParserSystemException, BusinessSystemException {
        CheckUpdatesRequest request = new CheckUpdatesRequest();
        return sendRequest(request);
    }
    @Override
    public Class<CheckUpdatesRequest> getRequestClass() {
        return CheckUpdatesRequest.class;
    }
    @Override
    public Class<CheckUpdatesResponse> getResponseClass() {
        return CheckUpdatesResponse.class;
    }
}
