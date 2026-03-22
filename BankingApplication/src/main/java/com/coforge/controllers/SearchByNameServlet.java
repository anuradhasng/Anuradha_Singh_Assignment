
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

@WebServlet("/SearchByNameServlet")
public class SearchByNameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SearchByNameServlet() {
        // default constructor
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("accHolderName");

        ServletContext context = getServletContext();
        Connection con = (Connection) context.getAttribute("connection");

        try {
            String query = "select * from account where accholdername = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            out.println("<h3>Search Result</h3>");
            out.println("<table border='2'>");
            out.println("<tr><th>Account No</th><th>Name</th><th>Type</th><th>Balance</th></tr>");

            while (rs.next()) {
                found = true;
                out.println("<tr>");
                out.println("<td>" + rs.getLong("accno") + "</td>");
                out.println("<td>" + rs.getString("accholdername") + "</td>");
                out.println("<td>" + rs.getString("acctype") + "</td>");
                out.println("<td>" + rs.getDouble("balance") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");

            if (!found) {
                out.println("<h3>No Account Found</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }
}
