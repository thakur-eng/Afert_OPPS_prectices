package com.JdbcPre.Jdbc_Catch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App_jdbc_Catch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2 -Create connection
		String url = "jdbc:mysql://localhost:3306/kodewala";
		String username = "root";
		String password = "Ashish@123";

		Connection con = DriverManager.getConnection(url, username, password);

		// String insertSql =" insert into student (id,name,mobile,address)
		// values('5','Vikrant','9087653412','Kolkata')";
		String insertSql = " insert into student (id,name,mobile,address) values( ?,?,?,?)";

		// Step#3 - Create statement object

		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		// Step#4 - Execute query
		for (int i = 0; i < 200; i++)   //  reciving recordes from files /xls
		{
			pstmt.setString(1, "6" + i);
			pstmt.setString(2, "Mahesh ji" + i);
			pstmt.setString(3, "1020304050" + i);
			pstmt.setString(4, "USA" + i);
			pstmt.addBatch();

		}

		int recordsInserted[] = pstmt.executeBatch();
		System.out.println(recordsInserted);
		
	}

}
