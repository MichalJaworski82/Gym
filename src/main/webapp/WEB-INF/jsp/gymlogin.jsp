<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
      
      <!-- jQuery-->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
  <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>

      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
	<%@taglib uri = "http://www.springframework.org/tags/form" prefix ="form"%>
      
      
    <link rel="stylesheet" href="css/style.css">
	  <title>MyGym</title>
  </head>
  <body>
      
    <div class="container-fluid cf">
    
 <div class="section-dark">      
    <div class = "row">
        <div class ="col-sm-12">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">
                    <h1 class="display-3"><b>Login Page</b></h1>
                  <!--    <p class="lead">Fitness for Life</p> -->
                </div>
            </div>
        </div>
</div>
    
  	</div>  

 <div class="section-light2">
  
	<div>
		  <div class = "row">
        <div class ="col-sm-12">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			
			<div class="panel panel-info">

				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<!-- Login Form -->
					<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST" class="form-horizontal">

					    <!-- Place for messages: error, alert etc ... -->
					    <div class="form-group">
					        <div class="col-xs-15">
					            <div>
									
									<!--		            
									<div class="alert alert-danger col-xs-offset-1 col-xs-10">
										Invalid username and password.
									</div>
									-->
									
									<!--		            
									<div class="alert alert-success col-xs-offset-1 col-xs-10">
										You have been logged out.
									</div>
								    -->

					            </div>
					        </div>
					    </div>

						<!-- User name -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<input type="text" name="username" placeholder="username" class="form-control">
						</div>

						<!-- Password -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
							
							<input type="password" name="password" placeholder="password" class="form-control" >
						</div>

						<!-- Login/Submit Button -->
						<div style="margin-top: 10px" class="form-group">						
							<div class="col-sm-6 controls">
								<button type="submit" class="btn btn-secondary btn-MJ-2">Login</button>
							</div>
						</div>

					</form:form>

				</div>

			</div>

		</div>
	</div>
	</div>
	</div>
	</div>
	<%@include file="common/gymfooter.jspf"%>
	    
</div>

</body>
</html>