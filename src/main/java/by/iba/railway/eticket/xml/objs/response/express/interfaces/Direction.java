package by.iba.railway.eticket.xml.objs.response.express.interfaces;

import by.iba.railway.eticket.xml.objs.response.type.common.ErrorType;
import by.iba.railway.eticket.xml.objs.response.type.common.PassRouteType;

import java.util.List;

public interface Direction {

    List<? extends Trains> getTrains();
    String getNotAllTrains();
    void setNotAllTrains(String notAllTrains);
    PassRouteType getPassRoute();
    void setPassRoute(PassRouteType passRoute);
    ErrorType getError();

}
