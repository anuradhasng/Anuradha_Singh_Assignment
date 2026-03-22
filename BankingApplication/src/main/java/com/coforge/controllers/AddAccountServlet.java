
package com.coforge.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddAccountServlet() {
        // default constructor
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        long accNo = Long.parseLong(request.getParameter("accNo"));
        String accHolderName = request.getParameter("accHolderName");
        String accType = request.getParameter("accType");
        double balance = Double.parseDouble(request.getParameter("balance"));

        ServletContext context = getServletContext();
        Connection con = (Connection) context.getAttribute("connection");

        try {
            String query = "insert into account values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, accNo);
            ps.setString(2, accHolderName);
            ps.setString(3, accType);
            ps.setDouble(4, balance);

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("<h3>Account Added Successfully</h3>");
            } else {
                out.println("<h3>Account Not Added</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }
}
