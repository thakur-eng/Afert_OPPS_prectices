package com.kodewala.jdbc.MYJDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLDemo {

	public static void selectRecord() throws ClassNotFoundException, SQLException {

		// Step#1 - Register mysql driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step#2 -Create connection
		String url = "jdbc:mysql://localhost:3306/kodewala";
		String username = "root";
		String password = "Ashish@123";

		Connection con = DriverManager.getConnection(url, username, password);

		// Step#3 - Create statement object

		Statement stm = con.createStatement();
		
 		String sql = "SELECT * FROM attendence";
 		
 		
 		System.out.println("Running SQL: " + sql);

		// Step#4 - Execute query
		
		ResultSet rs =stm.executeQuery("SELECT * FROM attendence");
		
		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String mobile = rs.getString(3);
			String Ststus = rs.getString(4);

			System.out.println("ID : " + id + " Name : " + name + " mobile : " + mobile + " Status : " + Ststus);
		}
		}
		
		 
	}
	
	


