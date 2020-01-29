package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite10.util.DBConnector;
import com.internousdev.ecsite10.util.DateUtil;

public class BuyInputDAO {

	public int setBuyInfo(int itemId,String buyTotalPrice,String stock,String loginId,String pay){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		DateUtil dateUtil=new DateUtil();
		int ret=0;
		
		String sql="INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) values(?,?,?,?,?,?)";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			ps.setString(2,buyTotalPrice);
			ps.setString(3,stock);
			ps.setString(4,loginId);
			ps.setString(5,pay);
			ps.setString(6,dateUtil.getDate());
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
