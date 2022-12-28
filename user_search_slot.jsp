<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>User : Search Slot</title>
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
            <div class="col-6 p-0 m-0">

                <div class="">
                    <h3 class="text-primary">Search Slot</h3>
                    </h6>
                </div>


                <form action="search_slot.do" method="post" class="mt-3">
                    <input type="text" class="form-control" name="cityName" placeholder="Enter Name of City">

                    <input type="submit" class="btn btn-secondary d-inline-block mt-2 self-left" value="Search">
                </form>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp" %>

</body>

</html>