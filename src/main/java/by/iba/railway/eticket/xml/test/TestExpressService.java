package by.iba.railway.eticket.xml.test;

import by.iba.railway.eticket.xml.dao.LocalLogger;
import by.iba.railway.eticket.xml.dao.express.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.*;
import by.iba.railway.eticket.xml.objs.request.type.G40.DateType;
import by.iba.railway.eticket.xml.objs.request.type.G6x.TariffType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;
import by.iba.railway.eticket.xml.objs.request.type.common.Time;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.*;
import by.iba.railway.eticket.xml.objs.response.type.G11.DirectionG11Type;
import by.iba.railway.eticket.xml.objs.response.type.G61.DirectionG61Type;
import by.iba.railway.eticket.xml.objs.response.type.G62.CarG62Type;
import by.iba.railway.eticket.xml.objs.response.type.G62.TrainG62Type;
import org.junit.Test;

import java.util.ArrayList;

public class TestExpressService extends  TestUtils {
    @Test
    public void testScheduleRouteG11() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testScheduleRouteG11()");
        ScheduleRouteG11Dao scheduleRouteDao = new ScheduleRouteG11Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/schedule-route-g11.xml");
            }
        };
        try {
            DirectionG11Type direction = prepareScheduleRouteG11(scheduleRouteDao).getDirection().get(0);
            logger.debug("number:"+direction.getTrains().get(0).getTrain().get(0).getNumber());
            logger.debug("notAll:" + direction.getNotAllTrains());
            logger.debug("passRoute:" + direction.getPassRoute().getTo());
            logger.debug("type:" + direction.getType());
            logger.debug("trains:" + direction.getTrains().get(0).getTrain().size());

            logger.debug("passRouteCodeFrom:" + direction.getPassRoute().getCodeFrom());
            logger.debug("passRouteCodeTo:" + direction.getPassRoute().getCodeTo());
            logger.debug("number2:"+direction.getTrains().get(0).getTrain().get(0).getNumber2());
            logger.debug("number3:"+direction.getTrains().get(0).getTrain().get(0).getNumber3());
            logger.debug("getStorageIC:"+direction.getTrains().get(0).getTrain().get(0).getStorageIC());
            logger.debug("getRoute().getCodeFrom:"+direction.getTrains().get(0).getTrain().get(0).getRoute().getCodeFrom());
            logger.debug("getRoute().getCodeTo:"+direction.getTrains().get(0).getTrain().get(0).getRoute().getCodeTo());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testScheduleStationG19(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testScheduleStationG19()");
        ScheduleStationG19Dao scheduleStationDao = new ScheduleStationG19Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: "+data);
                return getFileToString("/response/xml/express/schedule-station-g19.xml");
            }
        };
        try {
            ScheduleStationG19Response response = scheduleStationDao.sendRequest(new ScheduleStationG19Request("МИНСК", "12.01.1999"));
            showDebugScheduleStationG19(logger,response);
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException ex){

        }
    }
    @Test
    public void testPlacesG60(){
        LocalLogger logger = new LocalLogger(getClass().getName()+".testPlacesG60()");
        PlacesG60Dao placesG60Dao = new PlacesG60Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: "+data);
                return getFileToString("/response/xml/express/places-g60.xml");
            }
        };
        try {
            PlacesG60Response responseForPlaces = preparePlacesG60(placesG60Dao);
            logger.debug("type:"+responseForPlaces.getType());
            logger.debug("size:"+responseForPlaces.getDirection().size());
            logger.debug("showWithoutPlaces:"+responseForPlaces.getShowWithoutPlaces());
            logger.debug(responseForPlaces.getDirection().get(0).getType());

            logger.debug("saleOnFour:"+responseForPlaces.getDirection().get(0).getTrains().get(0).getTrain().get(0).getPlaces().getCars().get(0).getTariffs().getTariff().get(0).getSaleOnFour());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }
    @Test
     public void testActualArrivalG50() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testActualArrivalG50()");
        ActualArrivalG50Dao actualArrivalG50Dao = new ActualArrivalG50Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/actual-arrival-g50.xml");
            }
        };
        try {
            by.iba.railway.eticket.xml.objs.response.type.G50.TrainType trains = actualArrivalG50Dao.sendRequest(new ActualArrivalG50Request(new TrainType("number"),"date")).getTrain();
            logger.debug("number:"+trains.getNumber());
            logger.debug("ArvActual date:"+trains.getArvActual().getDate());
            logger.debug("ArvActual time:"+trains.getArvActual().getTime());
            logger.debug("ArvSchedule date:"+trains.getArvSchedule().getDate());
            logger.debug("ArvSchedule time:"+trains.getArvSchedule().getTime());
            logger.debug("DelayTime time:"+trains.getDelayTime());
            logger.debug("Station:"+trains.getStation());


        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
     public void testAppointCancelTrainsG40() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testAppointCancelTrainsG40()");
        AppointCancelTrainsG40Dao appointCancelTrainsG40Dao = new AppointCancelTrainsG40Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/appoint-cancel-trains-g40.xml");
            }
        };
        try {
            by.iba.railway.eticket.xml.objs.response.type.G40.TrainType train = appointCancelTrainsG40Dao.sendRequest(new AppointCancelTrainsG40Request("trains numbers",new DateType("from","to"))).getTrain().get(0);
            logger.debug("number:"+train.getNumber());
            logger.debug("DateTimeInfo:"+train.getDateTimeInfo());
            logger.debug("getDaysOfGo:"+train.getDaysOfGo());
            logger.debug("first Station:"+train.getRoute().getStation().get(0));

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDelayTrainsG51() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testDelayTrainsG51()");
        DelayTrainsG51Dao delayTrainsG51Dao = new DelayTrainsG51Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/delay-trains-g51.xml");
            }
        };
        try {
            DelayTrainsG51Response delayTrainsG51Response = delayTrainsG51Dao.sendRequest(new DelayTrainsG51Request("Minsk", "date"));
            by.iba.railway.eticket.xml.objs.response.type.G51.TrainType train = delayTrainsG51Response.getTrains().getTrain().get(0);
            logger.debug("number:"+train.getNumber());
            logger.debug("Arrival DelayTime:"+train.getArrival().getDelayTime());
            logger.debug("Arrival ScheduleTime:"+train.getArrival().getScheduleTime());
            logger.debug("first route Station:"+train.getRoute().getStation().get(0));
            logger.debug("Station:"+delayTrainsG51Response.getStation());
            logger.debug("Date:"+delayTrainsG51Response.getDate());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testTrainCarPlacesG62() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testTrainCarPlacesG62()");
        TrainCarPlacesG62Dao trainCarPlacesG62Dao = new TrainCarPlacesG62Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/train-car-places-g62.xml");
            }
        };
        try {

            TrainCarPlacesG62Response trainCarPlacesG62Response = trainCarPlacesG62Dao.sendRequest(new TrainCarPlacesG62Request("from","to","ДД.ММ.ГГГГ","Время отправления поезда",new TrainType("112A"),new CarType("КУПЕ","009"),new TariffType("type")));
            TrainG62Type train = trainCarPlacesG62Response.getTrains().getTrain().get(0);
            logger.debug("passRoute From:"+trainCarPlacesG62Response.getPassRoute().getFrom());
            logger.debug("passRoute To:"+trainCarPlacesG62Response.getPassRoute().getTo());
            logger.debug("trains date:"+trainCarPlacesG62Response.getTrains().getDate());
            logger.debug("number:"+train.getNumber());

            logger.debug("Departure Time:"+train.getDeparture().getTime());
            logger.debug("Departure Stop:"+train.getDeparture().getStop());
            logger.debug("Arrival Date:"+train.getArrival().getDate());
            logger.debug("Arrival Time:"+train.getArrival().getTime());
            logger.debug("Arrival Stop:"+train.getArrival().getStop());
            logger.debug("TimeInWay:"+train.getTimeInWay());
            logger.debug("ElRegPossible:"+train.getElRegPossible());
            logger.debug("Brand:"+train.getBrand());
            logger.debug("FirmName:"+train.getFirmName());
            logger.debug("CommentInfo 2:"+train.getComments().getInfo().get(1));

            CarG62Type car = train.getCar().get(0);
            logger.debug("carNumber:"+car.getNumber());
            logger.debug("carType:"+car.getType());
            logger.debug("TrainLetter:"+car.getTrainLetter());
            logger.debug("AddSigns:"+car.getFare().get(1).getAddSigns());
            logger.debug("Seats Undef:"+car.getFare().get(1).getSeats().getSeatsUndef());
            logger.debug("Seats Dn:"+car.getFare().get(1).getSeats().getSeatsDn());
            logger.debug("Seats Up:"+car.getFare().get(1).getSeats().getSeatsUp());
            logger.debug("TariffBillet:"+car.getFare().get(1).getTariffBillet());
            logger.debug("Places:"+car.getFare().get(1).getPlaces());

            logger.debug("getDepartureTrainDate:"+train.getDepartureTrain().getDate());
            logger.debug("getDepartureTrainTime:"+train.getDepartureTrain().getTime());
            logger.debug("getLength:"+train.getLength());
            logger.debug("getSaleOnFour:"+car.getFare().get(0).getSaleOnFour());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testTrainNumberG15() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testTrainNumberG15()");
        TrainNumberG15Dao trainNumberG15Dao = new TrainNumberG15Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/train-number-g15.xml");
            }
        };
        try {
            by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType train = trainNumberG15Dao.sendRequest(new TrainNumberG15Request("номер поезда")).getTrain().get(1);

            logger.debug("number:"+train.getNumber());
            logger.debug("first route station:"+train.getRoute().getStation().get(0));

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testTrainRouteG18() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testTrainRouteG18()");
        TrainRouteG18Dao trainRouteG18Dao = new TrainRouteG18Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/train-route-g18.xml");
            }
        };
        try {
            TrainRouteG18Request trainRouteG18Request = new TrainRouteG18Request(new TrainType("номер поезда"),"Станция","дата","Full");
            trainRouteG18Request.setStandard("");
            TrainRouteG18Response trainRouteG18Response = trainRouteG18Dao.sendRequest(trainRouteG18Request);
            logger.debug("number:" + trainRouteG18Response.getTrain().getNumber());
            logger.debug("second route station:" + trainRouteG18Response.getTrain().getRoute().getStation().get(1));
            logger.debug("routes title:" + trainRouteG18Response.getRoutes().get(1).getTitle());
            logger.debug("routes second route second station:" + trainRouteG18Response.getRoutes().get(1).getRoute().get(1).getStation().get(1));
            logger.debug("routes 2stop code:" + trainRouteG18Response.getRoutes().get(1).getStop().get(1).getCode());
            logger.debug("routes 2stop station:" + trainRouteG18Response.getRoutes().get(1).getStop().get(1).getStation());
            logger.debug("routes 2stop days:" + trainRouteG18Response.getRoutes().get(1).getStop().get(1).getDays());
            logger.debug("routes 2stop distance:" + trainRouteG18Response.getRoutes().get(1).getStop().get(1).getDistance());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testTrainSchemeG46() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testTrainSchemeG46()");
        TrainSchemeG46Dao trainSchemeG46Dao = new TrainSchemeG46Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/train-scheme-g46.xml");
            }
        };
        try {
            TrainSchemeG46Response trainSchemeG46Response = trainSchemeG46Dao.sendRequest(new TrainSchemeG46Request(new TrainType("номер"),"дата"));

            logger.debug("SignsInfo:" + trainSchemeG46Response.getSignsInfo());
            logger.debug("number:" + trainSchemeG46Response.getTrain().getNumber());
            logger.debug("ClassService:" + trainSchemeG46Response.getTrain().getCar().get(1).getClassService().getType());
            logger.debug("2 Sign:" + trainSchemeG46Response.getTrain().getCar().get(1).getSigns().getSign().get(1));
            logger.debug("Seats count:" + trainSchemeG46Response.getTrain().getCar().get(1).getSeats().getCount());
            logger.debug("cliche station:" + trainSchemeG46Response.getTrain().getCar().get(1).getCliche().get(0).getStation());
            logger.debug("cliche seats last:" + trainSchemeG46Response.getTrain().getCar().get(1).getCliche().get(0).getSeats().getLast());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testTrainPlacesG61() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testTrainPlacesG61()");
        TrainPlacesG61Dao trainPlacesG61Dao = new TrainPlacesG61Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/express/train-places-g61.xml");
            }
        };
        try {
            TrainPlacesG61Request trainPlacesG61Request = new TrainPlacesG61Request("from",new TariffType("тариф"),"to");
            trainPlacesG61Request.setDetailNumPlaces("1");
            trainPlacesG61Request.setShowWithoutPlaces("1");
            trainPlacesG61Request.setDetailTypePlaces("0");
            by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType direction1 = new by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType("дата отправления","время","Forward", new TrainType("номер"));
            trainPlacesG61Request.getDirection().add(direction1);
            DirectionG61Type directionForward = trainPlacesG61Dao.sendRequest(trainPlacesG61Request).getDirection().get(0);

            logger.debug("Type:" + directionForward.getType());
            logger.debug("PassRoute From:" + directionForward.getPassRoute().getFrom());
            logger.debug("PassRoute To:" + directionForward.getPassRoute().getTo());
            logger.debug("train date:" + directionForward.getTrains().get(0).getDate());
            logger.debug("train size:" + directionForward.getTrains().get(0).getTrain().size());
            logger.debug("train type:" + directionForward.getTrains().get(0).getTrain().get(0).getType());
            logger.debug("train number2:" + directionForward.getTrains().get(0).getTrain().get(0).getNumber2());
            logger.debug("train number:" + directionForward.getTrains().get(0).getTrain().get(0).getNumber());
            logger.debug("departure stop:" + directionForward.getTrains().get(0).getTrain().get(0).getDeparture().getStop());
            logger.debug("cars trainLetter:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getTrainLetter());
            logger.debug("cars type:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getType());
            logger.debug("DesignCar.info:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getCar().get(0).getDesignCar().getInfo());
            logger.debug("SeatsFemale:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getCar().get(0).getSeatsSex().getSeatsFemale());
            logger.debug("Places:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getCar().get(0).getPlaces());

            logger.debug("getDepartureTrainDate:" + directionForward.getTrains().get(0).getTrain().get(0).getDepartureTrain().getDate());
            logger.debug("getDepartureTrainTime:" + directionForward.getTrains().get(0).getTrain().get(0).getDepartureTrain().getTime());
            logger.debug("getLength:" + directionForward.getTrains().get(0).getTrain().get(0).getLength());
            logger.debug("saleOnFour:" + directionForward.getTrains().get(0).getTrain().get(0).getCars().get(0).getSaleOnFour());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testError() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testError()");
        TrainSchemeG46Dao trainSchemeG46Dao = new TrainSchemeG46Dao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/error.xml");
            }
        };
        try {
           TrainSchemeG46Response errorResponse = trainSchemeG46Dao.sendRequest(new TrainSchemeG46Request());
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
            logger.debug(e.getClass()+" tested success");
        }
    }
    private PlacesG60Response preparePlacesG60(PlacesG60Dao placesG60Dao) throws XmlParserSystemException, BusinessSystemException {
        ArrayList<DirectionRequestType> listForPlaces = new ArrayList<DirectionRequestType>();
        DirectionRequestType directionForPlaces = new DirectionRequestType();
        directionForPlaces.setType("Forward");
        directionForPlaces.setCarrier("Перевозчик");
        directionForPlaces.setDepDate(new Time("01.01.2010","05.01.2010"));
        directionForPlaces.setFullDay("");
        directionForPlaces.setDepTime(new Time("fromDep","toDep","codeDep"));
        directionForPlaces.setArvTime(new Time("fromArv","toArv","codeArv"));
        listForPlaces.add(directionForPlaces);

        return placesG60Dao.sendRequest(new PlacesG60Request("from","without",listForPlaces,"carrier",new TariffType(),"to"));
    }

    private void showDebugScheduleStationG19(LocalLogger logger, ScheduleStationG19Response response) {
        logger.debug("addons:" + response.getAddons());
        logger.debug("date:" + response.getDate());
        logger.debug(response.getDepTrains().getTrain().get(0).getTimeInWay());
        logger.debug(response.getDepTrains().getTrain().get(0).getArvTime());
        logger.debug(response.getDepTrains().getTrain().get(0).getDaysOfGo());
        logger.debug(response.getDepTrains().getTrain().get(0).getDepTime());
        logger.debug(response.getDepTrains().getTrain().get(0).getStopTime());
        logger.debug(response.getDepTrains().getTrain().get(0).getCarType());
        logger.debug(response.getDepTrains().getTrain().get(0).getRoute().getStation().size());
        logger.debug(response.getDepTrains().getTrain().get(0).getRoute().getStation().get(0));
        logger.debug(response.getDepTrains().getTrain().get(0).getRoute().getStation().get(1));
        logger.debug(response.getDepTrains().getTrain().get(0).getRoute().getStation().get(2));
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getName());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getCode());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getCountryCode());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getTlf());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getValue());
        logger.debug(response.getDepTrains().getTrain().size());
        logger.debug("station:" + response.getStation());
        logger.debug(response.getTransitTrains());
        logger.debug(response.getType());
        logger.debug("error:"+response.getError());
    }

    private ScheduleRouteG11Response prepareScheduleRouteG11(ScheduleRouteG11Dao scheduleRouteDao) throws XmlParserSystemException, BusinessSystemException {
        ArrayList<DirectionRequestType> directions = new ArrayList<DirectionRequestType>();
        DirectionRequestType directionForward = new DirectionRequestType();
        Time arvTime = new Time();
        Time depTime = new Time();

        arvTime.setFrom("12.12.2012 12:12:00");
        arvTime.setTo("12.12.2012 21:21:00");
        arvTime.setValue("code");
        depTime.setFrom("21.10.2012 12:12:00");
        depTime.setTo("21.10.2012 21:21:00");
        depTime.setValue("code");

        directionForward.setArvTime(arvTime);
        directionForward.setDepTime(depTime);
        directionForward.setType("Forward");

        directions.add(directionForward);

        return scheduleRouteDao.sendRequest(new ScheduleRouteG11Request("from","to",directions));
    }
}
