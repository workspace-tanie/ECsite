package com.internousdev.ecsite10.dto;

public class BuyInputDTO {

	private int itemId;
	private String buyItemName;
	private String buyTotalPrice;
	private String stock;
	private String pay;
	
	
	public int getItemId(){
		return itemId;
	}
	
	public void setItemId(int itemId){
		this.itemId=itemId;
	}
	
	public String getBuyItemName() {
		return buyItemName;
	}
	public void setBuyItemName(String buyItemName) {
		this.buyItemName = buyItemName;
	}
	public String getBuyTotalPrice() {
		return buyTotalPrice;
	}
	public void setBuyTotalPrice(String buyTotalPrice) {
		this.buyTotalPrice = buyTotalPrice;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	
	
}
