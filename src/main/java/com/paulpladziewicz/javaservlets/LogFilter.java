package com.paulpladziewicz.javaservlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LogFilter initalized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            System.out.println("Request URI: " + httpRequest.getRequestURI());
            System.out.println("Request Method: " + httpRequest.getMethod());
            System.out.println("Client IP: " + request.getRemoteAddr());
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("LogFilter destroyed");
    }
}

