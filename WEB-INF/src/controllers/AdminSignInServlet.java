package controllers;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Admin;

public class AdminSignInServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("admin_signin.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String nextPage = "admin_signin.jsp";
		boolean validation = true;
			
		HttpSession session = request.getSession();
					
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		Pattern pattern = null;
		Matcher matcher = null;
					
		String errors = "<ul>";
		
		//------------------------------------Validation------------------------------------
		pattern = Pattern.compile("^([a-zA-Z][a-zA-Z\\d-_\\.]*)@([a-zA-Z\\d-_]{2,})\\.([a-zA-Z]{2,5})(\\.[a-zA-Z]{2,5})?$");
		matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			validation = false;
			errors += "<li>Enter valid Email.</li>";
		}
		
		pattern = Pattern.compile("^[a-zA-Z\\d_-]{6,20}$");
		matcher = pattern.matcher(password);
		if(!matcher.matches()) {
			validation = false;
			errors += "<li>Enter valid Password.</li>";
		}		
		
					
		if(validation) {
			Admin admin = new Admin(email, password);
			
			if(admin.signin()){	
					session.setAttribute("admin", admin);
					nextPage = "admin_dashboard.do";
			}else {
				errors += "<li>Account with the given details doesn't exist.</li></ul>";
				request.setAttribute("errors", errors);
				request.getRequestDispatcher(nextPage).forward(request, response);
				validation = false;
			}
		}else {
			errors += "</ul>";
			request.setAttribute("errors", errors);
			request.getRequestDispatcher(nextPage).forward(request, response);
		}
	
	
		if(validation) {
			response.sendRedirect(nextPage);
		}
	}

}


