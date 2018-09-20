package by.iba.railway.eticket.xml.services.impl;


import by.iba.railway.eticket.xml.dao.dicts.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.response.dicts.CheckUpdatesResponse;
import by.iba.railway.eticket.xml.objs.response.dicts.LibrarySubklResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;
import by.iba.railway.eticket.xml.services.GatewayService;

import java.util.List;

public class GatewayServiceImpl extends TrainServiceBase implements GatewayService{
	protected LibraryCountryDao libraryCountryDao;
    protected LibraryRailwayDao libraryRailwayDao;
    protected LibraryStationDao libraryStationDao;
    protected LibraryStationListDao libraryStationListDao;
    protected LibrarySubklDao librarySubklDao;
    protected CheckUpdatesDao checkUpdatesDao;

	public GatewayServiceImpl(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
		super(siteUrl,login,password);
        libraryCountryDao = new LibraryCountryDao(siteUrl, login, password, debug, timeout, statistic);
        libraryRailwayDao = new LibraryRailwayDao(siteUrl, login, password, debug, timeout, statistic);
        libraryStationDao = new LibraryStationDao(siteUrl, login, password, debug, timeout, statistic);
        libraryStationListDao = new LibraryStationListDao(siteUrl, login, password, debug, timeout, statistic);
        librarySubklDao = new LibrarySubklDao(siteUrl, login, password, debug, timeout, statistic);
        checkUpdatesDao = new CheckUpdatesDao(siteUrl, login, password, debug, timeout, statistic);
	}

    
    public CountryType getCountry(int code) throws XmlParserSystemException, BusinessSystemException {
        return libraryCountryDao.getCountry(String.valueOf(code));
    }

    
    public List<CountryType> getCountriesByCodes(int... code) throws XmlParserSystemException, BusinessSystemException {
        String[] codeStr = new String[code.length];
        for(int i=0;i<code.length;i++)
            codeStr[i] = String.valueOf(code[i]);
        return libraryCountryDao.getCountriesByCodes(codeStr);
    }

    
    public List<CountryType> getCountries() throws XmlParserSystemException, BusinessSystemException {
        return libraryCountryDao.getCountries();
    }

    
    public RailwayType getRailway(String code) throws XmlParserSystemException, BusinessSystemException {
        return libraryRailwayDao.getRailway(code);
    }

    
    public List<RailwayType> getRailways() throws XmlParserSystemException, BusinessSystemException {
        return libraryRailwayDao.getRailways();
    }

    
    public List<RailwayType> getRailwaysByCodes(String... code) throws XmlParserSystemException, BusinessSystemException {
        return libraryRailwayDao.getRailwaysByCodes(code);
    }

    
    public List<StationType> getStationsByCodesOrNames(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException {
        return libraryStationDao.getStationsByCodesOrNames(codes, names);
    }

    
    public StationType getStationByCodeOrName(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException {
        return libraryStationDao.getStationByCodeOrName(codes, names);
    }

    
    public List<StationType> getStationsList(String name, String roadCode, Long countryCode) throws XmlParserSystemException, BusinessSystemException {
        return libraryStationListDao.getStationsList(name, roadCode, String.valueOf(countryCode));
    }

    
    public List<StationType> getStationsList() throws XmlParserSystemException, BusinessSystemException {
        return libraryStationListDao.getStationsList();
    }

    
    public StationType getStation(String name, String roadCode, Long countryCode) throws XmlParserSystemException, BusinessSystemException {
        return libraryStationListDao.getStation(name, roadCode, String.valueOf(countryCode));
    }

    
    public LibrarySubklResponse getBenefitInfo() throws XmlParserSystemException, BusinessSystemException {
        return librarySubklDao.getBenefitInfo();
    }

    
    public String getStationsLastUpdate() throws XmlParserSystemException, BusinessSystemException {
        return checkUpdatesDao.getStationsLastUpdate();
    }

    
    public String getBenefitsLastUpdate() throws XmlParserSystemException, BusinessSystemException {
        return checkUpdatesDao.getBenefitsLastUpdate();
    }

    public CheckUpdatesResponse getCheckUpdatesInfo() throws XmlParserSystemException, BusinessSystemException {
        return checkUpdatesDao.getCheckUpdatesInfo();
    }
}
