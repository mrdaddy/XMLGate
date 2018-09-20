package by.iba.railway.eticket.xml.objs.response;

import by.iba.railway.eticket.xml.objs.response.type.common.ErrorType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class BaseResponse {

 protected ErrorType error;
 protected String type;
 protected String xmlRequest;
 protected String xmlResponse;

	@XmlElement(name = "Error", required = false)
 public ErrorType getError() {
     return error;
 }

 public void setError(ErrorType value) {
     this.error = value;
 }
 
 @XmlAttribute(name = "Type", required = true)
 public String getType() {
     return type;
 }

 public void setType(String value) {
     this.type = value;
 }

    public String getXmlRequest() {
        return xmlRequest;
    }

    public String getXmlResponse() {
        return xmlResponse;
    }

    public void setXmlRequest(String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    public void setXmlResponse(String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }
}

