<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>User : Dashboard</title>
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
                                    <a href="search_slot.do" style="font-weight: bold;" class="noLink text-white">Book a Slot</a>
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
                                    <a href="#" style="font-weight: bold;"  class="noLink text-white">Delete Slot</a>
                                </span>
                            </div>
                        </a>
                    </div>

                    <div class="col-3 btn btn-dark text-left">
                        <div class="">
                            <i class="fa fa-plus ml-0 pl-0" style="color: rgb(221, 170, 31); font-size: 33px;"></i>
                            <div class="float-right my-1">
                                <span>
                                    <a href="#" style="font-weight: bold;"  class="noLink text-white">View booked slot</a>
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