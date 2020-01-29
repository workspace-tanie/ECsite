package com.internousdev.ecsite10.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.LoginDAO;
import com.internousdev.ecsite10.dto.BuyItemDTO;
import com.internousdev.ecsite10.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private String loginId;
	private String loginPassword;
	
	public String execute(){
		LoginDAO dao=new LoginDAO();
		LoginDTO logindto=new LoginDTO();
		BuyItemDTO buydto=new BuyItemDTO();
		String ret=SUCCESS;
		
		logindto=dao.setLoginUserInfo(loginId,loginPassword);
		buydto=dao.setBuyInfo();
		
		if(logindto.getLoginFlg()){
			session.put("loginId", loginId);
			session.put("onePrice", buydto.getOnPrice());
			session.put("itemId",buydto.getItemId());
			session.put("buyItemName",buydto.getBuyItemName());
		}else{
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
	
}
