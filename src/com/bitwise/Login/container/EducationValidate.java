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
 * Servlet implementation class EducationValidate
 */
//@WebServlet("/EducationValidate")
public class EducationValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EducationValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in servlet education");
		PrintWriter out = response.getWriter();
		String collegeName = request.getParameter("collegeName");
		String branch = request.getParameter("branch");
		String percentage=(request.getParameter("percentage"));
		
		System.out.println(" "+collegeName+" "+branch+" "+percentage);
		if(collegeName.isEmpty() ||branch.isEmpty() || percentage.isEmpty()|| !collegeName.matches("^[a-zA-Z\\s]*$")||!branch.matches("^[a-zA-Z\\s]*$"))
		{
			out.println("<br> please Fill All The Fields<br><br>");
			request.getRequestDispatcher("EducationInfo.jsp").include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("OccupationInfo.jsp");
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
