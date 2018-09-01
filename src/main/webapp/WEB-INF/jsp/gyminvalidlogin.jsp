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
                    <h1 class="display-3"><b>Invalid login credentials</b></h1>
                  <!--    <p class="lead">Fitness for Life</p> -->
                </div>
            </div>
        </div>
</div>
    
  	</div>  

 <div class="section-light2">
  
	<div>
		  <div class = "row">
			  <div class ="col-sm-4"></div>
			  <div class ="col-sm-4"> <a href="/gymlogin"><h2 class="mj">Back to Login Page</h2></a></div>
			  <div class ="col-sm-4"></div>
	</div>
	</div>
	</div>
	<%@include file="common/gymfooter.jspf"%>
	    
</div>

</body>
</html>