package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BookedSlot;
import models.Slot;

public class BookedSlotServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		int slot_id = Integer.parseInt(request.getParameter("slot_id"));
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		
		Slot.decrementSlotCount(slot_id);
		BookedSlot.addSlotBooking(user_id,slot_id);
		
		request.getRequestDispatcher("user_dashboard.do").forward(request, response);
	}
}
