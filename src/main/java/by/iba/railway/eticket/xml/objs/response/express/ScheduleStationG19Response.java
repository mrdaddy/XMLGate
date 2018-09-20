package by.iba.railway.eticket.xml.objs.response.express;

import by.iba.railway.eticket.xml.objs.response.BaseResponse;
import by.iba.railway.eticket.xml.objs.response.type.G19.ArvTrainsType;
import by.iba.railway.eticket.xml.objs.response.type.G19.DepTrainsType;
import by.iba.railway.eticket.xml.objs.response.type.G19.TransitTrainsType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GtExpress_Response")
@XmlType(name = "GtExpress_ResponseType", propOrder = {
        "station",
        "date",
		"depTrains",
        "transitTrains",
        "arvTrains",
        "addons"
})
public class ScheduleStationG19Response extends BaseResponse {

	protected String station;
	protected String date;
	protected DepTrainsType depTrains;
	protected TransitTrainsType transitTrains;
	protected ArvTrainsType arvTrains;
	protected String addons;

	@XmlElement(name = "Station")
	public String getStation() {
		return station;
	}

	public void setStation(String value) {
		this.station = value;
	}
	@XmlElement(name = "Date")
	public String getDate() {
		return date;
	}

	public void setDate(String value) {
		this.date = value;
	}
	@XmlElement(name = "DepTrains")
	public DepTrainsType getDepTrains() {
		return depTrains;
	}

	public void setDepTrains(DepTrainsType value) {
		this.depTrains = value;
	}
	@XmlElement(name = "TransitTrains")
	public TransitTrainsType getTransitTrains() {
		return transitTrains;
	}

	public void setTransitTrains(TransitTrainsType value) {
		this.transitTrains = value;
	}
	@XmlElement(name = "ArvTrains")
	public ArvTrainsType getArvTrains() {
		return arvTrains;
	}

	public void setArvTrains(ArvTrainsType value) {
		this.arvTrains = value;
	}
	@XmlElement(name = "Addons")
	public String getAddons() {
		return addons;
	}

	public void setAddons(String value) {
		this.addons = value;
	}

}
