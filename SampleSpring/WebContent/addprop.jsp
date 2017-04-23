<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.mongodb.BasicDBObject"%>
	<%@page import="com.mongodb.DB"%>
	<%@page import="com.mongodb.DBCollection"%>
	<%@page import="com.mongodb.DBCursor"%>
	<%@page import="com.mongodb.MongoClient"%>

	<%@page import="java.net.ConnectException"%>
	<%@page import="java.net.UnknownHostException"%>
<!doctype html>

<html>
<head>
<script src="js/jquery.js" type="text/javascript"></script>
<title>Build 'R' Buy - Sign-Up</title>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,400italic,300italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/slider.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript" src="js/imagegallery.js"></script>
<link href="css/slider.css" rel="stylesheet" type="text/css" media="screen">
<link href="css/menustyle.css" rel="stylesheet" type="text/css" media="screen">
<link href="css/imagegallery.css" rel="stylesheet" type="text/css" media="screen">
<link href="css/styles.css" rel="stylesheet" type="text/css">
</head>

<body>
<div id="wrapper">
<div id="top">
  <div id="logo"> <a href='index.html'><img src="images/logo.jpg"></a> </div>
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
    <li class="active"><a href='index.html'><span>Home</span></a></li>
    <li class="has-sub"><a href='#'><span>For Sale</span></a></li>
    <li class="has-sub"><a href='#'><span>For Rent</span></a></li>
    <li class="has-sub"><a href='advertise.html'><span>Advertise</span></a></li>
    <li class="active"><a href='contact.html'><span>Contact</span></a></li>
    <li class="has-sub"><a href='about.html'><span>About</span></a></li>
    <li class="has-sub"><a href='login.html'><span>Login</span></a></li>
  </ul>
</div>
<div id="content-wrapper">
  <div id="advertise-content">
      <h1>Add a Property</h1>
      <p>Please fill in the details about your property below</p>
      <div id="contact-form">
        <form method="post" action="" name="form2" id="my_sign-up_form">
          <ol>
            <li>
              <label for="address">Address Line 1</label>
              <input type="text" name="add1">
            </li>
            <li>
              <label for="address2">Address Line 2</label>
              <input type="text" name="add2">
            </li>
            <li>
              <label for="address3">Address Line 3</label>
              <input type="text" name="add3">
            </li>
            <li>
              <label for="address3">Address Line 4</label>
              <input type="text" name="add4">
            </li>
            <li>
              <label for="postcode">Postcode</label>
              <input type="text" name="postc">
            </li>
            <li>
              <label for="prop-type">property type</label>
              <input type="text" name="prop-type">
            </li>
            <li>
              <label for="description">Description</label>
              <input type="text" name="descrip">
            </li>
            <li>
              <label for="features">Features</label>
              <input type="text" name="feat">
            </li>
             <li>
              <label for="BER">BER Rating</label>
              <input type="text" name="ber">
            </li>
             <li>
              <label for="asking-price">Asking Price</label>
              <input type="text" name="askp">
            </li>
            <li>
              <input class="submit" type="submit" name="Submit" value="submit">
            </li>
          </ol>
        </form>
      </div>
    </div>
  </div>
  <%  
 
    MongoClient m1 = new MongoClient("localhost");
	DB db = m1.getDB("test");
	DBCollection coll = db.getCollection("property_class");
	DBCursor valid;
	BasicDBObject dbo = new BasicDBObject();

	dbo.append("Address1", request.getParameter("add1"));
	dbo.append("Address2", request.getParameter("add2"));
	dbo.append("Town", request.getParameter("add3"));
	dbo.append("County", request.getParameter("add4"));
	dbo.append("postcode", request.getParameter("postc"));
	dbo.append("property_type", request.getParameter("prop-type"));
	dbo.append("Description", request.getParameter("descrip"));
	dbo.append("Features", request.getParameter("feat"));
	dbo.append("BER_Rating", request.getParameter("ber"));
	dbo.append("Asking_Price", request.getParameter("askp"));
	coll.insert(dbo);
	System.out.print("successfull");
	out.print(dbo.get("Address1"));
	%>
	
  <div id="footer">
    <p>&copy;Copyright 2017 &bull; All Rights Reserved &bull; BSC Comp Design Company &bull; 1234 Main Street Donegal </p>
  </div>
</div>
</body>
</html>
