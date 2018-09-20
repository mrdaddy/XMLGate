package by.iba.railway.eticket.xml.exception;

import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("serial")
public class GatewaySystemException extends BusinessSystemException {
	private static Map<String,String> map = new HashMap<String,String>();
	
	public GatewaySystemException(String code, String value,
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
	static
	{
		map.put("0000", "Ошибка соединения");
		map.put("000001", "Невозможно соединиться со шлюзом");
		
		map.put("0001", "Неверные параметры");
		map.put("000010", "Введите хотя бы одну букву в названии");
		map.put("000011", "Невозможно однозначно определить станцию");

		map.put("0103", "Ошибки взаимодействия между модулями Системы");
		map.put("010300", "Ошибка обмена между модулями Системы");
		map.put("010301", "Таймаут обмена между модулями Системы");
		map.put("010310", "Invalid input XML document");
		map.put("010311", "Invalid parameters in input XML document");
		map.put("010312", "Invalid structure of input XML document");
		map.put("010320", "Invalid XML document from low level module");
		map.put("010321", "Invalid parameters in XML document from low level module");
		map.put("010322", "Invalid structure of XML document from low level module");
		map.put("010330", "Access denied");
		
		map.put("0104", "Ошибки обмена с АСУ «Экспресс-3»");
		map.put("010400", "Система занята. Превышен таймаут (3 минуты) в очереди на передачу запроса в Хост-ЭВМ АСУ «Экспресс-3». Причины:остановка каналов связи, либо большое число запросов ивыделенный канал связи не справляется с нагрузкой");
		map.put("010401", "Система занята. Превышен таймаут (2 минуты) ожидания ответа от АСУ «Экспресс-3»");
		map.put("010402", "Ошибка обмена с системой Экспресс. Невозможно установить соединение, разрыв связи, ошибка передачи, ошибка приёма...");
		map.put("010410", "Сбой при обработке ответа от АСУ Экспресс");
		map.put("010411", "Сбой при обработке запроса в АСУ Экспресс");
		
		map.put("0105", "Ошибки модуля работы с базой данных");
		map.put("010500", "Open database");
		map.put("010501", "Datebase query");
		map.put("010502", "Unexpected DB content");
		map.put("010503", "Open database");
		map.put("010510", "Invalid login/password");
		
		map.put("0109", "Системные ошибки");
		map.put("010900", "Системная ошибка (ошибка выделения памяти, сбой файловой системы...)");
		map.put("010901", "Система занята. Система находится в стадии перезапуска (или выключения). Ожидается завершение обработки переданных запросов в АСУ «Экспресс». Новые запросы не принимаются. Запросы, ещё не переданные на обработку в АСУ «Экспресс» завершаются с этой ошибкой.");
	}
}
