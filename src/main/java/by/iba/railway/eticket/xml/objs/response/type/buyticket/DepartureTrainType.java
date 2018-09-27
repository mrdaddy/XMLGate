package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DepartureTrainType")
public class DepartureTrainType {
    @XmlAttribute(name = "Date")
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
