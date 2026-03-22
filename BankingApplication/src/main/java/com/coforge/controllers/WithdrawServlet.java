
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

@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public WithdrawServlet() {
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
            String checkQuery = "select balance from account where accno = ?";
            PreparedStatement ps1 = con.prepareStatement(checkQuery);
            ps1.setLong(1, accNo);
            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                double balance = rs.getDouble("balance");

                if (balance >= amount) {
                    String updateQuery =
                            "update account set balance = balance - ? where accno = ?";
                    PreparedStatement ps2 = con.prepareStatement(updateQuery);
                    ps2.setDouble(1, amount);
                    ps2.setLong(2, accNo);

                    ps2.executeUpdate();
                    out.println("<h3>Amount Withdrawn Successfully</h3>");
                } else {
                    out.println("<h3>Insufficient Balance</h3>");
                }
            } else {
                out.println("<h3>Invalid Account Number</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }
}
