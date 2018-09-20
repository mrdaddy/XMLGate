package by.iba.railway.eticket.xml.services;

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

import java.util.List;

public interface EticketService {

    public ReturnTicketResponse getReturnTicketInfo(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException;
    public ReturnTicketResponse getReturnTicketReturn(String orderId, String ticketId) throws XmlParserSystemException, BusinessSystemException;

    public BaseOrderType getSetAutoRejectOrder(String orderId, String autoRejectPeriodInMinutes) throws XmlParserSystemException, BusinessSystemException;

    public BuyTicketResponse getBuyTicketInfo(String stationFrom, String stationTo, String depDate, String depTime, TrainType train, CarType car, RequirementsType requirements, String creditCard, PassengersType passengers) throws XmlParserSystemException, BusinessSystemException;

    public ExpressStatusResponse getExpressStatusInfo(String orderId) throws XmlParserSystemException, BusinessSystemException;
    public PaymentResponse getPaymentInfo(String orderId, boolean isElectronicReg, String payAgent) throws XmlParserSystemException, BusinessSystemException;
    public RegistrationResponse getChangeRegistration(String orderId, String ticketId, boolean isElectronicReg) throws XmlParserSystemException, BusinessSystemException;
    public RejectResponse getRejectInfo(String orderId) throws XmlParserSystemException, BusinessSystemException;
}
