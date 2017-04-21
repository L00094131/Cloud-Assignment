<!doctype html>
<%@ page import="com.sample.controller.Calculator" %>

<html>
	<head>
	<script src="js/jquery.js" type="text/javascript"></script>
	<title>Build 'R' Buy - Home</title>

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,400italic,300italic' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="js/slider.js"></script>
	<script type="text/javascript" src="js/menu.js"></script>
	<script type="text/javascript" src="js/imagegallery.js"></script>
	<link href="css/slider.css" rel="stylesheet" type="text/css" media="screen">
	<link href="css/menustyle.css" rel="stylesheet" type="text/css" media="screen">
	<link href="css/imagegallery.css" rel="stylesheet" type="text/css" media="screen">
	<link href="css/styles.css" rel="stylesheet" type="text/css">
	<script>
        jQuery(document).ready(function ($) {
            
            var jssor_1_SlideshowTransitions = [
              {$Duration:1200,$Opacity:2}
            ];
            
            var jssor_1_options = {
              $AutoPlay: true,
              $SlideshowOptions: {
                $Class: $JssorSlideshowRunner$,
                $Transitions: jssor_1_SlideshowTransitions,
                $TransitionsOrder: 1
              },
              $ArrowNavigatorOptions: {
                $Class: $JssorArrowNavigator$
              },
              $BulletNavigatorOptions: {
                $Class: $JssorBulletNavigator$
              }
            };
            
            var jssor_1_slider = new $JssorSlider$("jssor_1", jssor_1_options);
            

        });
    </script>
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			 *  Simple image gallery. Uses default settings
			 */

			$('.fancybox').fancybox();


		});
	</script>
	</head>

	<body>
    <div id="wrapper">
      <div id="top">
        <div id="logo"><a href='index.jsp'> <img src="images/logo.jpg"></a> </div>
        <div id="social-media">
          <p>For Additional Information<br>
            Please Call 123456789</p>
          <ul>
            <li><a href="http://www.facebook.com"><img src="images/icons/facebook.png"></a></li>
            <li><a href="http://www.twitter.com"><img src="images/icons/twitter.png"></a></li>
            <li><a href="http://www.instagram.com"><img src="images/icons/Instagram-Icon.png"></a></li>
            <li><a href="http://www.youtube.com"><img src="images/icons/youtube.png"></a></li>
          </ul>
        </div>
      </div>
      <div id="topnav">
        <ul>
          <li class="active"><a href='index.jsp'><span>Home</span></a></li>
          <li class="has-sub"><a href='#'><span>For Sale</span></a></li>
          <li class="has-sub"><a href='#'><span>For Rent</span></a></li>
          <li class="has-sub"><a href='advertise.jsp'><span>Advertise</span></a></li>
          <li class="active"><a href='contact.jsp'><span>Contact</span></a></li>
          <li class="has-sub"><a href='about.jsp'><span>About</span></a></li>
          <li class="has-sub"><a href='login.jsp'><span>Login</span></a></li>
        </ul>
      </div>
      <div id="banner">
        <div id="jssor_1" style="position: relative; margin: 0 auto; top: 0px; left: 0px; width: 900px; height: 300px; overflow: hidden; visibility: hidden;">
          <div data-u="slides" style="cursor: default; position: relative; top: 0px; left: 0px; width: 900px; height: 300px; overflow: hidden;">
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner1.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner2.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner3.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner4.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner5.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner6.jpg" /> </div>
            <div data-p="112.50" style="display: none;"> <img data-u="image" src="images/banner/banner7.jpg" /> </div>
          </div>
          <!-- Bullet Navigator -->
          <div data-u="navigator" class="jssorb05" style="bottom:16px;right:16px;" data-autocenter="1"> 
            <!-- bullet navigator item prototype -->
            <div data-u="prototype" style="width:16px;height:16px;"></div>
          </div>
          <!-- Arrow Navigator --> 
          <span data-u="arrowleft" class="jssora12l" style="top:0px;left:0px;width:30px;height:46px;" data-autocenter="2"></span> <span data-u="arrowright" class="jssora12r" style="top:0px;right:0px;width:30px;height:46px;" data-autocenter="2"></span> </div>
      </div>
      <div id="content-wrapper">
        <div id="content">
          <h1>Welcome To Build 'R' Buy</h1>
          
           <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2291.280075589289!2d-7.739189584363736!3d54.95064778034645!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x485f94ccc1511609%3A0x94ae4d838a4b6d17!2sMain+Street!5e0!3m2!1sen!2sie!4v1486675945524" width="400" height="250" frameborder="0" style="border:0" allowfullscreen></iframe>
          
          <div id="contact-form">
          <h2>Try out price calculator</h2>		
		 <form method="post" action="" name=calculator-form>
          <ol>
            <li>
              <label for="address">Address</label>
              <input type="text" name="address">
            </li>
            <li>
              <label for="square_feet">Size (Square feet)</label>
              <input type="text" name="square_feet">
            </li>
            <li>
              <input class="submit" type="submit" name="submit" value="Calculate">
            </li>
          </ol>
        </form>
        
		<%
			if (request.getParameter("submit") != null) {
		%>
		Final Price:
		<%
		String address = request.getParameter("address");
		Calculator.setTownPrice(address);
		%>
		
		
		<%=Calculator.getFinalPrice()%>
	
		<%
			}
		%>
          </div>
        </div>
      </div>
      <div id="footer">
        <p>&copy;Copyright 2017 &bull; All Rights Reserved &bull; BSC Comp Design Company &bull; 1234 Main Street Donegal </p>
      </div>
    </div>
</body>
</html>
