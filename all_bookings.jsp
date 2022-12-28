<!DOCTYPE html>
<%@page import="models.VaccinationCenter"%>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page import="models.BookedSlot"%>
<%@page import="models.VaccinationCenter"%>
<%@ page import="java.util.ArrayList" %>

<head>
    <%@ include file="head.jsp" %>

    <title>Admin : All Booked Slots</title>
    <link rel="stylesheet" href="static/css/form.css">
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

</head>

<body style="background-color: hsla(20, 50%, 98%, 0.733);">

    <div class="header">
        <div class="container-fluid jumbotron banner" style="height: 200px;">
            <div class="container">

                <%@ include file="header.jsp" %>

            </div>
        </div>
    </div>


	<div id="page-container" class="container mt-2">
        <div class="row justify-content-center">
            <div class="col-12 p-0 m-0">
            
            
            	<form action="search_bookings_by_center.do" method="post" class="mt-3">
                    <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="center_name">
                    
						  	<option selected>Select Vaccination Center</option>
						  	
						  	
		                     <c:forEach var="center" items="${centers}">
							  	<option value="${center.name}">${center.name}</option>
							</c:forEach>
							 
							
							
					</select>
					
                    <input type="submit" class="btn btn-secondary d-inline-block mt-2 self-left" value="Search">
                </form>
                
                
                

                <div class="">
                    <h3 class="text-primary">All Booked Slots</h3>
                </div>
                
                
                
                <table class="table">
                	<thead>
                		<tr>
					      	<th scope="col">Slot Id</th>
					      	<th scope="col">Center Name</th>
					      	<th scope="col">City</th>
					      	<th scope="col">Name</th>
					      	<th scope="col">Contact</th>
					      	<th scope="col">Aadhar Number</th>
				   		</tr>
				   	</thead>
				   	
				   	<tbody>
					   	<c:forEach var="booking" items="${bookings}">
					   		<tr>
					   			<th scope="row">${booking.bookedSlotId}</th>
						   		<td>${booking.slot.vaccinationCenter.name}</td>
						   		<td>${booking.slot.vaccinationCenter.city}</td>
						   		<td>${booking.user.name}</td>
						   		<td>${booking.user.contact}</td>
						   		<td>${booking.user.aadharNumber}</td>
						   	</tr>
					   	</c:forEach>
				   	</tbody>
				   
				</table>
				
                
            </div>
        </div>
    </div>
    

    <%@ include file="footer.jsp" %>

</body>

</html>