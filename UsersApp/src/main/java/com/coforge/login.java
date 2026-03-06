package com.coforge;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;
 
import java.io.IOException;
 
@WebServlet("/login")
public class login extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
 
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
 
		boolean valid = false;
 
		for(User u : SignupServlet.users) {
 
			if(u.getUsername().equals(uname) && u.getPassword().equals(pwd)) {
				valid = true;
				break;
			}
		}
 
		RequestDispatcher rd;
 
		if(valid) {
 
			request.setAttribute("uname", uname);
			rd = request.getRequestDispatcher("/welcome.jsp");
 
		} else {
 
			rd = request.getRequestDispatcher("/error.jsp");
		}
 
		rd.forward(request, response);
	}
}
 