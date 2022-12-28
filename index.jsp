<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="head.jsp" %>
    
    <title>Vaccination :: Home</title>    
</head>
<body>
    <%@ include file="header.jsp"  %>

    <div class="jumbotron jumbotron-fluid banner">
        
	</div>

    <div class="main-body">
        <div class="container">
            <div class="row">
                <div class="col-6 text-center">
                    <a href="admin_signin.do" class="btn btn-secondary bg-white text-secondary p-5 badges shadow"><i class="fa fa-street-view mr-2"></i>Admin</a>
                </div>
                <div class="col-6 text-center">
                    <a href="user_signin.do" class="btn btn-secondary bg-white text-secondary p-5 badges shadow"><i class="fa fa-user mr-2"></i>User</a>
                </div>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp" %>
</body>
</html>