<%@page import="models.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.User" %>

<% 
	Admin admin = (Admin)session.getAttribute("admin");
   
	User user = (User)session.getAttribute("user");
%>

<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-6 pt-3">
                <div class="row">
                    <div class="col-1">
                        <a href="index.jsp"><i class="fa fa-bank logo"></i></a> 
                    </div>
                    <div class="col-11 pl-5">
                        <h3 class="company-name noLink"><a href="index.jsp" class="noLink">Vaccination</a></h3>
                        <p class="text-muted lead">Lets build completely vaccinated India</p>
                    </div>
                </div>                   
            </div>
		<div class="col-6 mt-30 text-right">
	        <% if(admin == null && user==null){ %>
	            <a href="admin_signin.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold">Admin</a>
	            <a href="user_signin.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold">User</a>
	        <% }if(admin!=null){ %>
	            <a href="admin_dashboard.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold"><i class="fa fa-tachometer"></i> Dashboard</a>
	            <a href="admin_logout.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold"><i class="fa fa-sign-out"></i> Logout</a>
	        <% }if(user!=null){ %>
	        	<a href="user_dashboard.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold"><i class="fa fa-tachometer"></i> Dashboard</a>
	            <a href="user_logout.do" class="btn btn-sm btn-dark text-white mr-1 font-weight-bold"><i class="fa fa-sign-out"></i> Logout</a>
	    	<% } %>
	    </div>
	            	
                
                
            </div>
        </div>
    </div>
</div>