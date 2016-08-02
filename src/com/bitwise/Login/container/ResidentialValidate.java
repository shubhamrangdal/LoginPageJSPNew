package com.bitwise.Login.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResidentialValidate
 */
//@WebServlet("/ResidentialValidate")
public class ResidentialValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResidentialValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String city=(request.getParameter("city"));
		String pincode = request.getParameter("pincode");
		System.out.println(" "+name+" "+address+" "+city);
		if(name.isEmpty() ||address.isEmpty() || city.isEmpty() || pincode.isEmpty()||!name.matches("^[a-zA-Z\\s]*$")||!address.matches("^[a-zA-Z\\s]*$")||!city.matches("^[a-zA-Z\\s]*$") )
		{
			out.println("<br> Please Fill All The Fields<br><br>");
			request.getRequestDispatcher("ResidentialInfo.jsp").include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("DisplayInformation.jsp");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
