package by.iba.railway.eticket.xml.services.impl;

import by.iba.railway.eticket.xml.dao.express.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.type.G40.DateType;
import by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;
import by.iba.railway.eticket.xml.objs.response.express.*;
import by.iba.railway.eticket.xml.objs.response.express.interfaces.Direction;
import by.iba.railway.eticket.xml.objs.response.type.G18.RoutesType;
import by.iba.railway.eticket.xml.objs.response.type.G50.TrainType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;
import by.iba.railway.eticket.xml.services.ExpressService;

import java.util.List;

public class ExpressServiceImpl extends TrainServiceBase implements ExpressService {
    protected ActualArrivalG50Dao actualArrivalG50Dao = null;
    protected AppointCancelTrainsG40Dao appointCancelTrainsG40Dao = null;
    protected DelayTrainsG51Dao delayTrainsG51Dao = null;
    protected PlacesG60Dao placesG60Dao = null;
    protected ScheduleStationG19Dao scheduleStationG19Dao = null;
    protected TrainCarPlacesG62Dao trainCarPlacesG62Dao = null;
    protected TrainNumberG15Dao trainNumberG15Dao = null;
    protected TrainPlacesG61Dao trainPlacesG61Dao = null;
    protected TrainRouteG18Dao trainRouteG18Dao = null;
    protected TrainSchemeG46Dao trainSchemeG46Dao = null;
    protected ScheduleRouteG11Dao scheduleRouteG11Dao = null;

