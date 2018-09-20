package by.iba.railway.eticket.xml.objs.response.type.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(name = "ErrorType", propOrder = {
 "value"
})
@XmlRootElement(name="Error")
public class ErrorType {
 
 protected String value; 
 protected String code;

 public String getValue() {
     return value;
 }
 @XmlValue
 public void setValue(String value) {
     this.value = value;
 }
 @XmlAttribute(name = "Code")
 public String getCode() {
     return code;
 }

 public void setCode(String value) {
     this.code = value;
 }

}

