package by.iba.railway.eticket.xml.objs.response.express.interfaces;

import by.iba.railway.eticket.xml.objs.response.type.common.ArrivalType;
import by.iba.railway.eticket.xml.objs.response.type.common.DepartureType;
import by.iba.railway.eticket.xml.objs.response.type.common.RouteType;

public interface Train {

    RouteType getRoute();

    void setRoute(RouteType value);

    DepartureType getDeparture();

    void setDeparture(DepartureType value);

    ArrivalType getArrival();

    void setArrival(ArrivalType value);

    String getTimeInWay();

    void setTimeInWay(String value);

    String getNumber();

    void setNumber(String number);

    String getNumber2();

    void setNumber2(String number2);

}
