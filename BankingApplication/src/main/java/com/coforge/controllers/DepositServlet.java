
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

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DepositServlet() {
        // default constructor
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        long accNo = Long.parseLong(request.getParameter("accNo"));
        double amount = Double.parseDouble(request.getParameter("amount"));

        ServletContext context = getServletContext();
        Connection con = (Connection) context.getAttribute("connection");

        try {
            String query = "update account set balance = balance + ? where accno = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, amount);
            ps.setLong(2, accNo);

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("<h3>Amount Deposited Successfully</h3>");
            } else {
                out.println("<h3>Invalid Account Number</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }
}
