package com.coforge.Day7_JDBCPrj;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
 
/**
* Hello world!
*/
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        String uname="root";
        String password="Cfg@1234";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        Connection con= DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        String query="insert into student values(?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, 577);
        ps.setString(2, "Krithi");
        ps.setDouble(3, 99);
        ps.setString(4, "2026-12-02");
        LocalDate date=LocalDate.now();
        Date sqldate=Date.valueOf(date);//converting localdate to sqldate
        ps.setDate(4, sqldate);
        ps.executeUpdate();
        System.out.println("row inserted");
        
        //Statement st=con.createStatement();
       // String query="select * from student";
        
//        ResultSet rs=st.executeQuery(query);
//        System.out.println("Student data");
//        System.out.println("******************************");
//        ResultSetMetaData rsmd=rs.getMetaData();
//        int count =rsmd.getColumnCount();
//        for(int i=1;i<=count;i++) {
//        	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
//        }
//        
//        while(rs.next()) {
//        	System.out.println("studid "+rs.getInt(rsmd.getColumnName(1)));
//        	System.out.println("stdname "+rs.getString(rsmd.getColumnName(2)));
//        	System.out.println("Marks "+rs.getDouble(rsmd.getColumnName(3)));
//        	System.out.println("Mobile no "+rs.getString(rsmd.getColumnName(4)));
//        	System.out.println("************************************");
//        }
//        
        
        
        
    }
}
 