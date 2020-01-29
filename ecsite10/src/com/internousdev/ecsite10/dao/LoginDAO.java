package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite10.dto.BuyItemDTO;
import com.internousdev.ecsite10.dto.LoginDTO;
import com.internousdev.ecsite10.util.DBConnector;


public class LoginDAO {

	public LoginDTO setLoginUserInfo(String loginId,String loginPassword){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO dto=new LoginDTO();
		
		String sql="SELECT * FROM login_user_transaction WHERE login_id=? AND login_pass=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,loginId);
			ps.setString(2,loginPassword);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setLoginFlg(true);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	public BuyItemDTO setBuyInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		BuyItemDTO dto=new BuyItemDTO();
		
		String sql="SELECT id,item_name,item_price FROM item_info_transaction";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				dto.setItemId(rs.getInt("id"));
				dto.setBuyItemName(rs.getString("item_name"));
				dto.setOnPrice(rs.getInt("item_price"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return dto;
	}
}
