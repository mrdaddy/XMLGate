package by.iba.railway.eticket.xml.test;

import by.iba.railway.eticket.xml.dao.LocalLogger;
import by.iba.railway.eticket.xml.dao.dicts.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.dicts.CheckUpdatesRequest;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryRailwayRequest;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryStationListRequest;
import by.iba.railway.eticket.xml.objs.request.dicts.LibraryStationRequest;
import by.iba.railway.eticket.xml.objs.response.dicts.CheckUpdatesResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTrainInformationService extends TestUtils{
@Test
public void testLibraryCountry() {
    LocalLogger logger = new LocalLogger(getClass().getName()+".testLibraryCountry()");
	LibraryCountryDao countryDao = new LibraryCountryDao("","","", true, timeout,null) {
		protected String getDataString(String data) throws Exception {
            logger.info("data: " + data);
			return getFileToString("/response/xml/dicts/library-country.xml");
		}
	};
    try {
		CountryType country = countryDao.getCountriesByCodes("5","6").get(0);
		assertTrue("incorrect Code in getCountry","20".equals(country.getCode()));
		assertTrue("incorrect Tlf in getCountry","РЖД".equals(country.getTlf()));
		assertTrue("incorrect Name in getCountry","РОССИЯ".equals(country.getName()));

    } catch (Exception e) {
		e.printStackTrace();
	}
	
}
    @Test
    public void testLibraryRailway(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testLibraryRailway()");
        LibraryRailwayDao railwayDao = new LibraryRailwayDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/dicts/library-railway.xml");
            }
        };
        try {
            RailwayType railway = railwayDao.sendRequest(new LibraryRailwayRequest("F5","XX")).getRailway().get(0);

            logger.debug("NAME:"+railway.getName());
            logger.debug("CODE:"+railway.getCode());
            logger.debug("COUNTRY:"+railway.getCountryCode());
            logger.debug("TLF:" + railway.getTlf());

            assertTrue("incorrect Name in LibraryRailway", "ЮЖНО-УРАЛЬСКАЯ".equals(railway.getName()));
            assertTrue("incorrect Code in LibraryRailway","F5".equals(railway.getCode()));
            assertTrue("incorrect Country in LibraryRailway","20".equals(railway.getCountryCode()));
            assertTrue("incorrect Tlf in LibraryRailway","Ю-УР".equals(railway.getTlf()));
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testLibraryStation(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testLibraryStation()");
        LibraryStationDao stationDao = new LibraryStationDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/dicts/library-station.xml");
            }
        };
        try {
            StationType station = stationDao.sendRequest(new LibraryStationRequest(
                    new String[]{"1234567", "7894561", "7412589"},
                    new String[]{"Гоме", "Минс"})
            ).getStation().get(0);
            assertTrue("incorrect Code in LibraryStation","2000000".equals(station.getCode()));
            assertTrue("incorrect NameShort in LibraryStation","МОСКВА".equals(station.getNameShort()));
            assertTrue("incorrect NameFull in LibraryStation","МОСКВА".equals(station.getNameFull()));
            assertTrue("incorrect BaseStation in LibraryStation","".equals(station.getBaseStation()));
            assertTrue("incorrect BaseCode in LibraryStation","123".equals(station.getBaseCode()));
            assertTrue("incorrect SepNumber in LibraryStation","A12".equals(station.getSepNumber()));
            assertTrue("incorrect SF in LibraryStation","77".equals(station.getsF()));
            assertTrue("incorrect Okato in LibraryStation","1234567890".equals(station.getOkato()));

            logger.debug("NAME:" + station.getRailway().getName());
            logger.debug("TLF:" + station.getRailway().getTlf());
            logger.debug("CODE:" + station.getRailway().getCode());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testLibraryStationList(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testLibraryStationList()");
        LibraryStationListDao stationListDao = new LibraryStationListDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/dicts/library-station.xml");
            }
        };
        try {
            StationType stationList = stationListDao.sendRequest(new LibraryStationListRequest("Москва","RT12","M0")).getStation().get(0);
            assertTrue("incorrect Code in LibraryStationList","2000000".equals(stationList.getCode()));
            assertTrue("incorrect NameShort in LibraryStationList","МОСКВА".equals(stationList.getNameShort()));
            assertTrue("incorrect NameFull in LibraryStationList","МОСКВА".equals(stationList.getNameFull()));
            assertTrue("incorrect BaseStation in LibraryStationList","".equals(stationList.getBaseStation()));
            assertTrue("incorrect BaseCode in LibraryStationList","123".equals(stationList.getBaseCode()));
            assertTrue("incorrect SepNumber in LibraryStationList","A12".equals(stationList.getSepNumber()));
            assertTrue("incorrect SF in LibraryStationList","77".equals(stationList.getsF()));
            assertTrue("incorrect Okato in LibraryStationList","1234567890".equals(stationList.getOkato()));

            logger.debug("NAME:"+stationList.getRailway().getName());
            logger.debug("TLF:"+stationList.getRailway().getTlf());
            logger.debug("CODE:" + stationList.getRailway().getCode());

            StationType allStationList = stationListDao.sendRequest(new LibraryStationListRequest(true)).getStation().get(0);
            logger.debug("NAME:"+allStationList.getRailway().getName());
            logger.debug("TLF:"+allStationList.getRailway().getTlf());
            logger.debug("CODE:" + allStationList.getRailway().getCode());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testCheckUpdates(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testCheckUpdates()");
        CheckUpdatesDao checkUpdatesDao = new CheckUpdatesDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/dicts/check-updates.xml");
            }
        };
        try {
            CheckUpdatesResponse checkUpdates = checkUpdatesDao.sendRequest(new CheckUpdatesRequest());
            logger.debug("STATIONS_LAST_UPDATE:"+checkUpdates.getStations().getLastUpdate());
            logger.debug("SUBKL_LAST_UPDATE:"+checkUpdates.getSUBKL().getLastUpdate());
            assertTrue("incorrect Stations LastUpdate in CheckUpdates", "10.10.2010 12:23:44".equals(checkUpdates.getStations().getLastUpdate()));
            assertTrue("incorrect SUBKL LastUpdate in CheckUpdates","10.12.2010 15:46:12".equals(checkUpdates.getSUBKL().getLastUpdate()));
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
}
