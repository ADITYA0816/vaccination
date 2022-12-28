package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

public class UserSignUpServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("user_signup.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String contact = request.getParameter("contact");
		String aadharNumber = request.getParameter("aadharNumber");
		
			
		User user = new User(name,email,password,gender,city,state,contact,aadharNumber);
		
		user.signUp();
		response.sendRedirect("user_signin.jsp");
	}
}


