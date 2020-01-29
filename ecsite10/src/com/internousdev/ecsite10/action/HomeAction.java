package com.internousdev.ecsite10.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.LoginDAO;
import com.internousdev.ecsite10.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	
	public String execute(){
		
		String ret=SUCCESS;
		
		if(session.containsKey("loginId")){
			LoginDAO dao=new LoginDAO();
			BuyItemDTO dto=new BuyItemDTO();
			
			dto=dao.setBuyInfo();
			
			session.put("id", dto.getItemId());
			session.put("buyItemName", dto.getBuyItemName());
			session.put("onPrice", dto.getOnPrice());
			ret="loginPass";
		}
		
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
