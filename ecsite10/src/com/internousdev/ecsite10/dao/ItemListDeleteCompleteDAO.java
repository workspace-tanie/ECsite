package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite10.util.DBConnector;

public class ItemListDeleteCompleteDAO {

	public void deleteItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		
		String sql="DELETE FROM item_info_transaction";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
