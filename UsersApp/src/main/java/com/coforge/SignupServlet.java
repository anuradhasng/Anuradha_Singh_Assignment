package com.coforge;
 
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;
 
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
 
    public static List<User> users = new ArrayList<>();
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
 
        User user = new User(userId, username, password, email, mobile);
 
        users.add(user);
 
        response.sendRedirect("login.jsp");
    }
}
 