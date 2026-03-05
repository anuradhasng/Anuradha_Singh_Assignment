package com.coforge;
 
import java.io.IOException;

import java.io.PrintWriter;
 
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
 
 
/**

* Servlet implementation class FirstServlet

*/

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
 
    /**

     * Default constructor. 

     */

    public Servlet() {

        // TODO Auto-generated constructor stub

    }
 
	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	     PrintWriter out=response.getWriter();

	     out.println("<body bgcolor= cyan>");

	     out.println("<h1 style=color:red>Hello Servlet............</h1>.");

	     out.print("</body>");

	     out.close();

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}
 
	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub

		doGet(request, response);

	}
 
}

 