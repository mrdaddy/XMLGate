package by.iba.railway.eticket.xml.objs.request.type.buyticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengersType", propOrder = {
    "blank"
})
public class PassengersType {

    @XmlElement(name = "Blank")
    protected List<BlankType> blank;

    public PassengersType() {
    }

    public PassengersType(List<BlankType> blank) {
        this.blank = blank;
    }

    public List<BlankType> getBlank() {
        if (blank == null) {
            blank = new ArrayList<BlankType>();
        }
        return this.blank;
    }

    public void setBlank(List<BlankType> blank) {
        this.blank = blank;
    }
}
