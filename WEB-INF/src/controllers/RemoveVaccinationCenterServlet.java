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

public class RemoveVaccinationCenterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		
		Admin admin = (Admin)session.getAttribute("admin");
		if(admin==null) {
			request.getRequestDispatcher("admin_login.do").forward(request, response);
		}
		
		int centerId = Integer.parseInt(request.getParameter("vaccination_center_id"));
		
		if(VaccinationCenter.remove(centerId))
			request.getRequestDispatcher("all_vaccination_center.do").forward(request, response);
		else
			request.getRequestDispatcher("admin_signin.do").forward(request, response);
	}
}
