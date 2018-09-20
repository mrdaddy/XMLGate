package by.iba.railway.eticket.xml.objs.response.type.dicts.subkl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBKLListType", propOrder = {
    "lg"
})
public class SUBKLListType {

    @XmlElement(name = "LG")
    protected List<LGType> lg;

    public List<LGType> getLG() {
        if (lg == null) {
            lg = new ArrayList<LGType>();
        }
        return this.lg;
    }

    public void setLg(List<LGType> lg) {
        this.lg = lg;
    }
}
