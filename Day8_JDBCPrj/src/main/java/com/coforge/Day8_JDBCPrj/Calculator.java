package com.coforge.Day8_JDBCPrj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
 
public class Calculator {
	public static void main(String[] args) throws SQLException , ClassNotFoundException {
		 System.out.println("Hello World!");
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver Loaded");
	        
	        String uname="root";
	        String password="Cfg@1234";
	        String url="jdbc:mysql://localhost:3306/cfgdb";
	        
	        Connection con=DriverManager.getConnection(url,uname,password);
	        System.out.println("Connection established");
	        
	        String query="{call add_numbers(?,?,?)}";
	        CallableStatement cs=con.prepareCall(query);
	        cs.setInt(1, 43);
	        cs.setInt(2, 55);
	        cs.registerOutParameter(3, Types.INTEGER);
	        
	        cs.execute();
	        int sum=cs.getInt(3);
	        System.out.println("Addition of two numbers :"+sum);
	        
	}
 
}
 
 