package com.coforge.controllers;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.coforge.dao.AccountDAO;
import com.coforge.model.Account;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
import jakarta.servlet.ServletContext;
 
/**
* Servlet implementation class ViewAccountServlet
*/
@WebServlet("/ViewAccountsServlet")
public class ViewAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO dao=new AccountDAO();
 
    /**
     * Default constructor.
     */
    public ViewAccountsServlet() {
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		Connection con=(Connection) context.getAttribute("connection");
		List<Account>accList=new ArrayList<Account>();
		try {
		accList=dao.getAllAccounts(con);
		}catch(SQLException e) {
			e.printStackTrace();
 
	}
		PrintWriter out=response.getWriter();
		out.println("<html><body><table border=3px>");
		out.println("<thead><tr><th><Account Number</th><th>Account HolderName</th>");
		out.println("<th>Account Type</th><th>Balance</th></tr></thread>");
		out.println("<tbody><tr>");
		for(Account acc:accList) {
			out.println("<tr><td>"+acc.getAccNo()+"</td>");
			out.println("<td>"+acc.getAccHolderName()+"</td>");
			out.println("<td>"+acc.getAcctype()+"</td>");
			out.println("<td>"+acc.getBalance()+"</td></tr>");
		}
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
 
 