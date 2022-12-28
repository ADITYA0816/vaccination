<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>Admin : Add Center</title>

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
                    <h3 class="text-primary">Add Vaccination Center</h3>
                </div>

                <form action="add_vaccination_center.do" method="post" class="mt-3">

                    <input type="text" class="form-control" name="name"
                        placeholder="Add Vaccination Center Name" minlength="5" maxlength="20" autocomplete="off">
                    <small class="form-text text-muted pl-1">Characters Allowed: a-z, A-z,
                        0-9 and spaces.</small>
                    
                    <input type="text" class="form-control" name="city" placeholder="City">
                    <small class="form-text text-muted pl-1">Enter valid city.</small>
                    
                    <input type="text" class="form-control" name="state" placeholder="State">
                    <small class="form-text text-muted pl-1">Enter valid state.</small>

                    <input type="text" class="form-control"
                        name="contact" placeholder="Contact" minlength="10" maxlength="10"
                        autocomplete="off">
                    <small class="form-text text-muted pl-1">Characters Allowed: 0-9 and
                        must start with 5-9.</small>
                        
                    <div class="form-check justify-content-center mt-3 mb-2 p-0">
                        <div class="g-recaptcha" data-sitekey="6LdVo98iAAAAANjJxQHFPDQWERtUaMe22DFkun2Q">
                        </div>
                    </div>

                    <input type="submit" class="btn btn-danger self-left mt-2" value="Sign Up">
                </form>
            </div>
        </div>
    </div>


    <%@ include file="footer.jsp" %>


</body>

</html>