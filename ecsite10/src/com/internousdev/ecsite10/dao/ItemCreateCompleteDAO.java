package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite10.util.DBConnector;
import com.internousdev.ecsite10.util.DateUtil;

public class ItemCreateCompleteDAO {

	public int inputBuyItemInfo(String buyItemName,String price,String stock){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		DateUtil dateutil=new DateUtil();
		int ret=0;

		String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock,insert_date) VALUES(?,?,?,?)";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,buyItemName);
			ps.setString(2,price);
			ps.setString(3,stock);
			ps.setString(4,dateutil.getDate());
			ret=ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return ret;
	}
}
