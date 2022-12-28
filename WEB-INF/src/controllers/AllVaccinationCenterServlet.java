package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;
import models.VaccinationCenter;

public class AllVaccinationCenterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		
		Admin admin = (Admin)session.getAttribute("admin");
		
		String nextPage = "admin_signin.jsp";
		
		if(admin != null) {
			ArrayList<VaccinationCenter> centers = VaccinationCenter.getAllVaccinationCenter();
			request.setAttribute("centers", centers);
			
			nextPage = "all_vaccination_centers.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
}
