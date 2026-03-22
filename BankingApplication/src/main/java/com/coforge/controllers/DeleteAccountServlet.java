
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

@WebServlet("/DeleteAccountServlet")
public class DeleteAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            long accNo = Long.parseLong(request.getParameter("accNo").trim());

            ServletContext ctx = getServletContext();
            Connection con = (Connection) ctx.getAttribute("connection");

            String sql = "DELETE FROM account WHERE accno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, accNo);

            int count = ps.executeUpdate();

            if (count > 0) {
                out.println("<h3>Account Deleted Successfully</h3>");
            } else {
                out.println("<h3>No Account Found with Number: " + accNo + "</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error Occurred</h3>");
        }
    }

    // Optional: prevent GET misuse
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
