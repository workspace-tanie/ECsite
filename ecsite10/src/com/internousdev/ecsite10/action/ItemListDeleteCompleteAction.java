package com.internousdev.ecsite10.action;

import com.internousdev.ecsite10.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListDeleteCompleteAction extends ActionSupport{

	
	public String execute(){
		ItemListDeleteCompleteDAO dao=new ItemListDeleteCompleteDAO();
		
		dao.deleteItemInfo();
		
		return SUCCESS;
	}
	
	
}
