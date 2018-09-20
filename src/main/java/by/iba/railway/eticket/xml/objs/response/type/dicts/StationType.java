package by.iba.railway.eticket.xml.objs.response.type.dicts;

import by.iba.railway.eticket.xml.objs.response.type.common.CountryType;
import by.iba.railway.eticket.xml.objs.response.type.common.RailwayType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType")
public class StationType {

    @XmlElement(name="NameShort")
    protected String nameShort;
    @XmlElement(name="NameFull")
    protected String nameFull;
    @XmlElement(name="Railway")
    protected RailwayType railway;
    @XmlElement(name="Country")
    protected CountryType country;
    @XmlElement(name="BaseStation")
    protected String baseStation;
    @XmlElement(name="BaseCode")
    protected String baseCode;
    @XmlElement(name="SepNumber")
    protected String sepNumber;
    @XmlElement(name="SF")
    protected String sF;
    @XmlElement(name="Okato")
    protected String okato;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Multi")
    protected String multi;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getMulti() {
        return multi;
    }

    public void setMulti(String value) {
        this.multi = value;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public RailwayType getRailway() {
        return railway;
    }

    public void setRailway(RailwayType railway) {
        this.railway = railway;
    }

    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType country) {
        this.country = country;
    }

    public String getBaseStation() {
        return baseStation;
    }

    public void setBaseStation(String baseStation) {
        this.baseStation = baseStation;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getSepNumber() {
        return sepNumber;
    }

    public void setSepNumber(String sepNumber) {
        this.sepNumber = sepNumber;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }
}
