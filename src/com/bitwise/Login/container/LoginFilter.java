package com.bitwise.Login.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter(urlPatterns = { "/LoginFilter" }, servletNames = { "LoginPage" })
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		if(request.getParameter("username").equals("Shubham")&& request.getParameter("password").equals("12345"))
			chain.doFilter(request, response);
		else
		{
			out.print("<br color=\"red\"> Invalid Username and Password<br><br><br>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
