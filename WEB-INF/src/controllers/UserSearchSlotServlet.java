package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Slot;
import models.User;
import models.VaccinationCenter;

public class UserSearchSlotServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("user_search_slot.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String cityName = request.getParameter("cityName");
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");
		
		String nextPage = "user_signin.jsp";
		
		if(user != null) {
			ArrayList<Slot> availableSlots = Slot.getAllSlotsByCity(cityName);
			request.setAttribute("availableSlots", availableSlots);
			
			nextPage = "slots_per_city.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

}


