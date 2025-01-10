package com.paulpladziewicz.javaservlets;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");

        if (name == null) {
            name = "world";
        }

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Hello, " + name + "</h1>");
        pw.close();
    }
}