    public ExpressServiceImpl(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
		super(siteUrl,login,password);
        actualArrivalG50Dao = new ActualArrivalG50Dao(siteUrl, login, password, debug, timeout, statistic);
        appointCancelTrainsG40Dao = new AppointCancelTrainsG40Dao(siteUrl, login, password, debug, timeout, statistic);
        delayTrainsG51Dao = new DelayTrainsG51Dao(siteUrl, login, password, debug, timeout, statistic);
        placesG60Dao = new PlacesG60Dao(siteUrl, login, password, debug, timeout, statistic);
        scheduleStationG19Dao = new ScheduleStationG19Dao(siteUrl, login, password, debug, timeout, statistic);
        trainCarPlacesG62Dao = new TrainCarPlacesG62Dao(siteUrl, login, password, debug, timeout, statistic);
        trainNumberG15Dao = new TrainNumberG15Dao(siteUrl, login, password, debug, timeout, statistic);
        trainPlacesG61Dao = new TrainPlacesG61Dao(siteUrl, login, password, debug, timeout, statistic);
        trainRouteG18Dao = new TrainRouteG18Dao(siteUrl, login, password, debug, timeout, statistic);
        trainSchemeG46Dao = new TrainSchemeG46Dao(siteUrl, login, password, debug, timeout, statistic);
        scheduleRouteG11Dao = new ScheduleRouteG11Dao(siteUrl, login, password, debug, timeout, statistic);
	}

    
    public TrainType getActualArrivalTrain(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        return actualArrivalG50Dao.getActualArrivalTrain(trainNumber, arrivalDate);
    }

    
    public List<by.iba.railway.eticket.xml.objs.response.type.G40.TrainType> getAppointCancelTrains(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException {
        return appointCancelTrainsG40Dao.getAppointCancelTrains(trainNumbers,datePeriod);
    }

    
    public DelayTrainsG51Response getDelayTrainsInfo(String station, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        return delayTrainsG51Dao.getDelayTrainsInfo(station, arrivalDate);
    }

    
    public List<? extends Direction> getPlacesBetweenStationsInfo(String stationFrom, boolean isShowWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException {
        String showWithoutPlaces = "0";
        if(isShowWithoutPlaces == true)
            showWithoutPlaces = "1";
        return placesG60Dao.getPlacesBetweenStationsDirections(stationFrom, showWithoutPlaces, directions, carrier, tariff, stationTo);
    }

    
    public List<? extends Direction> getScheduleRouteDirections(String stationFrom, String stationTo, List<DirectionRequestType> directions, boolean isStandard, String filter) throws XmlParserSystemException, BusinessSystemException {
        String standard = null;
        if(isStandard == true)
            standard = "";
        return scheduleRouteG11Dao.getScheduleRouteDirections(stationFrom, stationTo,directions,standard,filter);
    }

    
    public ScheduleStationG19Response getScheduleStationInfo(String station, String date) throws XmlParserSystemException, BusinessSystemException {
        return scheduleStationG19Dao.getScheduleStationInfo(station, date);
    }

    
    public TrainCarPlacesG62Response getTrainCarPlacesInfo(String stationFrom, String stationTo, String date, String depTime, by.iba.railway.eticket.xml.objs.request.type.common.TrainType train, CarType car, TariffType tariff) throws XmlParserSystemException, BusinessSystemException {
        return trainCarPlacesG62Dao.getTrainCarPlacesInfo(stationFrom, stationTo, date, depTime, train, car, tariff);
    }

    
    public List<by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType> getTrainByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException {
        return trainNumberG15Dao.getTrainByTrainNumber(trainNumber);
    }

    
    public List<? extends Direction> getTrainPlacesDirections(String stationFrom, String stationTo, TariffType tariff, List<by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType> directions, boolean isShowWithoutPlaces, boolean isDetailNumPlaces, boolean isDetailTypePlaces) throws XmlParserSystemException, BusinessSystemException {
        String showWithoutPlaces = "0";
        String detailNumPlaces = "0";
        String detailTypePlaces = "0";
        if(isShowWithoutPlaces == true)
            showWithoutPlaces = "1";
        if(isDetailNumPlaces == true)
            detailNumPlaces = "1";
        if(isDetailTypePlaces == true)
            detailTypePlaces = "1";
        return trainPlacesG61Dao.getTrainPlacesDirections(stationFrom,stationTo,tariff,directions,showWithoutPlaces,detailNumPlaces,detailTypePlaces);
    }

    
    public List<RoutesType> getTrainRoutes(String trainNumber, String station, String date, String answer, boolean isStandard) throws XmlParserSystemException, BusinessSystemException {
        String standard = null;
        if(isStandard == true)
            standard = "";
        return trainRouteG18Dao.getTrainRoutes(trainNumber,station,date,answer,standard);
    }

    
    public by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType getTrainRouteTrain(String trainNumber, String station, String date, String answer, boolean isStandard) throws XmlParserSystemException, BusinessSystemException {
        String standard = null;
        if(isStandard == true)
            standard = "";
        return trainRouteG18Dao.getTrainRouteTrain(trainNumber,station,date,answer,standard);
    }

    
    public by.iba.railway.eticket.xml.objs.response.type.G46.TrainType getTrainSchemeTrain(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        return trainSchemeG46Dao.getTrainSchemeTrain(trainNumber,date);
    }

    
    public String getTrainSchemeSignsInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        return trainSchemeG46Dao.getTrainSchemeSignsInfo(trainNumber,date);
    }

    public ActualArrivalG50Response getActualArrivalInfo(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException {
        return actualArrivalG50Dao.getActualArrivalInfo(trainNumber, arrivalDate);
    }

    public AppointCancelTrainsG40Response getAppointCancelInfo(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException {
        return appointCancelTrainsG40Dao.getAppointCancelInfo(trainNumbers, datePeriod);
    }

    public PlacesG60Response getPlacesInfo(String stationFrom, String showWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException {
        return placesG60Dao.getPlacesInfo(stationFrom, showWithoutPlaces, directions, carrier, tariff, stationTo);
    }

    public ScheduleRouteG11Response getScheduleRouteInfo(String stationFrom, String stationTo, List<DirectionRequestType> directions, String standard, String filter) throws XmlParserSystemException, BusinessSystemException {
        return scheduleRouteG11Dao.getScheduleRouteInfo(stationFrom, stationTo, directions, standard, filter);
    }

    public TrainNumberG15Response getInfoByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException {
        return trainNumberG15Dao.getInfoByTrainNumber(trainNumber);
    }

    public TrainPlacesG61Response getTrainPlacesInfo(String stationFrom, String stationTo, TariffType tariff, List<DirectionType> directions, String showWithoutPlaces, String detailNumPlaces, String detailTypePlaces) throws XmlParserSystemException, BusinessSystemException {
        return trainPlacesG61Dao.getTrainPlacesInfo(stationFrom, stationTo, tariff, directions, showWithoutPlaces, detailNumPlaces, detailTypePlaces);
    }

    public TrainRouteG18Response getTrainRouteInfo(String trainNumber, String station, String date, String answer, String standard) throws XmlParserSystemException, BusinessSystemException {
        return trainRouteG18Dao.getTrainRouteInfo(trainNumber, station, date, answer, standard);
    }

    public TrainSchemeG46Response getTrainSchemeInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException {
        return trainSchemeG46Dao.getTrainSchemeInfo(trainNumber, date);
    }
}
