package by.iba.railway.eticket.xml.services;

/**
 * Created by Dzemianchyk_AI on 01.04.2016.
 */
public interface CallbackStatistic {
    public enum ResponseStatus { SUCCESS,ERROR_GATEWAY, ERROR_EXPRESS}
    public void saveQueryTime(String type, ResponseStatus status, long timeInMs, String errorCode);
}
