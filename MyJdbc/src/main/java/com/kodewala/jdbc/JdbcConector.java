package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConector {

	public void selectRecord() throws SQLException, ClassNotFoundException {

		// Step#1 - Register mysql driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 -Create connection

		String url = "jdbc:mysql://localhost:3306/kodewala";
		String userName = "root";
		String password = "Ashish@123";

		Connection con = DriverManager.getConnection(url, userName, password);

		// Step#3 - Create statement object

		Statement stmt = con.createStatement();

		//String sql = "select count(*) from kodewala.orders";
		String sql = "SELECT * FROM student";


		// Step#4 - Execute query

		ResultSet rs = stmt.executeQuery("select * from student");

		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String mobile = rs.getString(3);
			String address = rs.getString(4);

			System.out.println("ID : " + id + " Name : " + name + " mobile : " + mobile + " address : " + address);
		}

	}

}
