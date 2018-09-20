package by.iba.railway.eticket.xml.dao;

import by.iba.railway.eticket.xml.exception.BusinessSystemException;
import by.iba.railway.eticket.xml.exception.XmlParserSystemException;
import by.iba.railway.eticket.xml.objs.request.BaseRequest;
import by.iba.railway.eticket.xml.objs.response.BaseResponse;

public interface SendRequest<T extends BaseResponse,K extends BaseRequest> {
	String GETAWAY_RESPONSE_TAG = "GtLocal_Response";
	String EXPRESS_RESPONSE_TAG = "GtExpress_Response";
	String ETICKET_RESPONSE_TAG = "GtETicket_Response";
	
	T sendRequest(K request) throws XmlParserSystemException, BusinessSystemException;
}
