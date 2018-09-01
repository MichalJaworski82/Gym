<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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

      
      
      
    <link rel="stylesheet" href="css/style.css">
    <title>MyGym</title>
  </head>
  <body>
      
    <div class="container-fluid cf">
      <%@include file="common/gymnav.jspf"%>   
   
        
 <div class="section-light">   
     <div class = "row trainersRow">
         <div class="col-sm-12 col-md-6">
              <div class = "row trainersRow">
        <div class="col-sm-12 col-md-6">
            <div class= "trainerContainer">
             <img class="img-fluid gym" id = "cage" src="img/PersonalTrainer.jpg">
                <div class="centered" id = "captionCage"><h3>Cage</h3></div>
            </div>
         </div>
             <div class="col-sm-12 col-md-6">
            <div class= "trainerContainer">
             <img class="img-fluid gym" id = "cardio" src="img/PersonalTrainer.jpg">
                <div class="centered" id = "captionCardio"><h3>Cardio</h3></div>
            </div>
         </div>
        </div> 
               <div class = "row trainersRow">
        <div class="col-sm-12 col-md-6">
            <div class= "trainerContainer">
             <img class="img-fluid gym" id = "strength" src="img/PersonalTrainer.jpg">
                <div class="centered" id = "captionStrength"><h3>Strength</h3></div>
            </div>
         </div>
            <div class="col-sm-12 col-md-6">
            <div class= "trainerContainer">
             <img class="img-fluid gym" id = "liveTraining" src="img/PersonalTrainer.jpg">
                <div class="centered"id = "captionLiveTraining" ><h3>Live training</h3></div>
            </div>
         </div>
          <div class = "col"></div>
     </div>      
</div>           
         <div class="col-sm-12 col-md-6">
            <div class="containerZ" id="containerDefault">
             <h4>Try out our gym</h4>
                <br>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
             </div>
             <div class="containerZ" id="containerCage">
             <h4>CAGE</h4>
                      <br>
                  <p>CAGE TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
             </div>
                   <div class="containerZ" id="containerCardio">
             <h4>Cardio</h4>
                      <br>
                  <p>CARDIO TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
             </div>
                   <div class="containerZ" id="containerStrength">
             <h4>Strength Training</h4>
                      <br>
                       <p>Strength training</p> 
                  <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
             </div>
                        <div class="containerZ" id="containerLiveTraining">
             <h4>Live Training</h4>
                      <br>
                  <p>Live Training<p>
                <p> TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
                 <p>TEXT TEXT TEXT TEXT TEXT TEXT</p>
             </div>
             
             
         </div>
        
     </div>         
  
 <div class="section-dark">
      <div class = "row myRow">
           <div class="col"></div>  
          <div class ="col-md-4 col-sm-12">
              <div class = "text_cont">
              <h4><b>Our Trainers are available 24/7</b></h4>
              <p>Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah
              Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah</p>
              <button type = "button" class = "btn btn-secondary btn-MJ-2">More info</button>
              </div>
              </div>
          <div class ="col-md-4 col-sm-12">
              <img class="img-fluid" src="img/personalTrainer2.jpg">
          
          </div>
       <div class="col"></div>  
     
</div>        
     </div>     
<%@include file="common/gymfooter.jspf"%>       
    

      </div>    
      </div>    
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script>
$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
         $("#containerDefault").show();
});

               
$("#cage").mouseover(function(){
   $(this).css("opacity",1);
    $("#containerDefault").hide();
    $("#containerCage").show();
});
        
$("#captionCage").mouseover(function(){
   $("#cage").css("opacity",1);
    $("#containerDefault").hide();
    $("#containerCage").show();
});    
        
        
$("#cage").mouseleave(function(){
    $("#containerCage").hide();
     $("#containerDefault").show();
      $(this).css("opacity",0.5);
});


$("#cardio").mouseover(function(){
      $(this).css("opacity",1);
     $("#containerDefault").hide();
    $("#containerCardio").show();
    
});
        
$("#captionCardio").mouseover(function(){
   $("#cardio").css("opacity",1);
    $("#containerDefault").hide();
    $("#containerCardio").show();
});  
        
        
$("#cardio").mouseleave(function(){
    $("#containerCardio").hide();
     $("#containerDefault").show();
     $(this).css("opacity",0.5);
});        
 
$("#strength").mouseover(function(){
       $(this).css("opacity",1);
     $("#containerDefault").hide();
    $("#containerStrength").show(); 
});
        
$("#captionStrength").mouseover(function(){
   $("#strength").css("opacity",1);
    $("#containerDefault").hide();
    $("#containerStrength").show();
});  
              
$("#strength").mouseleave(function(){
    $("#containerStrength").hide();
     $("#containerDefault").show();
     $(this).css("opacity",0.5);
});        
 
$("#liveTraining").mouseover(function(){
        $(this).css("opacity",1);
     $("#containerDefault").hide();
    $("#containerLiveTraining").show();  
});
        
$("#captionLiveTraining").mouseover(function(){
   $("#liveTraining").css("opacity",1);
    $("#containerDefault").hide();
    $("#containerLiveTraining").show();
});  
             
$("#captionCage").mouseover(function(){
   $("#cage").css("opacity",1);
    $("#containerDefault").hide();
    $("#containerCage").show();
});          
$("#liveTraining").mouseleave(function(){
     $(this).css("opacity",0.5);
    $("#containerLiveTraining").hide();
     $("#containerDefault").show();
});        
      
        
</script>
      
      
    
    </body>
</html>