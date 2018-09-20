package by.iba.railway.eticket.xml.objs.response.dicts;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.dicts.subkl.SUBKLListType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GtLocal_ResponseType", propOrder = {
    "subkl"
})
public class LibrarySubklResponse extends BaseResponse{

    @XmlElement(name = "SUBKL", required = true)
    protected SUBKLListType subkl;
    @XmlAttribute(name = "LastUpdate")
    protected String lastUpdate;

    public SUBKLListType getSubkl() {
        return subkl;
    }

    public void setSubkl(SUBKLListType subkl) {
        this.subkl = subkl;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
