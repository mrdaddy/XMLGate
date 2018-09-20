package by.iba.railway.eticket.xml.objs.response.type.dicts.subkl;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LGType", propOrder = {
    "lgi",
    "prs"
})
public class LGType {

    @XmlElement(name = "LGI", required = true)
    protected LGIType lgi;
    @XmlElement(name = "PRS", required = true)
    protected PRSType prs;
    @XmlAttribute(name = "L")
    protected Integer l;
    @XmlAttribute(name = "KS")
    protected String ks;
    @XmlAttribute(name = "SB")
    protected String sb;
    @XmlAttribute(name = "D1")
    protected Integer d1;
    @XmlAttribute(name = "D2")
    protected Integer d2;
    @XmlAttribute(name = "OWN")
    protected Integer own;
    @XmlAttribute(name = "DE")
    protected String de;
    @XmlAttribute(name = "PE")
    protected String pe;
    @XmlAttribute(name = "RK")
    protected Integer rk;
    @XmlAttribute(name = "VS")
    protected Integer vs;

    public LGIType getLgi() {
        return lgi;
    }

    public void setLgi(LGIType lgi) {
        this.lgi = lgi;
    }

    public PRSType getPrs() {
        return prs;
    }

    public void setPrs(PRSType prs) {
        this.prs = prs;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public String getKs() {
        return ks;
    }

    public void setKs(String ks) {
        this.ks = ks;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public Integer getD1() {
        return d1;
    }

    public void setD1(Integer d1) {
        this.d1 = d1;
    }

    public Integer getD2() {
        return d2;
    }

    public void setD2(Integer d2) {
        this.d2 = d2;
    }

    public Integer getOwn() {
        return own;
    }

    public void setOwn(Integer own) {
        this.own = own;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public Integer getRk() {
        return rk;
    }

    public void setRk(Integer rk) {
        this.rk = rk;
    }

    public Integer getVs() {
        return vs;
    }

    public void setVs(Integer vs) {
        this.vs = vs;
    }
}
