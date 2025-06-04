package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	static String url="jdbc:mysql://localhost:3306/jdbc__db";
	static String user="root";
	static String password="Ashish@123";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		PreparedStatement ps = con.prepareStatement("INSERT INTO `register`(`name`, `email`, `gender`, `address`) VALUES (?, ?, ?, ?)");

		
		
		
		
		
		ps.setString(1, "Ashish");
		ps.setString(2, "ashish@123");
		ps.setString(3, "male");
		ps.setString(4, "bihar");

		int i = ps.executeUpdate();
		

		if (i > 0) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

		con.close(); // good practice to close connection
	}
}