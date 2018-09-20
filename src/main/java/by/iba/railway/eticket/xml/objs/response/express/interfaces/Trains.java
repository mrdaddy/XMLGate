package by.iba.railway.eticket.xml.objs.response.express.interfaces;

import java.util.List;

public interface Trains {
    List<? extends Train> getTrain();
    String getDate();
    void setDate(String date);
}
