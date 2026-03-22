
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

@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            long accNo = Long.parseLong(request.getParameter("accNo").trim());

            // Optional fields (if blank, we do not update that column)
            String newName = request.getParameter("accHolderName");
            String newType = request.getParameter("accType");
            String balParam = request.getParameter("balance");

            boolean updateName = newName != null && !newName.trim().isEmpty();
            boolean updateType = newType != null && !newType.trim().isEmpty();
            boolean updateBal  = balParam != null && !balParam.trim().isEmpty();

            if (!updateName && !updateType && !updateBal) {
                out.println("<h3>No fields to update</h3>");
                return;
            }

            StringBuilder sql = new StringBuilder("UPDATE account SET ");
            boolean first = true;

            if (updateName) {
                sql.append("accholdername = ?");
                first = false;
            }
            if (updateType) {
                if (!first) sql.append(", ");
                sql.append("acctype = ?");
                first = false;
            }
            if (updateBal) {
                if (!first) sql.append(", ");
                sql.append("balance = ?");
            }
            sql.append(" WHERE accno = ?");

            ServletContext ctx = getServletContext();
            Connection con = (Connection) ctx.getAttribute("connection");

            PreparedStatement ps = con.prepareStatement(sql.toString());

            int idx = 1;
            if (updateName) {
                ps.setString(idx++, newName.trim());
            }
            if (updateType) {
                ps.setString(idx++, newType.trim());
            }
            if (updateBal) {
                ps.setDouble(idx++, Double.parseDouble(balParam.trim()));
            }
            ps.setLong(idx, accNo);

            int count = ps.executeUpdate();

            if (count > 0) {
                out.println("<h3>Account Updated Successfully</h3>");
            } else {
                out.println("<h3>No Account Found with Number: " + accNo + "</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }

    // Optional safety: redirect GET to home if someone hits URL directly
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
