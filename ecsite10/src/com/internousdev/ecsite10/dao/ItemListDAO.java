package com.internousdev.ecsite10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite10.dto.ItemListDTO;
import com.internousdev.ecsite10.util.DBConnector;

public class ItemListDAO {

	public List<ItemListDTO> itemList=new ArrayList<ItemListDTO>();
	
	public List<ItemListDTO> setItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		
		String sql="SELECT * FROM item_info_transaction";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				ItemListDTO dto=new ItemListDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getString("item_price"));
				dto.setStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpDate(rs.getString("updated_date"));
				itemList.add(dto);
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
		return itemList;
	}
	
	public int deleteItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		int i=0;
		String sql="DELETE FROM item_info_transaction";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			i=ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return i;
	}
}
