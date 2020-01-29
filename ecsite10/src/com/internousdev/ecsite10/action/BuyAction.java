package com.internousdev.ecsite10.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class BuyAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private int stock;
	private String pay;
	
	public String execute(){
		String ret=SUCCESS;
		
		int buyTotalPrice=Integer.parseInt(session.get("onePrice").toString()) * stock;
		
		session.put("buyTotalPrice",buyTotalPrice);
		session.put("stock", stock);
		
		if(this.pay.equals("1")){
			session.put("pay", "現金払い");
		}else if(this.pay.equals("2")){
			session.put("pay", "クレジットカード");
		}
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}
}
