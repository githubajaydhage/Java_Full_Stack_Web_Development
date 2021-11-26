package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con;
	
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");	
		} catch (Exception e) {
			System.out.println("Db Connection "+e);
		}
		return con;
	}
}
