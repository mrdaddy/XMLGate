package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DepartureTrainType")
public class DepartureTrainType {
    @XmlAttribute(name = "Date")
    protected String date;
}
