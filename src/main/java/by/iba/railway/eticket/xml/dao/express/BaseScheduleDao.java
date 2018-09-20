package by.iba.railway.eticket.xml.dao.express;

import by.iba.railway.eticket.xml.dao.BaseDao;
import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.services.CallbackStatistic;

/**
 * Created by Dzemianchyk_AI on 22.12.2015.
 */
public class BaseScheduleDao<T extends BaseResponse, K extends BaseRequest> extends BaseDao<T, K> {
    private static int READ_TIMEOUT_MS = 15 * 1000;
    public BaseScheduleDao(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
        super(siteUrl, login, password, debug, timeout, statistic);
    }
}
