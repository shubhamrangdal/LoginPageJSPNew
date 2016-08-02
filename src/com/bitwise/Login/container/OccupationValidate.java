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
 * Servlet implementation class OccupationValidate
 */
//@WebServlet("/OccupationValidate")
public class OccupationValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OccupationValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String companyName = request.getParameter("companyName");
		String designation = request.getParameter("designation");
		String salary=(request.getParameter("salary"));
		
		System.out.println(" "+companyName+" "+designation+" "+salary);
		if(companyName.isEmpty() ||designation.isEmpty() || salary.isEmpty() || !companyName.matches("^[a-zA-Z\\s]*$")|| !designation.matches("^[a-zA-Z\\s]*$") )
		{
			out.println("<br> please Fill All The Fields<br><br>");
			request.getRequestDispatcher("OccupationInfo.jsp").include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("ResidentialInfo.jsp");
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
