package by.iba.railway.eticket.xml.objs.request.type.buyticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerType", propOrder = {
    "tCard",
    "childBirthday",
    "docType",
    "doc",
    "name",
    "birthday",
    "citizenship",
    "sex",
    "det5",
    "birthplace"
})
public class PassengerType {

    @XmlElement(name = "TCard")
    protected Long tCard;
    @XmlElement(name = "ChildBirthday")
    protected String childBirthday;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "Doc", required = true)
    protected String doc;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Birthday", required = true)
    protected String birthday;
    @XmlElement(name = "Citizenship", required = true)
    protected String citizenship;
    @XmlElement(name = "Sex", required = true)
    protected String sex;
    @XmlElement(name = "Det5", required = false)
    private String det5;
    @XmlElement(name = "Birthplace", required = false)
    private String birthplace;

    public PassengerType() {
    }

    public PassengerType(Long tCard, String docType, String doc, String name, String birthday, String citizenship, String sex, String det5, String birthplace) {
        this.tCard = tCard;
        this.docType = docType;
        this.doc = doc;
        this.name = name;
        this.birthday = birthday;
        this.citizenship = citizenship;
        this.sex = sex;
        this.det5 = det5;
        this.birthplace = birthplace;
    }

    public Long gettCard() {
        return tCard;
    }

    public void settCard(Long tCard) {
        this.tCard = tCard;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }

    public String getDet5() {
        return det5;
    }

    public void setDet5(String det5) {
        this.det5 = det5;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
