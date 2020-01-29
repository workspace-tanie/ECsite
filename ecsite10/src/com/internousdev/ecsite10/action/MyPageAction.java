package com.internousdev.ecsite10.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite10.dao.MyPageDAO;
import com.internousdev.ecsite10.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private List<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();
	private String message;
	private String deleteFlg;
	
	public String execute(){
		
		if(!(session.containsKey("loginId"))){
			return ERROR;
		}
		
		MyPageDAO dao=new MyPageDAO();
		String ret=SUCCESS;
		if(deleteFlg==null){
			myPageList=dao.getUserBuyInfo(Integer.parseInt(session.get("itemId").toString()),
					session.get("loginId").toString());
		
		}
		else if(deleteFlg.equals("1")){
			delete();
		}
		
		return ret;
	}
	
	public void delete(){
		MyPageDAO dao=new MyPageDAO();
		int ret=dao.userBuyInfoDelete(Integer.parseInt(session.get("itemId").toString()),
				session.get("loginId").toString());
		
		if(ret>0){
			System.out.println(ret+"件、削除");
			setMessage("商品情報を正しく削除しました。");
			myPageList=null;
		}else if(ret==0){
			setMessage("商品削除に失敗しました。");
		}
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<MyPageDTO> getMyPageList() {
		return myPageList;
	}

	public void setMyPageList(List<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
}
