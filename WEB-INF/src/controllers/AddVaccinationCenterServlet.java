package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.VaccinationCenter;

public class AddVaccinationCenterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("add_vaccination_center.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String contact = request.getParameter("contact");
	
		VaccinationCenter vaccinationCenter = new VaccinationCenter(name,city,state,contact);
		vaccinationCenter.addCenter();
		
		request.getRequestDispatcher("admin_dashboard.jsp").forward(request, response);
	}
}
