package com.internousdev.ecsite10.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.UserCreateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateInputAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	
	public String execute() throws SQLException{
		String ret=SUCCESS;
		UserCreateDAO dao=new UserCreateDAO();
		
		dao.setNewUserInfo(session.get("newLoginId").toString(),
				session.get("newLoginPassword").toString(),
				session.get("newUserName").toString());
		
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
