package com.internousdev.ecsite10.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.ItemListDAO;
import com.internousdev.ecsite10.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private List<ItemListDTO> itemList=new ArrayList<ItemListDTO>();
	private String deleteFlg=null;
	
	
	public String execute(){
		itemList=null;
		String ret=SUCCESS;
		ItemListDAO dao=new ItemListDAO();
		
		itemList=dao.setItemInfo();
		
		if(itemList.size()>0){
		session.put("itemList",itemList);
		}
		
		return ret;
	}
	
	

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ItemListDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemListDTO> itemList) {
		this.itemList = itemList;
	}
}
