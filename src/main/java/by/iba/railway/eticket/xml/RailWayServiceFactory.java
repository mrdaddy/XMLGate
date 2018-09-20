package by.iba.railway.eticket.xml;

import by.iba.railway.eticket.xml.services.CallbackStatistic;
import by.iba.railway.eticket.xml.services.EticketService;
import by.iba.railway.eticket.xml.services.ExpressService;
import by.iba.railway.eticket.xml.services.GatewayService;
import by.iba.railway.eticket.xml.services.impl.EticketServiceImpl;
import by.iba.railway.eticket.xml.services.impl.ExpressServiceImpl;
import by.iba.railway.eticket.xml.services.impl.GatewayServiceImpl;

public class RailWayServiceFactory {
    private EticketService eticketService = null;
    private ExpressService expressService = null;
    private GatewayService gatewayService = null;
    private static int READ_TIMEOUT_MS = 90 * 1000;
    private int timeout = READ_TIMEOUT_MS;
    private CallbackStatistic statistic = null;
    /**
     * Получить сервис по электронным билетам (режим MGT)
     *
     * @param
     * @return EticketService
     */
    public RailWayServiceFactory(){};

    public RailWayServiceFactory(int timeout){
        this.timeout = timeout*1000;
    };

    public RailWayServiceFactory(int timeout, CallbackStatistic statistic){
        this.timeout = timeout*1000;
        this.statistic = statistic;
    };

    public EticketService getEticketService(String siteUrl, String login, String password)
    {
        return getEticketService(siteUrl, login, password, true);
    }
    public EticketService getEticketService(String siteUrl, String login, String password, boolean debug)
    {
        if(eticketService==null)
            eticketService = new EticketServiceImpl(siteUrl, login, password, debug, timeout, statistic);
        return eticketService;
    }
    /**
     * Получить сервис по Внутренним справочникам Системы: справочники стран, станций, дорог, льгот
     *
     * @param
     * @return GatewayService
     */
    public GatewayService getGatewayService(String siteUrl, String login, String password)
    {
        return getGatewayService(siteUrl, login, password, true);
    }
    public GatewayService getGatewayService(String siteUrl, String login, String password, boolean debug)
    {
        if(gatewayService==null)
            gatewayService = new GatewayServiceImpl(siteUrl, login, password, debug, timeout, statistic);
        return gatewayService;
    }
    /**
     * Получить сервис по Справочным ресурсам АСУ «Экспресс-3»
     *
     * @param
     * @return ExpressService
     */
    public ExpressService getExpressService(String siteUrl, String login, String password)
    {
        return getExpressService(siteUrl, login, password, true);
    }
    public ExpressService getExpressService(String siteUrl, String login, String password, boolean debug)
    {
        if(expressService==null)
            expressService = new ExpressServiceImpl(siteUrl, login, password, debug, timeout, statistic);
        return expressService;
    }
}
