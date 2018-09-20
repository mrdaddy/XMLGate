package by.iba.railway.eticket.xml.exception;

import java.util.HashMap;
import java.util.Map;

public class EticketSystemException extends BusinessSystemException {
	private static Map<String, String> map = new HashMap<String, String>();
	
	public EticketSystemException(String code, String value,
			String xmlFailRequest) {
		super(code, value, xmlFailRequest);
	}
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
        map.put("0300", "Ошибка обмена между модулями Системы");
        map.put("0301", "Таймаут обмена между модулями системы");
        map.put("0310", "Invalid input XML document");
        map.put("0311", "Invalid parameters in input XML document");
        map.put("0312", "Invalid structure of input XML document");
        map.put("0320", "Invalid XML document from low level module");
        map.put("0321", "Invalid parameters in XML document from low level module");
        map.put("0322", "Invalid structure of XML document from low level module");
        map.put("0330", "Access denied");
        map.put("0340", "Очередь внешних запросов переполнена");
        map.put("0400", "Система занята. Превышен таймаут в очереди на передачу запроса в Хост-ЭВМ АСУ «Экспресс-3». Причины: остановка каналов связи, либо большое число запросов и выделенный канал связи не справляется с нагрузкой.");
        map.put("0401", "Система занята. Превышен таймаут ожидания ответа от АСУ «Экспресс-3».");
        map.put("0402", "Ошибка обмена с системой Экспресс. Невозможно установить соединение, разрыв связи, ошибка передачи, ошибка приема...");
        map.put("0410", "Сбой при обработке ответа от АСУ Экспресс.");
        map.put("0440", "Ошибка при формировании 2D-кода");
        map.put("0500", "Open database");
        map.put("0501", "Database query");
        map.put("0502", "Query error: неверный состав полей");
        map.put("0503", "Query error: неверный формат полей");
        map.put("0510", "Запись не найдена");
        map.put("0511", "Запись не найдена");
        map.put("0900", "Системная ошибка (ошибка выделения памяти, сбой файловой системы...)");
        map.put("0901", "Система занята. Система находится в стадии перезапуска (или выключения). Ожидается завершение обработки переданных запросов в АСУ «Экспресс». Новые запросы не принимаются. Запросы, еще не переданные на обработку в АСУ «Экспресс», завершаются с этой ошибкой.");
	}	

}
