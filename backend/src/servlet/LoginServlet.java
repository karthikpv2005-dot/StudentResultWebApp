package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        String u = req.getParameter("uname");
        String p = req.getParameter("pass");

        if(u.equals("teacher") && p.equals("1234")) {
            req.getSession().setAttribute("teacher", u);
            resp.sendRedirect("dashboard.jsp");
        } else {
            resp.getWriter().println("<h3 style='color:red'>Invalid Login</h3>");
        }
    }
}
