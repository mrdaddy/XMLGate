package by.iba.railway.eticket.xml.services.impl;

import by.iba.railway.eticket.xml.dao.eticket.*;
import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.PassengersType;
import by.iba.railway.eticket.xml.objs.request.type.buyticket.RequirementsType;
import by.iba.railway.eticket.xml.objs.request.type.common.CarType;
import by.iba.railway.eticket.xml.objs.request.type.common.TrainType;
import by.iba.railway.eticket.xml.objs.response.eticket.*;
import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.OperationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.RegistrationType;
import by.iba.railway.eticket.xml.objs.response.type.common.paymentregistration.TicketSign2DType;
import by.iba.railway.eticket.xml.objs.response.type.expressstatus.TicketType;
import by.iba.railway.eticket.xml.services.CallbackStatistic;
import by.iba.railway.eticket.xml.services.EticketService;

import java.util.List;

public class EticketServiceImpl extends TrainServiceBase implements EticketService {
	protected ExpressStatusDao expressStatusDao = null;
    protected PaymentDao paymentDao = null;
    protected RegistrationDao registrationDao = null;
    protected RejectDao rejectDao = null;
    protected SetAutoRejectDao setAutoRejectDao = null;
    protected ReturnTicketDao returnTicketDao = null;
    protected BuyTicketDao buyTicketDao = null;

    public EticketServiceImpl(String siteUrl, String login, String password, boolean debug, int timeout, CallbackStatistic statistic) {
		super(siteUrl,login,password);
        expressStatusDao = new ExpressStatusDao(siteUrl,login,password, debug, timeout, statistic);
        paymentDao = new PaymentDao(siteUrl,login,password, debug, timeout, statistic);
        registrationDao = new RegistrationDao(siteUrl,login,password, debug, timeout, statistic);
        rejectDao = new RejectDao(siteUrl,login,password, debug, timeout, statistic);
        setAutoRejectDao = new SetAutoRejectDao(siteUrl,login,password, debug, timeout, statistic);
        returnTicketDao = new ReturnTicketDao(siteUrl,login,password, debug, timeout, statistic);
        buyTicketDao = new BuyTicketDao(siteUrl,login,password, debug, timeout, statistic);
	}

    
    public BaseOrderType getExpressStatusOrder(String orderId) throws XmlParserSystemException, BusinessSystemException {
        return expressStatusDao.getExpressStatusOrder(orderId);
    }

    
    public List<TicketType> getExpressStatusTickets(String orderId) throws XmlParserSystemException, BusinessSystemException {
        return expressStatusDao.getExpressStatusTickets(orderId);
    }

    
    public List<TicketSign2DType> getPaymentTickets(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        return paymentDao.getPaymentTickets(orderId, isElectronicReg, payAgent);
    }

    
    public RegistrationType getPaymentRegistration(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        return paymentDao.getPaymentRegistration(orderId, isElectronicReg, payAgent);
    }

    
    public BaseOrderType getPaymentOrder(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        return paymentDao.getPaymentOrder(orderId, isElectronicReg, payAgent);
    }

    public OperationType getPaymentOperation(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        return paymentDao.getPaymentInfo(orderId, isElectronicReg, payAgent).getOperation();
    }
    
    public BaseOrderType getRejectOrder(String orderId) throws XmlParserSystemException, BusinessSystemException {
        return rejectDao.getRejectOrder(orderId);
    }

    public ReturnTicketResponse getReturnTicketInfo(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException {
        return returnTicketDao.getReturnTicketInfo(orderId, ticketId);
    }

    public ReturnTicketResponse getReturnTicketReturn(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException {
        return returnTicketDao.getReturnTicketReturn(orderId,ticketId);
    }

    public BaseOrderType getSetAutoRejectOrder(String orderId, String autoRejectPeriodInMinutes) throws XmlParserSystemException, BusinessSystemException {
        return setAutoRejectDao.getSetAutoRejectOrder(orderId,autoRejectPeriodInMinutes);
    }

    
    public BuyTicketResponse getBuyTicketInfo(String stationFrom, String stationTo, String depDate, String depTime, TrainType train, CarType car, RequirementsType requirements, String creditCard, PassengersType passengers) throws XmlParserSystemException, BusinessSystemException {
        return buyTicketDao.getBuyTicketInfo(stationFrom, stationTo, depDate, depTime, train, car, requirements, creditCard, passengers);
    }

    public ExpressStatusResponse getExpressStatusInfo(String orderId) throws XmlParserSystemException, BusinessSystemException {
        return expressStatusDao.getExpressStatusInfo(orderId);
    }

    public PaymentResponse getPaymentInfo(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException {
        return paymentDao.getPaymentInfo(orderId, isElectronicReg, payAgent);
    }

    public RegistrationResponse getChangeRegistration(String orderId, String ticketId, boolean isElectronicReg) throws XmlParserSystemException, BusinessSystemException {
        return registrationDao.getChangeRegistration(orderId, ticketId, isElectronicReg);
    }

    public RejectResponse getRejectInfo(String orderId) throws XmlParserSystemException, BusinessSystemException {
        return rejectDao.getRejectInfo(orderId);
    }
}
