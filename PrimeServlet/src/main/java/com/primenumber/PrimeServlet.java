package com.primenumber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Prime Number Result</title></head><body>");
            out.println("<div style='margin: 20px; padding: 20px; border: 1px solid #ccc;'>");
            out.println("<h2>Prime Number Checker</h2>");
            out.println("<p>Number: <strong>" + number + "</strong></p>");
            if (isPrime) {
                out.println("<p style='color: green;'>It is a Prime Number!</p>");
            } else {
                out.println("<p style='color: red;'>It is NOT a Prime Number.</p>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</div></body></html>");

        } catch (NumberFormatException e) {
            out.println("<!DOCTYPE html>");
            out.println("<html><body><h3 style='color:red;'>Invalid input! Please enter a valid number.</h3>");
            out.println("<a href='index.html'>Go Back</a></body></html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}

