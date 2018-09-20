package by.iba.railway.eticket.xml.exception;


public class BusinessSystemException extends SystemException{

    public BusinessSystemException(String code) {
        super(code);
    }
    public BusinessSystemException(String code, String value){
        super(code, value);
    }
    public BusinessSystemException(String code, String value, String xmlFailRequest) {
        super(code, value, xmlFailRequest);
    }
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        if(message == null)
            message = value;
        sb.append("Code:"+code+":");
        sb.append(message);
        sb.append("("+value+")");
        if(xmlFailRequest!=null)
            sb.append("\r\n fail request: " + xmlFailRequest);

        return sb.toString();
    }
}
