package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoggingWithFilter
 */
@WebServlet("/LoggingWithFilter")
public class LoggingWithFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger=LogManager.getLogger(LoggingWithFilter.class);

    /**
     * Default constructor. 
     */
    public LoggingWithFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("doGet called at {}",LocalDateTime.now());
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=cyan>");
		out.println("<h1>My name is Anuradha</h1>");
		out.println("<h1>Timepass</h1>");
		out.println("<h1>Current Trainingh</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
