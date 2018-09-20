package by.iba.railway.eticket.xml.objs.request.dicts;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GtLocal_Request")
@XmlType(name = "GtLocal_RequestType")
public class CheckUpdatesRequest extends BaseRequest {

	public CheckUpdatesRequest() { this.type = "CheckUpdates"; }

}