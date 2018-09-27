package by.iba.railway.eticket.xml.objs.response.eticket;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.buyticket.*;
import by.iba.railway.eticket.xml.objs.response.type.common.buyreturnticket.IIType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GtETicket_Response")
@XmlType(name = "GtETicket_ResponseType", propOrder = {
    "order",
    "departure",
    "departureTrain",
    "arrival",
    "carrier",
    "car",
    "tariff",
    "tariffEuro",
    "paymentType",
    "agent",
    "subagent",
    "seats",
    "signGA",
    "signGB",
    "signR",
    "tickets",
    "ii"
})
public class BuyTicketResponse extends BaseResponse {

    @XmlElement(name = "Order", required = true)
    protected OrderType order;
    @XmlElement(name = "Departure", required = true)
    protected DepartureType departure;
    @XmlElement(name = "DepartureTrain", required = true)
    protected DepartureTrainType departureTrain;
    @XmlElement(name = "Arrival", required = true)
    protected ArrivalType arrival;
    @XmlElement(name = "Carrier", required = true)
    protected CarrierType carrier;
    @XmlElement(name = "Car", required = true)
    protected CarType car;
    @XmlElement(name = "Tariff")
    protected Float tariff;
    @XmlElement(name = "TariffEuro")
    protected Float tariffEuro;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "Agent", required = true)
    protected String agent;
    @XmlElement(name = "Subagent")
    protected Integer subagent;
    @XmlElement(name = "Seats", required = true)
    protected SeatsType seats;
    @XmlElement(name = "SignGA", required = true)
    protected String signGA;
    @XmlElement(name = "SignGB", required = true)
    protected String signGB;
    @XmlElement(name = "SignR", required = true)
    protected String signR;
    @XmlElement(name = "Tickets", required = true)
    protected TicketsType tickets;
    @XmlElement(name = "II", required = true)
    protected IIType ii;

    public OrderType getOrder() {
        return order;
    }

    public void setOrder(OrderType order) {
        this.order = order;
    }

    public DepartureType getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureType departure) {
        this.departure = departure;
    }

    public ArrivalType getArrival() {
        return arrival;
    }

    public void setArrival(ArrivalType arrival) {
        this.arrival = arrival;
    }

    public CarrierType getCarrier() {
        return carrier;
    }

    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public Float getTariff() {
        return tariff;
    }

    public void setTariff(Float tariff) {
        this.tariff = tariff;
    }

    public Float getTariffEuro() {
        return tariffEuro;
    }

    public void setTariffEuro(Float tariffEuro) {
        this.tariffEuro = tariffEuro;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getSubagent() {
        return subagent;
    }

    public void setSubagent(Integer subagent) {
        this.subagent = subagent;
    }

    public SeatsType getSeats() {
        return seats;
    }

    public void setSeats(SeatsType seats) {
        this.seats = seats;
    }

    public String getSignGA() {
        return signGA;
    }

    public void setSignGA(String signGA) {
        this.signGA = signGA;
    }

    public String getSignGB() {
        return signGB;
    }

    public void setSignGB(String signGB) {
        this.signGB = signGB;
    }

    public String getSignR() {
        return signR;
    }

    public void setSignR(String signR) {
        this.signR = signR;
    }

    public TicketsType getTickets() {
        return tickets;
    }

    public void setTickets(TicketsType tickets) {
        this.tickets = tickets;
    }

    public IIType getIi() {
        return ii;
    }

    public void setIi(IIType ii) {
        this.ii = ii;
    }
    public DepartureTrainType getDepartureTrain() {
        return departureTrain;
    }

    public void setDepartureTrain(DepartureTrainType departureTrain) {
        this.departureTrain = departureTrain;
    }
}
