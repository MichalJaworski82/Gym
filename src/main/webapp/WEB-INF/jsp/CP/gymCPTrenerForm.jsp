<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix ="form"%>
<!doctype html>
<html lang="en">
  <head>
  
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->

   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
      <title>MyGym</title>
  </head>
  <body>
      
    <div class="container-fluid cf">
    <%@include file="../common/gymnav.jspf"%>



        
<div class="section-light">

    
<div class = "row">
        <div class ="col-sm-12">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">

                    <p class="lead">Admin only Access - Add new Trainer</p>
                </div>
            </div>
        </div>
</div>


         <form:form action ="zapiszTrenera" modelAttribute="trener" method ="POST">

             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                     <label for="inputName">Name</label>
                     <form:input path = "imie" type = "text" class="form-control" id="inputName" required = "required"/>
                    <!-- <input type="email" class="form-control" id="inputName" >-->
                 </div>
             </div>
             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                     <label for="inputSurname">Surname</label>
                     <form:input path = "nazwisko" type = "text" class="form-control" id="inputSurname" required = "required"/>
                     <!-- <input type="email" class="form-control" id="inputName" >-->
                 </div>
             </div>
             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                     <label for="inputPassword">Password</label>
                     <form:input path="haslo" type="password" class="form-control" id="inputPassword" />
                 </div>
             </div>
             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                 <label for="inputSalary">Salary</label>
                     <form:input path = "pensja" type = "text" class="form-control" id="inputSalary" required = "required"/>
                <!-- <input type="text" class="form-control" id="inputSalary"> -->
             </div>
             </div>
                 <div class="form-row">
                     <div class="col-md-1"></div>
                     <div class="form-group col-md-4">
                 <label for="inputEmail">Email</label><form:input path = "email" type = "text" class="form-control" id="inputEmail" required = "required"/>
                 <!--<input type="text" class="form-control" id="inputEmail"> -->
             </div>
                 </div>

             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                     <label for="inputAdress">Adress</label>
                     <form:input path = "AdresZamieszkania" type = "text" class="form-control" id="inputAdress" required = "required"/>
                     <!--  <input type="text" class="form-control" id="inputAdress"> -->
                 </div>
             </div>

             <div class="form-row">
                 <div class="col-md-1"></div>
                 <div class="form-group col-md-4">
                     <label for="inputBankAcc">Bank Account Number</label>
                     <form:input path = "NumerKontaBankowego" type = "text" class="form-control" id="inputBankAcc" required = "required"/>
                     <!--  <input type="text" class="form-control" id="inputBankAcc"> -->
                 </div>
             </div>



             <div class="form-row">
                 <div class="col-md-1"></div>
             <button type="submit" class="btn btn-secondary">Add employee</button>
             </div>
         </form:form>


</div>

</div>
  </body>
</div>

<%@include file="../common/gymfooter.jspf"%>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>