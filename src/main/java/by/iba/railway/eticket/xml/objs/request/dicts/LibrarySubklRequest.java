package by.iba.railway.eticket.xml.objs.request.dicts;

import by.iba.railway.eticket.xml.objs.request.BaseRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GtLocal_Request")
@XmlType(name = "GtLocal_RequestType")
public class LibrarySubklRequest extends BaseRequest {

	public LibrarySubklRequest() { this.type = "SUBKL"; }

}