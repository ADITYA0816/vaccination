package controllers;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;
import models.Slot;
import models.VaccinationCenter;

public class AddSlotServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		
		Admin admin = (Admin)session.getAttribute("admin");
		
		String nextPage = "admin_signin.jsp";
		
		if(admin != null) {
			ArrayList<VaccinationCenter> centers = VaccinationCenter.getAllVaccinationCenter();
			request.setAttribute("centers", centers);
			
			nextPage = "all_vaccination_center_add_slot.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		
		Admin admin = (Admin)session.getAttribute("admin");
		if(admin==null) {
			request.getRequestDispatcher("admin_login.do").forward(request, response);
		}
		
		int centerId = Integer.parseInt(request.getParameter("vaccination_center_id"));
		String date = request.getParameter("date");
		Date dateFormatted = Date.valueOf(date);
		
		Slot.addSlot(centerId, dateFormatted);
		
		response.sendRedirect("admin_dashboard.jsp");
		
	}
}
