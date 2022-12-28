<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="models.VaccinationCenter"%>
<%@page import="models.Slot"%>
<%@page import="models.User"%>
<%@ page import="java.util.ArrayList" %>

<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>User : Slots Available</title>


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

                <div class="">
                    <h3 class="text-primary">All Slots Available</h3>
                </div>

                <div class="col-11 ml-0" id="body_menu">
	               
					<div class="card-group">
	      				<c:forEach var="slot" items="${availableSlots}">
	      					<div class="col-4 mt-2">
	      						<div class="card" style="text-align: center">
		      						<div class="card-body" style="padding:.8rem">
		      							<h3 class="card-title mb-1" style="font-family: sans-serif;">${slot.vaccinationCenter.name}</h5>
		      							<h6 class="font-weight-lighter">${slot.vaccinationCenter.city}</h6>        							
		      							<h6 class="font-weight-lighter">${slot.vaccinationCenter.state}</h6>        							
		      							<h6 class="font-weight-lighter">${slot.vaccinationCenter.contact}</h6>
		      							<h6 class="font-weight-lighter">${slot.date}</h6>
		      							
		      							<div class="btn btn-sm btn-danger float-right">
		      								<a href="confirm_slot.do?slot_id=${slot.slotId}&user_id=${user.userId}" style="color: black;">Book Slot</a>
		      							</div>
		      												
		      						</div>
	      						</div>
	      					</div>
	      				</c:forEach>
	      			</div>
      			</div>
            </div>
        </div>
    </div>


    <%@ include file="footer.jsp" %>


</body>

</html>