<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="models.VaccinationCenter"%>
<%@ page import="java.util.ArrayList" %>

<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>Admin : All Centers</title>

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

                <div class="">
                    <h3 class="text-primary">Add Slots</h3>
                </div>

                <div class="col-11 ml-0" id="body_menu">
	               
					<div class="card-group">
	      				<c:forEach var="center" items="${centers}">
	      					<div class="col-4 mt-2">
	      						<div class="card" style="text-align: center">
		      						<div class="card-body" style="padding:.8rem">
		      							<h3 class="card-title mb-1" style="font-family: sans-serif;">${center.name}</h5>
		      							<h6 class="font-weight-lighter">${center.city}</h6>        							
		      							<h6 class="font-weight-lighter">${center.state}</h6>        							
		      							<h6 class="font-weight-lighter">${center.contact}</h6>
		      							
		      							
		      							<%-- 
		      							<div class="btn btn-sm btn-success float-right noLink">
		      								<a href="add_vaccination_slot.do?vaccination_center_id=${center.vaccinationCenterId}" style="color: black;" class="noLink">Add 10 slots</a>
		      							</div> --%>
		      							
		      							
		      							<form action="add_vaccination_slot.do?vaccination_center_id=${center.vaccinationCenterId}" method="post" class=" mt-3">
						          				
						       				<div class="form-group">
						       					<label for="id_date" class="mb-0 w-50">Enter Valid Date (YYYY-MM-DD)</label>
						       					<input type="text" name="date" id="id_date" class="form-control w-50" style="margin-left: auto; margin-right: auto">
						       				</div>
						          				
						        			<input type="submit" value="Add 10 Slots" class="btn btn-success mt-3">
						                </form>
		      							
		      							
		      							
		      							
		      							
		      							
		      												
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