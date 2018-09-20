package by.iba.railway.eticket.xml.objs.response.type.G60;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffsType", propOrder = {
    "tariff"
})
public class TariffsType {

    @XmlElement(name = "Tariff")
    protected List<TariffType> tariff;

    public List<TariffType> getTariff() {
        if (tariff == null) {
            tariff = new ArrayList<TariffType>();
        }
        return this.tariff;
    }

    public void setTariff(List<TariffType> tariff) {
        this.tariff = tariff;
    }
}
