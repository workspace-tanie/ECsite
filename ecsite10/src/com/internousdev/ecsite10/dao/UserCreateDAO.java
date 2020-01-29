package com.internousdev.ecsite10.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite10.util.DBConnector;
import com.internousdev.ecsite10.util.DateUtil;

public class UserCreateDAO {

	public int setNewUserInfo(String loginId,String loginPassword,String userName) throws SQLException{
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		int ret=0;
		DateUtil dateUtil=new DateUtil();
		
		String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date) values(?,?,?,?)";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,loginId);
			ps.setString(2,loginPassword);
			ps.setString(3,userName);
			ps.setString(4,dateUtil.getDate());
			ret=ps.executeUpdate();
			
			if(ret>0){
				System.out.println("登録完了");
			}else{
				System.out.println("登録エラー");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return ret;
	}
}
