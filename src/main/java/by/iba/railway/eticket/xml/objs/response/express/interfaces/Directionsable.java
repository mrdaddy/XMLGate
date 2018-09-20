package by.iba.railway.eticket.xml.objs.response.express.interfaces;

import java.util.List;

public interface Directionsable {
    //todo: before List<DirectionG11Type | DirectionG61Type> getDirection();
    List<? extends Direction> getDirection();
}
