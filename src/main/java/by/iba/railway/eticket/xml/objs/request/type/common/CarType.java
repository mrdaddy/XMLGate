package by.iba.railway.eticket.xml.objs.request.type.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {
    "value"
})
public class CarType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ClassService")
    protected String classService;
    @XmlAttribute(name = "ClassServiceInt")
    private String classServiceInt;

    public CarType() {
    }

    public CarType(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public CarType(String type, String number, String classService, String classServiceInt) {
        this.type = type;
        this.number = number;
        this.classService = classService;
        this.classServiceInt = classServiceInt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClassService() {
        return classService;
    }

    public void setClassService(String classService) {
        this.classService = classService;
    }

    public String getClassServiceInt() {
        return classServiceInt;
    }

    public void setClassServiceInt(String classServiceInt) {
        this.classServiceInt = classServiceInt;
    }
}
