package by.iba.railway.eticket.xml.exception;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class ExpressSystemException extends BusinessSystemException {
	private static Map<String, String> map = new HashMap<String, String>();
	
	public ExpressSystemException(String code, String value,
			String xmlFailRequest) {
		super(code, value, xmlFailRequest);
	}
	
	@Override
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		if(message == null)
			message = map.get(code);
        sb.append("Code:"+code+":");
		sb.append(message);
		sb.append("("+value+")");
		if(xmlFailRequest!=null)
			sb.append("\r\n fail request: " + xmlFailRequest);
		
		return sb.toString();
	}

	static{
		map.put("2001", "Сбой при обработке заказа");
		map.put("2002", "Станций начинающихся на … нет");
		map.put("2010", "Неверная дата отправления");
		map.put("2011", "Нет информации о маршруте");
		map.put("2012", "Нет прямого сообщения между станциями");
		map.put("2013", "Нет информации о поездах");
		map.put("2014", "В указанную дату поезд не ходит");
		map.put("2015", "Поезд не ходит");
		map.put("2016", "Неверный номер поезда");
		map.put("2020", "В указанный период времени нет поездов");
		map.put("2021", "Мест нет");
		map.put("2040", "Неверные параметры запроса");

	}
	
}
