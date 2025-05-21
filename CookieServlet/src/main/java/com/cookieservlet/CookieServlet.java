package com.cookieservlet;
import java.io.*;
import jakarta.servlet.*;                // Updated
import jakarta.servlet.http.*;          // Updated
import jakarta.servlet.annotation.WebServlet;  // Updated



@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    int count = 0; // count for loading times

    // Handle GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // 1 minute
            userCookie.setPath("/");
            response.addCookie(userCookie);
        }

        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                    break;
                }
            }
        }

        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");
        if (existingUser != null) {
            count += 1;
            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + count + " times!</h2></font>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    // Handle POST requests (logout)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
        response.sendRedirect("CookieServlet");
    }
}



