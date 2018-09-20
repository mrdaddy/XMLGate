package by.iba.railway.eticket.xml.exception;

public class SystemException extends Exception{
    protected String code;
    protected String value;
    protected String message;
    protected String xmlFailRequest;

    public SystemException(String code) {
        this.code = code;
        this.message = code;
    }
    public SystemException(String code, String value) {
        this(code);
        this.value = value;
    }
    public SystemException(String code, String value, String xmlFailRequest) {
        this(code, value);
        this.xmlFailRequest= xmlFailRequest;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public String getXmlFailRequest() {
        return xmlFailRequest;
    }
}
