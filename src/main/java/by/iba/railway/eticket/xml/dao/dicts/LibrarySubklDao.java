package by.iba.railway.eticket.xml.dao.dicts;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.LibrarySubklRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.LibrarySubklResponse;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

public class LibrarySubklDao extends BaseDao<LibrarySubklResponse, LibrarySubklRequest>{
    protected String type = "SUBKL";

    public LibrarySubklDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
    public LibrarySubklResponse getBenefitInfo() throws XmlParserSystemException, BusinessSystemException {
        LibrarySubklRequest request = new LibrarySubklRequest();
        LibrarySubklResponse response = sendRequest(request);

        return response;
    }
    @Override
    public Class<LibrarySubklRequest> getRequestClass() {
        return LibrarySubklRequest.class;
    }
    @Override
    public Class<LibrarySubklResponse> getResponseClass() {
        return LibrarySubklResponse.class;
    }
}
