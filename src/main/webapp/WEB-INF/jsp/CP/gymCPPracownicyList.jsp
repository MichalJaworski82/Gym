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
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark navMJ sticky-top">
            <a class="flex-sm-fill text-sm-center nav-link active" href="/gymCPMain">Main</a>
            <a class="flex-sm-fill text-sm-center nav-link" href="/gymCPPracownicyList">Employee List</a>
            <a class="flex-sm-fill text-sm-center nav-link" href="/gymCPKlienciList">Clients List</a>
            <a class="flex-sm-fill text-sm-center nav-link" href="/gymCPTrenerzyList">Trainers List</a>
        </nav>

    </div>

    
<div class = "row">
        <div class ="col-sm-12">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">
                    <p class="lead">Admin only Access - List of Employees</p>
                </div>
            </div>
        </div>
</div>

    <div id = "wrapper">

            <input type="button" class="btn btn-secondary" value="Add Employee"
                   onclick="window.location.href='pokazDodajPracownikaForm';return false;">
            <hr>

        <table class="table table-bordered">
           <tr>
           <th>Name</th>
           <th>Surname</th>
           <th>Salary</th>
           <th>email</th>
           <th></th>
           <th></th>

           </tr>

               <c:forEach var="tempPracownik" items="${myPracownicy}">
                   <c:url var ="updateLink" value ="/pokazPracownikFormUpdate">
                       <c:param name="pracownikEmail" value = "${tempPracownik.email}" />
                   </c:url>

                   <c:url var ="deleteLink" value ="/usunPracownika">
                       <c:param name="pracownikEmail" value = "${tempPracownik.email}" />
                   </c:url>

                   <tr>
                       <td>${tempPracownik.imie}</td>
                       <td>${tempPracownik.nazwisko}</td>
                       <td>${tempPracownik.pensja}</td>
                       <td>${tempPracownik.email}</td>
                       <td><a href = "${updateLink}" class="btn btn-secondary">Update</a></td>
                       <td><a href = "${deleteLink}" class="btn btn-danger"
                       onclick="if(!(confirm('Are you sure you want to delete this Employee?'))) return false">Delete</a></td>
                     </tr>
               </c:forEach>




       </table>

    </div>
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