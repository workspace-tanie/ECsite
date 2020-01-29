package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite10.dto.MyPageDTO;
import com.internousdev.ecsite10.util.DBConnector;


public class MyPageDAO {

	 List<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();
	
	public List<MyPageDTO> getUserBuyInfo(int itemId,String loginId){
		
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		
		String sql="SELECT iit.item_name,ubit.total_price,ubit.total_count,ubit.pay,ubit.user_master_id,ubit.insert_date "
				+ "FROM item_info_transaction iit "
				+ "LEFT JOIN user_buy_item_transaction ubit "
				+ "ON iit.id=ubit.item_transaction_id "
				+ "WHERE ubit.item_transaction_id=? AND ubit.user_master_id=? "
				+ "ORDER BY insert_date DESC";
		

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			ps.setString(2,loginId);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				MyPageDTO dto=new MyPageDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setBuyTotalPrice(rs.getString("total_price"));
				dto.setStock(rs.getString("total_count"));
				dto.setPay(rs.getString("pay"));
				dto.setInsertDate(rs.getString("insert_date"));
				myPageList.add(dto);
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
			return myPageList;
	}
	
	public int userBuyInfoDelete(int itemId,String loginId){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		int ret=0;
		
		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id=? AND user_master_id=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,itemId);
			ps.setString(2,loginId);
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
