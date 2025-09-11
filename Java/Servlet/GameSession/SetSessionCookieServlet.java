import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/setSessionCookie")
public class SetSessionCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
        Cookie sessionCookie=new Cookie("sessionUser", "JohnDoe");
        res.addCookie(sessionCookie);
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h2>Session cookie creates!</h2>");
        out.println("<p>Close the Browser to delete this cookie.</p>");
        out.println("<a href='getSessionCookieServlet'> Check Cookie");



    }
}
