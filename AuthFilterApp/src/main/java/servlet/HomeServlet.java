package servlet;
 
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
 
import java.io.IOException;
 
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
 
        RequestDispatcher rd =
                request.getRequestDispatcher("home.jsp");
 
        rd.forward(request,response);
    }
}
 