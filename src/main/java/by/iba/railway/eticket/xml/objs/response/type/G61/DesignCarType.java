package by.iba.railway.eticket.xml.objs.response.type.G61;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignCarType", propOrder = {
    "info"
})
public class DesignCarType {

    @XmlElement(name = "Info")
    protected List<String> info;

    public List<String> getInfo() {
        if (info == null) {
            info = new ArrayList<String>();
        }
        return this.info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }
}
