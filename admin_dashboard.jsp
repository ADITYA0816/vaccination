<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>Admin : Dashboard</title>
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

    <div class="container">
        <div class="row">
			
           <div class="col-11 mt-5" id="body_menu">
                <div class="row justify-content-around">

                    <div class="col-2 btn btn-dark text-left">
                        <a href="all_food.do" class="">
                            <i class="fa fa-plus-square-o ml-0 pl-0" style="color: rgb(221, 170, 31); font-size: 33px;"></i>
                            <div class="float-right my-1">
                                <span>
                                    <a href="add_vaccination_center.do" style="font-weight: bold;" class="noLink text-white">Add Vaccination Center</a>
                                </span>
                            </div>
                        </a>
                    </div>

                    <div class="col-2 btn btn-dark text-left">
                        <a href="restaurant_recent_orders.do" class="">
                            <i class="fa fa-trash ml-0 pl-0"
                                style="color: rgb(221, 170, 31); font-size: 33px;"></i>
                            <div class="float-right my-1">
                                <span>
                                    <a href="all_vaccination_center.do" class="noLink text-white">Remove Vaccination Center</a>
                                </span>
                            </div>
                        </a>
                    </div>

                    <div class="col-2 btn btn-dark text-left">
                        <div class="">
                            <i class="fa fa-plus ml-0 pl-0" style="color: rgb(221, 170, 31); font-size: 33px;"></i>
                            <div class="float-right my-1">
                                <span>
                                    <a href="add_vaccination_slot.do" class="noLink text-white">Add Slots</a>
                                </span>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-2 btn btn-dark text-left">
                        <div class="">
                            <i class="fa fa-info ml-0 pl-0" style="color: rgb(221, 170, 31); font-size: 33px;"></i>
                            <div class="float-right my-1">
                                <span>
                                    <a href="slot_booking_details.do" class="noLink text-white">Booking Details</a>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp" %>

    <script src="static/js/signin.js"></script>

</body>

</html>