package by.iba.railway.eticket.xml.dao;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LocalLogger {
	private Logger logger;
	private String className = "";
	private static final String LOGGER_NAME="XMLGate";
	public LocalLogger(String name) {
		className = name;
		logger = LogManager.getLogger(LOGGER_NAME);
		
	}
	public void debug(Object message)
	{
		message = className+": "+message;
		logger.debug(message);
	}
	public void info(Object message)
	{
		message = className+": "+message;
		logger.info(message);
	}
	public void error(Object message)
	{
		message = className+": "+message;
		logger.error(message);
	}
	public void error(Object message,Throwable th)
	{
		message = className+": "+message;
		StringWriter writer = new StringWriter();
		PrintWriter err;
		try {
			err = new PrintWriter(writer);
			th.printStackTrace(err);
			logger.error(message);
			logger.error(writer.toString());
		} catch (Exception e) {
		}
	}
}