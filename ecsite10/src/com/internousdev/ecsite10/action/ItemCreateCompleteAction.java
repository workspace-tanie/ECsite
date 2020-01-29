package com.internousdev.ecsite10.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	
	public String execute(){
		String ret=SUCCESS;
		ItemCreateCompleteDAO dao=new ItemCreateCompleteDAO();
		
		dao.inputBuyItemInfo(session.get("buyItemName").toString(),
				session.get("price").toString(),
				session.get("stock").toString());
		
		return ret;
		
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}
