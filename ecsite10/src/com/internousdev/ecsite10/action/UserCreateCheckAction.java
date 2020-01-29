package com.internousdev.ecsite10.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCheckAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private String loginId;
	private String loginPassword;
	private String userName;
	private String errorMessage;
	
	public String execute() throws SQLException{
		String ret=SUCCESS;
		
		if(!(this.loginId.equals("")) &&
				!(this.loginPassword.equals("")) &&
				!(this.userName.equals(""))
			){
			session.put("newLoginId",loginId);
			session.put("newLoginPassword", loginPassword);
			session.put("newUserName", userName);
			setErrorMessage("");
		}else{
			setErrorMessage("未記入の項目があります。");
			ret=ERROR;
		}
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
