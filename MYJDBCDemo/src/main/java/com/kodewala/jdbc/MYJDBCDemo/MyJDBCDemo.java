package com.kodewala.jdbc.MYJDBCDemo;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class MyJDBCDemo
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	
    	JDBCSQLDemo result = new JDBCSQLDemo();
    	result.selectRecord();
    	
        System.out.println( "Its my final demo JDBCSQL" );
    }
}
