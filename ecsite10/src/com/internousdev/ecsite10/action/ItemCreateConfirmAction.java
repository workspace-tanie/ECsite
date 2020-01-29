package com.internousdev.ecsite10.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private String buyItemName;
	private String price;
	private String stock;
	private String errorMessage;
	
	public String execute(){
		String ret=SUCCESS;
		if(!(this.buyItemName.equals("")) &&
				!(this.price.equals("")) &&
				!(this.stock.equals(""))){
			
			System.out.println(buyItemName);
			session.put("buyItemName", buyItemName);
			session.put("price", price);
			session.put("stock", stock);
			
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

	public String getBuyItemName() {
		return buyItemName;
	}

	public void setBuyItemName(String buyItemName) {
		this.buyItemName = buyItemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
