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
    <link rel="stylesheet" href="css/style.css">
      <title>MyGym</title>
  </head>
  <body>
      
    <div class="container-fluid cf">
    <%@include file="common/gymnav.jspf"%>   
  
        
<div class="section-light">
     <div class = "row">
        <div class="col"></div>
        <div class="col-sm-12 col-md-7">
    
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block img-fluid img-c"  src="/img/train1.jpg" alt="First slide">
        <div class="carousel-caption d-none d-md-block">
    <h3>Fitness for Women</h3>
    <p>Check our offer</p>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block img-fluid img-c" src="/img/train2.jpg" alt="Second slide">
        <div class="carousel-caption d-none d-md-block">
    <h3>Organised groups</h3>
    <p>Check planner</p>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block img-fluid img-c" src="/img/train3.jpg" alt="Third slide">
        <div class="carousel-caption d-none d-md-block">
    <h3>Strength training</h3>
    <p>Check our program today</p>
  </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>    

</div>    
   <div class="col"></div>  
</div>
    
    
<div class = "row">
        <div class ="col-sm-12">
            <div class="jumbotron jumbotron-fluid">
                <div class="container">
                    <h1 class="display-3"><b>Join our World</b></h1>
                    <p class="lead">Fitness for Life</p>
                </div>
            </div>
        </div>
</div>
      
</div>
        
 <div class="section-dark">
      <div class = "row myRow">
           <div class="col"></div>  
          <div class ="col-md-4 col-sm-12">
              <div class = "text_cont">
              <h4><b>Check our promo offer!</b></h4>
              <p>Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah
              Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah</p>
              <button type = "button" class = "btn btn-secondary btn-MJ-2">More info</button>
              </div>
              </div>
          <div class ="col-md-4 col-sm-12">
              <img class="img-fluid" src="img/train2-1.jpg">
          
          </div>
       <div class="col"></div>  
     
</div>   
           <div class = "row myRow">
           <div class="col"></div> 
                <div class ="col-md-4 col-sm-12">
              <img class="img-fluid" src="img/train2-2.jpg">
          
          </div>
          <div class ="col-md-4 col-sm-12">
              <div class = "text_cont">
              <h4><b>Train with professional trainers</b></h4>
              <p>Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah
              Wecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blahWecome, blah, blah blah</p>
              <button type = "button" class = "btn btn-secondary btn-MJ-2">More info</button>
              </div>
              </div>
         
       <div class="col"></div>    
     </div>     
</div>  
   
        
 <div class="section-light">
 <div class = "row myRow">  
<h4><b>Latest news</b></h4>         
     </div>
     
     
     
     
    <div class = "row myRow">
         <div class ="col-md-6 col-sm-12">
                         <div class="list-group">
             
              <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
                <div class="d-flex w-100 justify-content-between">
                  <h5 class="mb-1">List group item heading</h5>
                  <small class="text-muted">1 days ago</small>
                </div>
                <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
                <small class="text-muted">Donec id elit non mi porta.</small>
              </a>
              <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
                <div class="d-flex w-100 justify-content-between">
                  <h5 class="mb-1">List group item heading</h5>
                  <small class="text-muted">3 days ago</small>
                </div>
                <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
                <small class="text-muted">Donec id elit non mi porta.</small>
              </a>
                             <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
                <div class="d-flex w-100 justify-content-between">
                  <h5 class="mb-1">List group item heading</h5>
                  <small class="text-muted">11 days ago</small>
                </div>
                <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
                <small class="text-muted">Donec id elit non mi porta.</small>
              </a>
            </div>
             
        </div>
          <div class ="col-md-6 col-sm-12">
              <div class = "row myRow">
                <div class ="col-md-6 col-sm-12">
                                    <div class="card myCard" style="width: 14rem;">
                      <img class="card-img-top" src="img/creditCardM.jpg" alt="Card image cap">
                          <div class="card-body myCardBody">
                              <p class="card-text"><b>One card rules it all!!!</b></p>
                      </div>
                    </div>  
                  </div>
                  <div class ="col-md-6 col-sm-12">
                   <div class="card myCard" style="width: 14rem;">
                      <img class="card-img-top" src="img/bodyFatM.jpg" alt="Card image cap">
                         <div class="card-body myCardBody">
                             <p class="card-text"><b>Track your body fat %.</b></p>
                      </div>
                    </div> 
                  </div>
              </div> 
               <div class = "row myRow">
                <div class ="col-md-6 col-sm-12">
                  <div class="card myCard" style="width: 14rem;">
                      <img class="card-img-top" src="img/mapM.jpg" alt="Card image cap">
                       <div class="card-body myCardBody">
                           <p class="card-text"><b>Great localisation</b></p>
                      </div>
                    </div> 
                  </div>
                  <div class ="col-md-6 col-sm-12">
                   <div class="card myCard" style="width: 14rem;">
                      <img class="card-img-top" src="img/additionalM.jpg" alt="Card image cap">
                      <div class="card-body myCardBody">
                          <p class="card-text"><b>Check our facilities</b></p>
                      </div>
                    </div>
                  </div>
              </div> 
              
        </div>
     </div>  
 
   
     <div class="row modalRow">
        <div class = "col-sm-12">
            <div class="coolStuffWrapper">
                <button type="button" class="btn btn-lg coolStuff-btn" data-toggle="modal" data-target="#coolStuffModal">
               Subscribe to our newsletter
                </button>    
            </div>
        </div>        
    </div>
  </div>  
        
        
        
</div>

<%@include file="common/gymfooter.jspf"%>        

          <!--coolStuffModal-->
          
<div class="modal fade" id="coolStuffModal" tabindex="-1" role="dialog" aria-labelledby="coolStuffLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="contentLabel">Get Exclusive Content</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-12">
                <center><img class= "img-fluid" src="img/modalLogo.jpg" width = "100" height = 80></center>
              </div>
            </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="modal-form-wrapper">
                <form>
                  <div class="form-group">
                    <label for="forName">What's your name?</label>
                    <input type="text" class="form-control" id="formName" placeholder="name">
                  </div>
                  <div class="form-group">
                    <label for="forEmail">Email adress</label>
                    <input type="text" class="form-control" id="formEmail" placeholder="email">
                  </div>
                </form>
                </div>
            
            </div>
            
            </div>
            
          </div>
          
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Send</button>
      </div>
    </div>
  </div>
</div>  
      
      
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>