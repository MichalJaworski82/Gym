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
                        <p class="lead">TRAINER</p>
                    </div>
                </div>
            </div>
        </div>


        <form:form action ="updateTrenerProfile" modelAttribute="trener" method ="POST">
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
                        <label for="inputSalary">Salary</label>
                        <form:input path = "pensja" type = "text" class="form-control" id="inputSalary" required = "required"/>

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
            </div>




            <div class="col-md-3">
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Add specialisation
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                        <c:forEach var="spec" items="${specList}">
                            <c:url var ="dodajSpecLink" value ="/dodajSpecDoTreneraMyProfile">
                                <c:param name="trenerEmail" value = "${trener.email}" />
                                <c:param name="specNazwa" value = "${spec.nazwa}" />
                            </c:url>

                            <li role="presentation"><a role="menuitem" tabindex="-1" href = "${dodajSpecLink}">${spec.nazwa}</a></li>
                        </c:forEach>
                    </ul>
                </div>

                <H4>Specialisations</H4>

                <ul class="list-group">
                    <c:forEach var="specjalizacja" items="${trener.listaSpecjalizacji}">
                        <c:url var ="usunSpecLink" value ="/usunSpecZTreneraMyProfile">
                            <c:param name="trenerEmail" value = "${trener.email}" />
                            <c:param name="specNazwa" value = "${specjalizacja.nazwa}" />
                        </c:url>

                        <div class="row">
                            <div class="col-md-8">
                                <li class="list-group-item">${specjalizacja.nazwa}</li>
                            </div>
                            <div class="col-md-4">
                                <a href = "${usunSpecLink}" class="btn btn-danger">Remove</a>
                            </div>
                        </div>
                    </c:forEach>
                </ul>
            </div>



            <!--
        <c:forEach items="${employee.specialisationList}" varStatus="s">
            <form:input path="specialisationList[${s.index}].name" class="form-control" />
        </c:forEach>
-->


            <div class="form-row">
                <div class="col-md-6"></div>
                <div class="col-md-1">
                    <button type="submit" class="btn btn-secondary">Update employee</button>
                </div>
            </div>





            </form:form>




        </div>

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