package filter;
 
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;
 
import java.io.IOException;
 
@WebFilter({"/home","/profile","/dashboard"})
public class AuthenticationFilter implements Filter {
 
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
 
        HttpSession session = req.getSession(false);
 
        boolean loggedIn =
                (session != null &&
                 session.getAttribute("user") != null);
 
        if(loggedIn){
 
            chain.doFilter(request,response);
 
        } else {
 
            res.sendRedirect("login.jsp");
        }
    }
}
 