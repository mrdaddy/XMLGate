package by.iba.railway.eticket.xml.services;

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
import by.iba.railway.eticket.xml.objs.response.type.G40.TrainType;

import java.util.List;

public interface ExpressService {
    public by.iba.railway.eticket.xml.objs.response.type.G50.TrainType getActualArrivalTrain(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException;

    public List<TrainType> getAppointCancelTrains(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException;

    public DelayTrainsG51Response getDelayTrainsInfo(String station, String arrivalDate) throws XmlParserSystemException, BusinessSystemException;

    public List<? extends Direction> getPlacesBetweenStationsInfo(String stationFrom, boolean isShowWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException;

    public List<? extends Direction> getScheduleRouteDirections(String stationFrom, String stationTo, List<DirectionRequestType> directions, boolean isStandard, String filter) throws XmlParserSystemException, BusinessSystemException;

    public ScheduleStationG19Response getScheduleStationInfo(String station, String date) throws XmlParserSystemException, BusinessSystemException;

    public TrainCarPlacesG62Response getTrainCarPlacesInfo(String stationFrom, String stationTo, String date, String depTime, by.iba.railway.eticket.xml.objs.request.type.common.TrainType train, CarType car, TariffType tariff) throws XmlParserSystemException, BusinessSystemException;

    public List<by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType> getTrainByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException;

    public List<? extends Direction> getTrainPlacesDirections(String stationFrom, String stationTo, TariffType tariff, List<by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType> directions, boolean isShowWithoutPlaces, boolean isDetailNumPlaces, boolean isDetailTypePlaces) throws XmlParserSystemException, BusinessSystemException;

    public List<RoutesType> getTrainRoutes(String trainNumber, String station, String date, String answer, boolean isStandard) throws XmlParserSystemException, BusinessSystemException;
    public by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType getTrainRouteTrain(String trainNumber, String station, String date, String answer, boolean isStandard) throws XmlParserSystemException, BusinessSystemException;

    public by.iba.railway.eticket.xml.objs.response.type.G46.TrainType getTrainSchemeTrain(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException;
    public String getTrainSchemeSignsInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException;

    public ActualArrivalG50Response getActualArrivalInfo(String trainNumber, String arrivalDate) throws XmlParserSystemException, BusinessSystemException;
    public AppointCancelTrainsG40Response getAppointCancelInfo(String trainNumbers, DateType datePeriod) throws XmlParserSystemException, BusinessSystemException;
    public PlacesG60Response getPlacesInfo(String stationFrom, String showWithoutPlaces, List<DirectionRequestType> directions, String carrier, TariffType tariff, String stationTo) throws XmlParserSystemException, BusinessSystemException;
    public ScheduleRouteG11Response getScheduleRouteInfo(String stationFrom, String stationTo, List<DirectionRequestType> directions, String standard, String filter) throws XmlParserSystemException, BusinessSystemException;
    public TrainNumberG15Response getInfoByTrainNumber(String trainNumber) throws XmlParserSystemException, BusinessSystemException;
    public TrainPlacesG61Response getTrainPlacesInfo(String stationFrom, String stationTo, TariffType tariff, List<DirectionType> directions, String showWithoutPlaces, String detailNumPlaces, String detailTypePlaces) throws XmlParserSystemException, BusinessSystemException;
    public TrainRouteG18Response getTrainRouteInfo(String trainNumber, String station, String date, String answer, String standard) throws XmlParserSystemException, BusinessSystemException;
    public TrainSchemeG46Response getTrainSchemeInfo(String trainNumber, String date) throws XmlParserSystemException, BusinessSystemException;

}
