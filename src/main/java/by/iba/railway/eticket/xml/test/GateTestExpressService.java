package by.iba.railway.eticket.xml.test;

import by.iba.railway.eticket.xml.RailWayServiceFactory;
import by.iba.railway.eticket.xml.dao.LocalLogger;
import by.iba.railway.eticket.xml.dao.express.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.express.*;
import by.iba.railway.eticket.xml.objs.request.type.G40.DateType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.BlankType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengerType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengersType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.RequirementsType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.DirectionRequestType;
import by.iba.railway.eticket.xml.objs.request.type.common.Time;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.express.*;
import by.iba.railway.eticket.xml.objs.response.type.G11.DirectionG11Type;
import by.iba.railway.eticket.xml.objs.response.type.G61.DirectionG61Type;
import by.iba.railway.eticket.xml.objs.response.type.G62.CarG62Type;
import by.iba.railway.eticket.xml.objs.response.type.G62.TrainG62Type;
import by.iba.railway.eticket.xml.services.EticketService;
import by.iba.railway.eticket.xml.services.ExpressService;
import by.iba.railway.eticket.xml.services.GatewayService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GateTestExpressService extends TestUtils {
    private String url = "http://10.202.1.65:1908/bzd";
    private String login = "bzd";
    private String pass = "Bzd1209";
    @Test
    public void test21(){
        RailWayServiceFactory rw = new RailWayServiceFactory();

        EticketService wsP = rw.getEticketService("http://10.202.1.65:1908/bzd",
                "bzd","Bzd1209");
        try {
            TrainType tr = new TrainType();
            tr.setNumber("612Б");
            CarType car = new CarType();
            car.setNumber("05");
            car.setType("Купе");
            car.setClassService("2К");

            RequirementsType requirements = new RequirementsType();
            PassengersType passType = new PassengersType();
            List<BlankType> blanks = new ArrayList<BlankType>();
            BlankType blank = new BlankType();
            blank.setSeatsCount("1");
            List<PassengerType> passes = new ArrayList<PassengerType>();
            PassengerType pass = new PassengerType();
            pass.setDoc("XXXXXXX");
            pass.setDocType("ЗЗ");
            pass.setName("SSSSS=DDDDD=FFFFF");
            passes.add(pass);
            blank.setPassenger(passes);
            blanks.add(blank);
            passType.setBlank(blanks);
            wsP.getBuyTicketInfo("2100000", "2100050", "21.12.2014", "00:00", tr, car, requirements, "", passType);
        } catch (XmlParserSystemException e1) {
            // TODO Автоматически созданный блок catch
            e1.printStackTrace();
        } catch (BusinessSystemException e1) {
            // TODO Автоматически созданный блок catch
            e1.printStackTrace();
        }
    }

    @Test
    public void test22(){
        RailWayServiceFactory factory = new RailWayServiceFactory();
        ExpressService service = factory.getExpressService(url, login, pass);
        List<DirectionRequestType> directions = new ArrayList<DirectionRequestType>();
        DirectionRequestType forwardType = new DirectionRequestType();
        forwardType.setDepDate(new Time("", "", "27.10.2014"));

        Time time = new Time();
        time.setFrom("00:00");
        time.setTo("23:59");

        forwardType.setDepTime(time);
        directions.add(forwardType);

        try {
            service.getPlacesBetweenStationsInfo("2100000",false,directions,null,null,"2100050");
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testScheduleRouteG11() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testScheduleRouteG11()");
        ScheduleRouteG11Dao scheduleRouteDao = new ScheduleRouteG11Dao(url, login, pass, true, timeout,null);

        try {
            DirectionG11Type direction = prepareScheduleRouteG11(scheduleRouteDao).getDirection().get(0);
            logger.debug("number:" + direction.getTrains().get(0).getTrain().get(0).getNumber());
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
    public void testScheduleStationG19() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testScheduleStationG19()");
        ScheduleStationG19Dao scheduleStationDao = new ScheduleStationG19Dao(url, login, pass, true, timeout,null);

        try {
            ScheduleStationG19Response response = scheduleStationDao.sendRequest(new ScheduleStationG19Request("МИНСК", "12.01.1999"));
            showDebugScheduleStationG19(logger, response);
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException ex) {

        }
    }

    @Test
    public void testMemory() {
  /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());

  /* Total amount of free memory available to the JVM */
        long free = Runtime.getRuntime().freeMemory();
        System.out.println("Free memory (bytes): " + free);

  /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
  /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

  /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());

        System.out.println("START");
        for(int i=0;i<10000;i++) {
            final int j = i;
            Thread thread = new Thread(){
                public void run(){
                   // System.out.println("PROCESS "+j);
                    testPlacesG60();
                }
            };
            thread.start();
        }
        System.out.println("END");


  /* Total amount of free memory available to the JVM */
        System.out.println("Free memory diff (MB): " + (Runtime.getRuntime().freeMemory()-free)/(1024*1024));
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Free memory diff (MB): " + (Runtime.getRuntime().freeMemory()-free)/(1024*1024));


  /* This will return Long.MAX_VALUE if there is no preset limit */
            maxMemory = Runtime.getRuntime().maxMemory();

  /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    @Test
    public void testPlacesG60() {
        //нужно выставлять в запросе текущую дату
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testPlacesG60()");
        PlacesG60Dao placesG60Dao = new PlacesG60Dao(url, login, pass, false, timeout,null);
        try {
            PlacesG60Response responseForPlaces = responseForPlaces = preparePlacesG60(placesG60Dao);
            /*logger.debug("type:" + responseForPlaces.getType());
            logger.debug("size:" + responseForPlaces.getDirection().size());
            logger.debug("showWithoutPlaces:" + responseForPlaces.getShowWithoutPlaces());
            logger.debug(responseForPlaces.getDirection().get(0).getType());

            logger.debug("saleOnFour:"+responseForPlaces.getDirection().get(0).getTrains().get(0).getTrain().get(0).getPlaces().getCars().get(0).getTariffs().getTariff().get(0).getSaleOnFour());
            logger.debug("number2:"+responseForPlaces.getDirection().get(0).getTrains().get(0).getTrain().get(0).getNumber2());
            */
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testActualArrivalG50() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testActualArrivalG50()");
        ActualArrivalG50Dao actualArrivalG50Dao = new ActualArrivalG50Dao(url, login, pass, true, timeout,null);

        try {
            by.iba.railway.eticket.xml.objs.response.type.G50.TrainType trains = actualArrivalG50Dao.sendRequest(new ActualArrivalG50Request(new TrainType("384Б"), "23.07.2014")).getTrain();
            logger.debug("number:" + trains.getNumber());
            logger.debug("ArvActual date:" + trains.getArvActual().getDate());
            logger.debug("ArvActual time:" + trains.getArvActual().getTime());
            logger.debug("ArvSchedule date:" + trains.getArvSchedule().getDate());
            logger.debug("ArvSchedule time:" + trains.getArvSchedule().getTime());
            logger.debug("DelayTime time:" + trains.getDelayTime());
            logger.debug("Station:" + trains.getStation());


        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAppointCancelTrainsG40() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testAppointCancelTrainsG40()");
        AppointCancelTrainsG40Dao appointCancelTrainsG40Dao = new AppointCancelTrainsG40Dao(url, login, pass, true, timeout,null);

        try {
            by.iba.railway.eticket.xml.objs.response.type.G40.TrainType train = appointCancelTrainsG40Dao.sendRequest(new AppointCancelTrainsG40Request("648Б", new DateType("13.05.2014", "16.05.2014"))).getTrain().get(0);
            logger.debug("number:" + train.getNumber());
            logger.debug("DateTimeInfo:" + train.getDateTimeInfo());
            logger.debug("getDaysOfGo:" + train.getDaysOfGo());
            logger.debug("first Station:" + train.getRoute().getStation().get(0));

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelayTrainsG51() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testDelayTrainsG51()");
        DelayTrainsG51Dao delayTrainsG51Dao = new DelayTrainsG51Dao(url, login, pass, true, timeout,null);
        try {
            DelayTrainsG51Response delayTrainsG51Response = delayTrainsG51Dao.sendRequest(new DelayTrainsG51Request("МОСКВА-КАЗ", "23.07.2014"));
//            by.iba.railway.eticket.xml.objs.response.type.G51.TrainType train = delayTrainsG51Response.getTrains().getTrain().get(0);
//            logger.debug("number:"+train.getNumber());
//            logger.debug("Arrival DelayTime:"+train.getArrival().getDelayTime());
//            logger.debug("Arrival ScheduleTime:"+train.getArrival().getScheduleTime());
//            logger.debug("first route Station:"+train.getRoute().getStation().get(0));
            logger.debug("Station:" + delayTrainsG51Response.getStation());
            logger.debug("Date:" + delayTrainsG51Response.getDate());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTrainCarPlacesG62() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testTrainCarPlacesG62()");
        TrainCarPlacesG62Dao trainCarPlacesG62Dao = new TrainCarPlacesG62Dao(url, login, pass, true, timeout,null);
        try {
//нужно выставлять время дату и номер поезда который отправляется в ближайшее время
            TrainCarPlacesG62Response trainCarPlacesG62Response = trainCarPlacesG62Dao.sendRequest(new TrainCarPlacesG62Request("2100000", "2100100", "23.12.2015", "11:09", new TrainType("094Б"), new CarType("КУПЕ", "07"), null));
            TrainG62Type train = trainCarPlacesG62Response.getTrains().getTrain().get(0);
            logger.debug("passRoute From:" + trainCarPlacesG62Response.getPassRoute().getFrom());
            logger.debug("passRoute To:" + trainCarPlacesG62Response.getPassRoute().getTo());
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
//            logger.debug("CommentInfo 2:"+train.getComments().getInfo().get(1));

            CarG62Type car = train.getCar().get(0);
            logger.debug("carNumber:"+car.getNumber());
            logger.debug("carType:"+car.getType());
            logger.debug("TrainLetter:"+car.getTrainLetter());
            logger.debug("AddSigns:"+car.getFare().get(0).getAddSigns());
            logger.debug("Seats Undef:"+car.getFare().get(0).getSeats().getSeatsUndef());
            logger.debug("Seats Dn:"+car.getFare().get(0).getSeats().getSeatsDn());
            logger.debug("Seats Up:"+car.getFare().get(0).getSeats().getSeatsUp());
            logger.debug("TariffBillet:"+car.getFare().get(0).getTariffBillet());
            logger.debug("Places:"+car.getFare().get(0).getPlaces());
//
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
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testTrainNumberG15()");
        TrainNumberG15Dao trainNumberG15Dao = new TrainNumberG15Dao(url, login, pass, true, timeout,null);
        try {
            by.iba.railway.eticket.xml.objs.response.type.G1x.TrainType train = trainNumberG15Dao.sendRequest(new TrainNumberG15Request("656")).getTrain().get(1);

            logger.debug("number:" + train.getNumber());
            logger.debug("first route station:" + train.getRoute().getStation().get(0));

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTrainRouteG18() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testTrainRouteG18()");
        TrainRouteG18Dao trainRouteG18Dao = new TrainRouteG18Dao(url, login, pass, true, timeout,null);
        try {
            TrainRouteG18Request trainRouteG18Request = new TrainRouteG18Request(new TrainType("648Б"), null, "21.11.2014", "", "Full");
            //trainRouteG18Request.setStandard("");
            TrainRouteG18Response trainRouteG18Response = trainRouteG18Dao.sendRequest(trainRouteG18Request);
            logger.debug("number:" + trainRouteG18Response.getTrain().getNumber());
            logger.debug("second route station:" + trainRouteG18Response.getTrain().getRoute().getStation().get(1));
            logger.debug("routes title:" + trainRouteG18Response.getRoutes().get(0).getTitle());
            logger.debug("routes second route second station:" + trainRouteG18Response.getRoutes().get(0).getRoute().get(0).getStation().get(0));
            logger.debug("routes 2stop code:" + trainRouteG18Response.getRoutes().get(0).getStop().get(0).getCode());
            logger.debug("routes 2stop station:" + trainRouteG18Response.getRoutes().get(0).getStop().get(0).getStation());
            logger.debug("routes 2stop days:" + trainRouteG18Response.getRoutes().get(0).getStop().get(0).getDays());
            logger.debug("routes 2stop distance:" + trainRouteG18Response.getRoutes().get(0).getStop().get(0).getDistance());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTrainSchemeG46() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testTrainSchemeG46()");
        TrainSchemeG46Dao trainSchemeG46Dao = new TrainSchemeG46Dao(url, login, pass, true, timeout,null);
        try {
            TrainSchemeG46Response trainSchemeG46Response = trainSchemeG46Dao.sendRequest(new TrainSchemeG46Request(new TrainType("648Б"), "23.07.2014"));

            logger.debug("SignsInfo:" + trainSchemeG46Response.getSignsInfo());
            logger.debug("number:" + trainSchemeG46Response.getTrain().getNumber());
            logger.debug("ClassService:" + trainSchemeG46Response.getTrain().getCar().get(1).getClassService().getType());
//            logger.debug("2 Sign:" + trainSchemeG46Response.getTrain().getCar().get(1).getSigns().getSign().get(1));
            logger.debug("Seats count:" + trainSchemeG46Response.getTrain().getCar().get(1).getSeats().getCount());
//            logger.debug("cliche station:" + trainSchemeG46Response.getTrain().getCar().get(1).getCliche().get(0).getStation());
//            logger.debug("cliche seats last:" + trainSchemeG46Response.getTrain().getCar().get(1).getCliche().get(0).getSeats().getLast());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTrainPlacesG61() {
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testTrainPlacesG61()");
        TrainPlacesG61Dao trainPlacesG61Dao = new TrainPlacesG61Dao(url, login, pass, true, timeout,null);
        try {
            TrainPlacesG61Request trainPlacesG61Request = new TrainPlacesG61Request("Минск", null, "Гомель");
            trainPlacesG61Request.setDetailNumPlaces("1");
            trainPlacesG61Request.setShowWithoutPlaces("1");
            trainPlacesG61Request.setDetailTypePlaces("0");
            by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType direction1 = new by.iba.railway.eticket.xml.objs.request.type.G61.DirectionType("23.11.2015", "11:09", "Forward", new TrainType("094Б"));
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


            logger.debug("DepartureTrainDate:" + directionForward.getTrains().get(0).getTrain().get(0).getDepartureTrain().getDate());
            logger.debug("DepartureTrainTime:" + directionForward.getTrains().get(0).getTrain().get(0).getDepartureTrain().getTime());
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
        LocalLogger logger = new LocalLogger(getClass().getName() + ".testError()");
        TrainSchemeG46Dao trainSchemeG46Dao = new TrainSchemeG46Dao(url, login, pass, true, timeout,null);
        try {
            TrainSchemeG46Response errorResponse = trainSchemeG46Dao.sendRequest(new TrainSchemeG46Request(new TrainType("648Б"), "23.07.2014"));
        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
            logger.debug(e.getClass() + " tested success");
        }
    }

    private PlacesG60Response preparePlacesG60(PlacesG60Dao placesG60Dao) throws XmlParserSystemException, BusinessSystemException {
        ArrayList<DirectionRequestType> listForPlaces = new ArrayList<DirectionRequestType>();
        DirectionRequestType directionForPlaces = new DirectionRequestType();
        directionForPlaces.setType("Forward");
        directionForPlaces.setCarrier("20/ГРАНД");
        directionForPlaces.setDepDate(new Time("", "", "23.12.2015"));
        directionForPlaces.setFullDay("");
        directionForPlaces.setDepTime(new Time("09:00", "21:00", ""));
        directionForPlaces.setArvTime(new Time("09:00", "21:00", ""));
        listForPlaces.add(directionForPlaces);

        return placesG60Dao.sendRequest(new PlacesG60Request("Минск", "1", listForPlaces, "20/ГРАНД", null, "Гомель"));
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
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getName());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getCode());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getTlf());
        logger.debug(response.getDepTrains().getTrain().get(0).getRailway().getValue());
        logger.debug(response.getDepTrains().getTrain().size());
        logger.debug("station:" + response.getStation());
        logger.debug(response.getTransitTrains());
        logger.debug(response.getType());
        logger.debug("error:" + response.getError());
    }

    private ScheduleRouteG11Response prepareScheduleRouteG11(ScheduleRouteG11Dao scheduleRouteDao) throws XmlParserSystemException, BusinessSystemException {
        ArrayList<DirectionRequestType> directions = new ArrayList<DirectionRequestType>();
        DirectionRequestType directionForward = new DirectionRequestType();
        Time arvTime = new Time();

        arvTime.setFrom("12:12");
        arvTime.setTo("21:21");
        arvTime.setValue("");

        directionForward.setArvTime(arvTime);
        directionForward.setType("Forward");

        directions.add(directionForward);

        return scheduleRouteDao.sendRequest(new ScheduleRouteG11Request("МИНСК", "ГОМЕЛЬ", directions));
    }
}
