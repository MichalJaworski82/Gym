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
    <%@include file="common/gymnav.jspf"%>




    <div class="section-light">


        <div class = "row">
            <div class ="col-sm-12">
                <div class="jumbotron jumbotron-fluid">
                    <div class="container">

                        <p class="lead">Personal Profile</p>
                        <p class="lead">CLIENT</p>
                    </div>
                </div>
            </div>
        </div>


        <form:form action ="updateKlientProfile" modelAttribute="klient" method ="POST">
        <form:hidden path="email"/>


        <div class="form-row">
            <div class="col-md-8">

                <div class="form-row">
                    <div class="col-md-1"></div>
                    <div class="form-group col-md-4">
                        <label for="inputName">Name</label>
                        <form:input path = "imie" type = "text" class="form-control" id="inputName" required = "required"/>

                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-1"></div>
                    <div class="form-group col-md-4">
                        <label for="inputSurname">Surname</label>
                        <form:input path = "nazwisko" type = "text" class="form-control" id="inputSurname" required = "required"/>

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
                        <label for="inputCC">NumerKartyKredytowej</label>
                        <form:input path = "NumerKartyKredytowej" type = "text" class="form-control" id="inputCC" required = "required"/>
                        <!--  <input type="text" class="form-control" id="inputAdress"> -->
                    </div>
                </div>




            <div class="form-row">
                <div class="col-md-1"></div>
                <div class="col-md-1">
                    <button type="submit" class="btn btn-secondary">Update employee</button>
                </div>
            </div>
            </div>

        </div>


            </form:form>

    </div>
</body>
</div>

<%@include file="common/gymfooter.jspf"%>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>