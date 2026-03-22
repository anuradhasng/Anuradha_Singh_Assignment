package servlet;
 
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
 
import java.io.IOException;
 
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
 
        RequestDispatcher rd =
                request.getRequestDispatcher("profile.jsp");
 
        rd.forward(request,response);
    }
}
 