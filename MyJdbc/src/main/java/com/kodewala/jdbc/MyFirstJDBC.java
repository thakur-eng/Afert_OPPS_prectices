package com.kodewala.jdbc;

import java.sql.SQLException;

public class MyFirstJDBC {
	
	public static void main(String[] args) {

		JdbcConector connector = new JdbcConector();

		try {
			connector.selectRecord();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Hello world ");
		
	}
}
