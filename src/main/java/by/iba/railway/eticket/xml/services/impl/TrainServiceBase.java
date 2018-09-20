package by.iba.railway.eticket.xml.services.impl;

public abstract class TrainServiceBase {
	protected String siteUrl="";
	protected String login="";
	protected String password="";
	public TrainServiceBase(String siteUrl, String login, String password) {
		this.siteUrl = siteUrl;
		this.login = login;
		this.password = password;
		
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSiteUrl() {
		return siteUrl;
	}
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

}
