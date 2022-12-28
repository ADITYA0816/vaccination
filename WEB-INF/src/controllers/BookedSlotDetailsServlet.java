package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;
import models.BookedSlot;
import models.VaccinationCenter;

public class BookedSlotDetailsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
	
		Admin admin = (Admin)session.getAttribute("admin");
		
		String nextPage = "admin_signin.jsp";
		
		if(admin != null) {
			ArrayList<BookedSlot> bookings = BookedSlot.getAllBookings();
			request.setAttribute("bookings", bookings);
			
			ArrayList<VaccinationCenter> centers = VaccinationCenter.getAllCenterNames();
			request.setAttribute("centers", centers);
			
			nextPage = "all_bookings.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
	
}
