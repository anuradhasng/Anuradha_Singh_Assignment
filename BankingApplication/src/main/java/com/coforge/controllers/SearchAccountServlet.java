
package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SearchAccountServlet")
public class SearchAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SearchAccountServlet() {
        // default constructor
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        long accNo = Long.parseLong(request.getParameter("accNo"));

        ServletContext context = getServletContext();
        Connection con = (Connection) context.getAttribute("connection");

        try {
            String query = "select * from account where accno = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, accNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h3>Account Details</h3>");
                out.println("<table border='2'>");
                out.println("<tr><th>Account Number</th><th>Account Holder</th><th>Account Type</th><th>Balance</th></tr>");
                out.println("<tr>");
                out.println("<td>" + rs.getLong("accno") + "</td>");
                out.println("<td>" + rs.getString("accholdername") + "</td>");
                out.println("<td>" + rs.getString("acctype") + "</td>");
                out.println("<td>" + rs.getDouble("balance") + "</td>");
                out.println("</tr>");
                out.println("</table>");
            } else {
                out.println("<h3>Account Not Found</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }
}
