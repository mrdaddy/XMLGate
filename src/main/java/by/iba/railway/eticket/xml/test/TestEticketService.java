package by.iba.railway.eticket.xml.test;

import by.iba.railway.eticket.xml.dao.LocalLogger;
import by.iba.railway.eticket.xml.dao.eticket.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.eticket.*;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.BlankType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengerType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengersType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.RequirementsType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.OrderType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.eticket.*;
import org.junit.Test;

import java.util.ArrayList;

public class TestEticketService extends TestUtils{

    @Test
    public void testBuyTicket() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testBuyTicket()");
        BuyTicketDao buyTicketDao = new BuyTicketDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/buy-ticket.xml");
            }
        };
        try {

            BuyTicketRequest ticketRequest = new BuyTicketRequest();
            ticketRequest.setStationFrom("станция отправления");
            ticketRequest.setStationTo("станция назначения");
            ticketRequest.setDepDate("Дата отправления");
            ticketRequest.setDepTime("Время отправления");
            ticketRequest.setTrain(new TrainType("номер поезда"));
            ticketRequest.setCar(new CarType("тип вагона","номер вагона","класс обслуживания",null));

            RequirementsType requirements = new RequirementsType();
            requirements.setSeatsTop("число верхних мест");
            requirements.setSeatsBottom("число нижних мест");
            requirements.setSeatsRange("граница мест");
            requirements.setSeatsComp("К или О");
            requirements.setWoBedding("");
            requirements.setCompType("тип купе (М/Ж/С)");

            ticketRequest.setRequirements(requirements);
            ticketRequest.setCreditCard("");

            ArrayList<BlankType> blankList = new ArrayList<BlankType>();
            ArrayList<PassengerType> passengerList = new ArrayList<PassengerType>();
            passengerList.add(new PassengerType(1234567890123l,"тип документа","номер документа","Фамилия=Имя=Отчество","день рождения","RUS","М",null,null));
            passengerList.add(new PassengerType(1234567890124l,"тип документа","номер документа","Фамилия=Имя=Отчество","день рождения","RUS","М",null,null));
            BlankType blank = new BlankType(passengerList);
            blank.setReturnDate("дата обратно");
            blank.setSeatsCount("число мест");
            blank.setTariff("тип тарифа");
            blankList.add(blank);

            PassengersType passengers = new PassengersType(blankList);
            ticketRequest.setPassengers(passengers);

            BuyTicketResponse buyTicketResponse = buyTicketDao.sendRequest(ticketRequest);

            logger.debug("Order Id:" + buyTicketResponse.getOrder().getId());
            logger.debug("Order CreateTime:" + buyTicketResponse.getOrder().getCreateTime());
            logger.debug("Departure TrainType:" + buyTicketResponse.getDeparture().getTrainType());
            logger.debug("Departure Date:" + buyTicketResponse.getDeparture().getDate());
            logger.debug("Departure StationCode:" + buyTicketResponse.getDeparture().getStationCode());
            logger.debug("Arrival Train:" + buyTicketResponse.getArrival().getTrain());
            logger.debug("Arrival Time:" + buyTicketResponse.getArrival().getTime());
            logger.debug("Carrier INN:" + buyTicketResponse.getCarrier().getInn());
            logger.debug("Car number:" + buyTicketResponse.getCar().getNumber());
            logger.debug("Car type:" + buyTicketResponse.getCar().getType());
            logger.debug("Car class service:" + buyTicketResponse.getCar().getClassService().getType());
            logger.debug("Car carrier:" + buyTicketResponse.getCar().getCarrier().getName());
            logger.debug("Subagent:" + buyTicketResponse.getSubagent());
            logger.debug("Seats count:" + buyTicketResponse.getSeats().getCount());
            logger.debug("Seats all count:" + buyTicketResponse.getSeats().getValue());
            logger.debug("number 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getNumber());
            logger.debug("express id 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getExpressID());
            logger.debug("NumberReservation 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getNumberReservation());
            logger.debug("TariffInsurance 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getTariffInsurance());
            logger.debug("Passenger Doc 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getPassenger().get(1).getDoc());
            logger.debug("Passenger Name 2 ticket:" + buyTicketResponse.getTickets().getTicket().get(1).getPassenger().get(1).getName());
            logger.debug("II DB:" + buyTicketResponse.getIi().getDb());
            logger.debug("II HP:" + buyTicketResponse.getIi().getHp());
            logger.debug("II HT:" + buyTicketResponse.getIi().getHt());
            logger.debug("II WB:" + buyTicketResponse.getIi().getWb());
            logger.debug("II WM:" + buyTicketResponse.getIi().getWm());

            logger.debug("getTariffB:" + buyTicketResponse.getTickets().getTicket().get(0).getTariffB());
            logger.debug("getTariffP:" + buyTicketResponse.getTickets().getTicket().get(0).getTariffP());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSetAutoReject() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testSetAutoReject()");
        SetAutoRejectDao setAutoRejectDao = new SetAutoRejectDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/set-auto-reject.xml");
            }
        };
        try {
            SetAutoRejectResponse setAutoRejectResponse = setAutoRejectDao.sendRequest(new SetAutoRejectRequest(new OrderType("12345679","время в минутах")));

            logger.debug("Order Id:" + setAutoRejectResponse.getOrder().getId());
            logger.debug("Order Status:" + setAutoRejectResponse.getOrder().getStatus());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testReject() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testReject()");
        RejectDao rejectDao = new RejectDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/reject.xml");
            }
        };
        try {
            RejectResponse rejectResponse = rejectDao.sendRequest(new RejectRequest(new OrderType("1231434213")));

            logger.debug("Order Id:" + rejectResponse.getOrder().getId());
            logger.debug("Order Status:" + rejectResponse.getOrder().getStatus());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testPayment() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testPayment()");
        PaymentDao paymentDao = new PaymentDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/payment.xml");
            }
        };
        try {
            PaymentResponse paymentResponse = paymentDao.sendRequest(new PaymentRequest(new OrderType("1231434213",null,null,"1234")));

            logger.debug("Order Id:" + paymentResponse.getOrder().getId());
            logger.debug("Order Status:" + paymentResponse.getOrder().getStatus());
            logger.debug("Registration StopDate:" + paymentResponse.getRegistration().getStopDate());
            logger.debug("Ticket Sign2D:" + paymentResponse.getTickets().getTicket().get(1).getSign2D());
            logger.debug("Ticket Number:" + paymentResponse.getTickets().getTicket().get(1).getNumber());
            logger.debug("Ticket ID:" + paymentResponse.getTickets().getTicket().get(1).getId());

            logger.debug("Operation date:" + paymentResponse.getOperation().getDate());
            logger.debug("Operation time:" + paymentResponse.getOperation().getTime());
            logger.debug("Operation db:" + paymentResponse.getOperation().getDB());
            logger.debug("Operation hp:" + paymentResponse.getOperation().getHP());
            logger.debug("Operation ht:" + paymentResponse.getOperation().getHT());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testExpressStatus() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testExpressStatus()");
        ExpressStatusDao expressStatusDao = new ExpressStatusDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/express-status.xml");
            }
        };
        try {
            ExpressStatusResponse expressStatusResponse = expressStatusDao.sendRequest(new ExpressStatusRequest(new OrderType("5555553131")));

            logger.debug("Order ExpressId:" + expressStatusResponse.getOrder().getExpressID());
            logger.debug("Order Status:" + expressStatusResponse.getOrder().getStatus());

            logger.debug("Ticket2 Number:" + expressStatusResponse.getTickets().getTicket().get(1).getNumber());
            logger.debug("Ticket2 State:" + expressStatusResponse.getTickets().getTicket().get(1).getState());
            logger.debug("Ticket2 RetTariff:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getRetTariff());
            logger.debug("Ticket2 RetTypeInfo:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getRetTypeInfo());
            logger.debug("Ticket2 Operation Time:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getOperation().getTime());

            logger.debug("Ticket2 getTimeBeforeDep:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getTimeBeforeDep());
            logger.debug("Ticket2 getAgent:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getAgent());
            logger.debug("Ticket2 getSubagent:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getSubagent());
            logger.debug("Ticket2 getII db:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getII().getDb());
            logger.debug("Ticket2 getPayment:" + expressStatusResponse.getTickets().getTicket().get(1).get_return().getPayment());


        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testRegistration() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testRegistration()");
        RegistrationDao registrationDao = new RegistrationDao("http://10.202.1.65:198/test","test","test", true, timeout,null) {
           /* protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/registraion.xml");
            }*/
        };
        try {
            RegistrationResponse registrationResponse = registrationDao.sendRequest(new RegistrationRequest(new OrderType("227",null,"1",null,"73405844777875")));

            logger.debug("Order ExpressId:" + registrationResponse.getOrder().getExpressID());
            logger.debug("Order Status:" + registrationResponse.getOrder().getStatus());

            logger.debug("Ticket2 Number:" + registrationResponse.getTickets().getTicket().get(1).getNumber());
            logger.debug("Ticket2 Sign2D:" + registrationResponse.getTickets().getTicket().get(1).getSign2D());

            logger.debug("Operation date:" + registrationResponse.getOperation().getDate());
            logger.debug("Operation time:" + registrationResponse.getOperation().getTime());
            logger.debug("Operation db:" + registrationResponse.getOperation().getDB());
            logger.debug("Operation hp:" + registrationResponse.getOperation().getHP());
            logger.debug("Operation ht:" + registrationResponse.getOperation().getHT());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testReturnTicket() {
        LocalLogger logger = new LocalLogger(getClass().getName()+".testReturnTicket()");
        ReturnTicketDao returnTicketDao = new ReturnTicketDao("","","", true, timeout,null) {
            protected String getDataString(String data) throws Exception {
                logger.info("data: " + data);
                return getFileToString("/response/xml/eticket/return-ticket.xml");
            }
        };
        try {
            ReturnTicketResponse returnTicketResponse = returnTicketDao.sendRequest(new ReturnTicketRequest(new OrderType("239","260",null),"Info"));

            logger.debug("Order ExpressId:" + returnTicketResponse.getOrder().getExpressID());
            logger.debug("Order Status:" + returnTicketResponse.getOrder().getStatus());

            logger.debug("Ticket2 Number:" + returnTicketResponse.getTickets().getTicket().get(0).getNumber());
            logger.debug("Ticket2 TariffInsurance:" + returnTicketResponse.getTickets().getTicket().get(0).getTariffInsurance());
            logger.debug("Agent:" + returnTicketResponse.getAgent());
            logger.debug("Action:" + returnTicketResponse.getAction());

            logger.debug("Operation Time:" + returnTicketResponse.getOperation().getTime());

        } catch (XmlParserSystemException e) {
            e.printStackTrace();
        } catch (BusinessSystemException e) {
            e.printStackTrace();
        }
    }
}
