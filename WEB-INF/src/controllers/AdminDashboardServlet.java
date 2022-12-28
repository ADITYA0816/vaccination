package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;

public class AdminDashboardServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		
		Admin admin = (Admin)session.getAttribute("admin");
		
		String nextPage = "admin_signin.jsp";
		
		if(admin != null) {
			nextPage = "admin_dashboard.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
}