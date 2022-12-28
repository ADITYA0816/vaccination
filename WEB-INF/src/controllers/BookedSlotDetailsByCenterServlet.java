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

public class BookedSlotDetailsByCenterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
	
		Admin admin = (Admin)session.getAttribute("admin");
		
		String nextPage = "admin_signin.jsp";
		
		String name = request.getParameter("center_name");
		
		if(admin != null) {
			ArrayList<BookedSlot> bookings = BookedSlot.getAllBookingsByCenterName(name);
			request.setAttribute("bookings", bookings);
			
			nextPage = "all_bookings_by_name.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
	
}
