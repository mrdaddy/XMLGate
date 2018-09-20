package by.iba.railway.eticket.xml.services;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.response.dicts.CheckUpdatesResponse;
import by.iba.railway.eticket.xml.objs.response.dicts.LibrarySubklResponse;
import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;
import by.iba.railway.eticket.xml.objs.response.type.dicts.StationType;

import java.util.List;

public interface GatewayService {

    public CountryType getCountry(int code) throws XmlParserSystemException, BusinessSystemException;
    public List<CountryType> getCountriesByCodes(int... code) throws XmlParserSystemException, BusinessSystemException;
    public List<CountryType> getCountries() throws XmlParserSystemException, BusinessSystemException;

    public RailwayType getRailway(String code) throws XmlParserSystemException, BusinessSystemException;
    public List<RailwayType> getRailways() throws XmlParserSystemException, BusinessSystemException;
    public List<RailwayType> getRailwaysByCodes(String... code) throws XmlParserSystemException, BusinessSystemException;

    public List<StationType> getStationsByCodesOrNames(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException;
    public StationType getStationByCodeOrName(String[] codes, String[] names) throws XmlParserSystemException, BusinessSystemException;

    public List<StationType> getStationsList(String name, String roadCode,
                                             Long countryCode) throws XmlParserSystemException, BusinessSystemException;
    public List<StationType> getStationsList() throws XmlParserSystemException, BusinessSystemException;
    public StationType getStation(String name, String roadCode,
                                  Long countryCode) throws XmlParserSystemException, BusinessSystemException;

    public LibrarySubklResponse getBenefitInfo() throws XmlParserSystemException, BusinessSystemException;

    public String getStationsLastUpdate() throws XmlParserSystemException, BusinessSystemException;
    public String getBenefitsLastUpdate() throws XmlParserSystemException, BusinessSystemException;

    public CheckUpdatesResponse getCheckUpdatesInfo() throws XmlParserSystemException, BusinessSystemException;
}
