package com.JdbcPre.JdbcBatchGroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Batch_Grouping {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/kodewala";
		String username = "root";
		String password = "Ashish@123";

		Connection con = DriverManager.getConnection(url, username, password);

		Statement stm = con.createStatement();

		String insertSql = " insert into student (id,name,mobile,address) values( ?,?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(insertSql);

		for (int i = 1; i < 1609; i++) {

			pstmt.setString(1, "6" + i);
			pstmt.setString(2, "Ramesh" + i);
			pstmt.setString(3, "3020304050" + i);
			pstmt.setString(4, "UAE" + i);
			pstmt.addBatch();

			if (i % 500 == 0) {
				System.out.println("Executing batch of 500..");
				pstmt.executeBatch();
			}

		}

		System.out.println("Executing remaining records...");

	}

}