<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="head.jsp" %>

    <title>User : SignUp</title>

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
                    <h3 class="text-primary">Sign Up</h3>
                    <h6 style="font-size: 12px;">or <a href="user_signin.do" class="sublink">Sign In to your account</a>
                    </h6>
                </div>

                <form action="user_signup.do" method="post" class="mt-3">

                    <input type="text" class="form-control" name="name"
                        placeholder="User Name" minlength="5" maxlength="20" autocomplete="off">
                    <small class="form-text text-muted pl-1">Characters Allowed: a-z, A-z,
                        0-9 and spaces.</small>

                    <input type="email" class="form-control" name="email" placeholder="Email" minlength="10" maxlength="50" autocomplete="off">
                    <small class="form-text text-muted pl-1">Enter valid email.</small>
                    
                    <input type="password" class="form-control d-inline-block"
                        style="width: 95%" name="password" placeholder="Password"><i id="view_password"
                        class="fa fa-eye float-right mt-3 pl-0" aria-hidden="true"></i>
                    <small id="password_help" class="form-text text-muted pl-1">Characters Allowed: a-z,
                        A-z, 0-9, - and _.</small>
                        
                    <input type="text" class="form-control" name="gender" placeholder="Gender">
                    <small class="form-text text-muted pl-1">Male or female</small>
                    
                    <input type="text" class="form-control" name="city" placeholder="City">
                    <small class="form-text text-muted pl-1">Enter valid city.</small>
                    
                    <input type="text" class="form-control" name="state" placeholder="State">
                    <small class="form-text text-muted pl-1">Enter valid state.</small>

                    <input type="text" id="id_contact"class="form-control"
                        name="contact" placeholder="Contact" minlength="10" maxlength="10"
                        autocomplete="off">
                    <small id="contact_help" class="form-text text-muted pl-1">Characters Allowed: 0-9 and
                        must start with 5-9.</small>
                        
					<input type="text" class="form-control" name="aadharNumber" placeholder="Aadhar Number">
                    <small class="form-text text-muted pl-1">Enter valid Aadhar Number.</small>

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