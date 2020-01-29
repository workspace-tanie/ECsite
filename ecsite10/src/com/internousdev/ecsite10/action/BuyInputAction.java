package com.internousdev.ecsite10.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.BuyInputDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyInputAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	
	public String execute(){
		String ret=SUCCESS;
		BuyInputDAO dao=new BuyInputDAO();
		
		dao.setBuyInfo(Integer.parseInt(session.get("itemId").toString()),
				session.get("buyTotalPrice").toString(),
				session.get("stock").toString(),
				session.get("loginId").toString(),
				session.get("pay").toString());
		
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
