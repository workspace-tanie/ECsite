package com.internousdev.ecsite10.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";

	private static String url=
			"jdbc:mysql://localhost/ecsite10";

	private static String user ="root11";
	private static String password="ningenhusin";

	public Connection getConnection(){
		Connection con = null;

		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
