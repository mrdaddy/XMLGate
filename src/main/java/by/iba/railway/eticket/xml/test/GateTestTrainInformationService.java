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

public class GateTestTrainInformationService extends TestUtils {
    private String url = "http://10.202.1.65:1908/bzd";
    private String login = "bzd";
    private String pass = "Bzd1209";

    @Test
    public void testLibraryCountry() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testLibraryCountry()");
        LibraryCountryDao countryDao = new LibraryCountryDao(url, login, pass, true, timeout,null);
        try {
            CountryType country = countryDao.getCountriesByCodes("21").get(0);
            logger.debug("Code " + country.getCode());
            logger.debug("Tlf " + country.getTlf());
            logger.debug("Name " + country.getName());
            assertTrue("incorrect Code in getCountry", "21".equals(country.getCode()));
            assertTrue("incorrect Tlf in getCountry", "БЧ".equals(country.getTlf()));
            assertTrue("incorrect Name in getCountry", "БЕЛАРУСЬ".equals(country.getName()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testLibraryRailway() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testLibraryRailway()");
        LibraryRailwayDao railwayDao = new LibraryRailwayDao(url, login, pass, true, timeout,null);
        try {
            RailwayType railway = railwayDao.sendRequest(new LibraryRailwayRequest("F5", "XX")).getRailway().get(0);

            logger.debug("NAME:" + railway.getName());
            logger.debug("CODE:" + railway.getCode());
            logger.debug("COUNTRY CODE:" + railway.getCountryCode());
            logger.debug("TLF:" + railway.getTlf());

            assertTrue("incorrect Name in LibraryRailway", "ЮЖНО-УРАЛЬСКАЯ".equals(railway.getName()));
            assertTrue("incorrect Code in LibraryRailway", "F5".equals(railway.getCode()));
            assertTrue("incorrect CountryCode in LibraryRailway", "20".equals(railway.getCountryCode()));
            assertTrue("incorrect Tlf in LibraryRailway", "Ю-УР".equals(railway.getTlf()));
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLibraryStation() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testLibraryStation()");
        LibraryStationDao stationDao = new LibraryStationDao(url, login, pass, true, timeout,null);
        try {
            StationType station = stationDao.sendRequest(new LibraryStationRequest(
                    new String[]{"2100100"},
                    new String[]{"Гоме", "Минс"})
            ).getStation().get(0);

            logger.debug("CODE:" + station.getCode());
            logger.debug("NAME:" + station.getRailway().getName());
            logger.debug("TLF:" + station.getRailway().getTlf());
            logger.debug("RAILWAY CODE:" + station.getRailway().getCode());
            logger.debug("SHORT NAME:" + station.getNameShort());

            assertTrue("incorrect Code in LibraryStation", "2100100".equals(station.getCode()));
            assertTrue("incorrect NameShort in LibraryStation", "ГОМЕЛЬ ПАС".equals(station.getNameShort()));
            assertTrue("incorrect NameFull in LibraryStation", "ГОМЕЛЬ-ПАССАЖИРСКИЙ".equals(station.getNameFull()));
            assertTrue("incorrect SepNumber in LibraryStation", "04".equals(station.getSepNumber()));

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }

    /*@Test
    public void testLibraryStationList() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testLibraryStationList()");
        LibraryStationListDao stationListDao = new LibraryStationListDao(url, login, pass);
        try {
            StationType stationList = stationListDao.sendRequest(new LibraryStationListRequest("ГОМЕЛЬ-ПАССАЖИРСКИЙ", "", "21")).getStation().get(0);

            logger.debug("NAME:" + stationList.getRailway().getName());
            logger.debug("TLF:" + stationList.getRailway().getTlf());
            logger.debug("CODE:" + stationList.getRailway().getCode());

            StationType allStationList = stationListDao.sendRequest(new LibraryStationListRequest(true)).getStation().get(0);
            logger.debug("NAME:" + allStationList.getRailway().getName());
            logger.debug("TLF:" + allStationList.getRailway().getTlf());
            logger.debug("CODE:" + allStationList.getRailway().getCode());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
*/
    @Test
    public void testCheckUpdates() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testCheckUpdates()");
        CheckUpdatesDao checkUpdatesDao = new CheckUpdatesDao(url, login, pass, true, timeout,null);
        try {
            CheckUpdatesResponse checkUpdates = checkUpdatesDao.sendRequest(new CheckUpdatesRequest());
            logger.debug("STATIONS_LAST_UPDATE:" + checkUpdates.getStations().getLastUpdate());
//            logger.debug("SUBKL_LAST_UPDATE:"+checkUpdates.getSUBKL().getLastUpdate());
            assertTrue("incorrect Stations LastUpdate in CheckUpdates", checkUpdates.getStations().getLastUpdate() != null);
            //          assertTrue("incorrect SUBKL LastUpdate in CheckUpdates","10.12.2010 15:46:12".equals(checkUpdates.getSUBKL().getLastUpdate()));
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
}
