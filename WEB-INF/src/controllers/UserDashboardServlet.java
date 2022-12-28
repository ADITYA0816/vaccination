package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

public class UserDashboardServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");
		
		String nextPage = "user_signin.jsp";
		
		if(user != null) {
			nextPage = "user_dashboard.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}
}