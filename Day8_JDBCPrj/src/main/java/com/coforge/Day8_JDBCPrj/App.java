package com.coforge.Day8_JDBCPrj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
 
/**
* Hello world!
*/
public class App {
    public static void main(String[] args ) throws SQLException, ClassNotFoundException {
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        String uname="root";
        String password="Cfg@1234";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con=DriverManager.getConnection(url,uname,password);
        System.out.println("Connection established");
        
        String query="{call get_All_Students}";
        CallableStatement cs=con.prepareCall(query);
        
        ResultSet rs=cs.executeQuery();
        System.out.println("Student data");
        
        System.out.println("******************");
        ResultSetMetaData rsmd=rs.getMetaData();
        int count=rsmd.getColumnCount();
        for(int i=1;i<=count;i++) {
        	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
        }
    }}
 