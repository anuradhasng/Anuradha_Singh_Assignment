package com.coforge.listener;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DBConnectionListener implements ServletContextListener {
	
	private Connection connection;

    
    public DBConnectionListener() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	ServletContextListener.super.contextInitialized(sce);
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		String url="jdbc:mysql://localhost:3306/cfgdb";
    		String uname="root";
    		String pwd="Cfg@1234";
    		connection=DriverManager.getConnection(url,uname,pwd);
    		ServletContext context=sce.getServletContext();
    		context.setAttribute("connection",connection);
    		System.out.println("Connection created and added to context");
    		
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		
    	}
    }
     @Override
     public void contextDestroyed(ServletContextEvent sce) {
    	 ServletContextListener.super.contextDestroyed(sce);
    	 try {
    		 if(connection !=null && !connection.isClosed()) {
    			 connection.close();
    		 }
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
     }
	
}
