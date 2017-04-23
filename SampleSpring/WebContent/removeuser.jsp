<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.mongodb.BasicDBObject"%>
	<%@page import="com.mongodb.DB"%>
	<%@page import="com.mongodb.DBCollection"%>
	<%@page import="com.mongodb.DBCursor"%>
	<%@page import="com.mongodb.MongoClient"%>
	<%@page import="com.mongodb.DBObject"%>
	<%@page import="java.net.ConnectException"%>
	<%@page import="java.net.UnknownHostException"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script src="js/jquery.js" type="text/javascript"></script>
<title>Build 'R' Buy - Remove User</title>
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
    <div id="logo"> <a href='index.jsp'><img src="images/logo.jpg"></a> </div>
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
  <div id="topnav" class="wrap">
    <ul id="nav">
      <li class="active"><a href='index.jsp'><span>Home</span></a></li>
      <li class="has-sub"><a href='#'><span>For Sale</span></a></li>
      <li class="has-sub"><a href='#'><span>For Rent</span></a></li>
      <li class="has-sub"><a href='advertise.html'><span>Advertise</span></a></li>
      <li class="active"><a href='contact.html'><span>Contact</span></a></li>
      <li class="has-sub"><a href='about.html'><span>About</span></a></li>
      <li class="has-sub"><a href="#"><span>Options</span></a>
			<ul>
                <li><a href='updateprop.jsp'>Update Property</a></li>
                <li><a href='removeprop.jsp'>Remove Property</a></li>
                <li><a href='removeuser.jsp'>Remove User</a></li>
            	<li><a href='adminInbox.jsp'>Inbox</a></li>
            	<li><a href='signoutadmin.jsp'>Sign Out</a></li>
            </ul>
   	</li>
    </ul>
  </div>
  <div id="content-wrapper">
	      <div id="contact-form">
	      <h1>Remove User</h1>
        <form method="post" action="" name="form1" id="my_contact_form">
          <ol>
          <li>
              <label for="user_id">Copy the User id you wish to delete</label>
              <input type="text" name="userID">
            </li>
              
            <li>
              <input class="submit" type="submit" name="Submit" value="submit">
            </li>
          </ol>
        </form>
      </div>
  </div>
  </div>
   <% MongoClient m1 = new MongoClient("localhost");
	DB db = m1.getDB("test");
	DBCollection coll = db.getCollection("sign_up_class");
	DBCursor valid;
	BasicDBObject dbo = new BasicDBObject();
	//BasicDBObject db = new BasicDBObject();
    //db.put("Address1", "drumowna");
    dbo.put("ObjectId", request.getParameter("userID"));
    DBObject myDoc = coll.findAndRemove(dbo);
    //coll.remove(myDoc);
    System.out.println("Document inserted successfully"); 
    DBCollection collec = db.getCollection("sign_up_class");
	DBCursor validto;
	BasicDBObject dboc = new BasicDBObject();
	DBCursor cursor2 = collec.find();
	int i = 1;
	try{
	
    while (cursor2.hasNext()) { 
       out.println("<br/>Property: "+i); 
       out.println("<br/>"+cursor2.next()); 
    }
	
   }
   finally{
	   m1.close();
   }

	%>
  <div id="footer">
    <p>&copy;Copyright 2017 &bull; All Rights Reserved &bull; BSC Comp Design Company &bull; 1234 Main Street Donegal </p>
  </div>
</div>
</body>
</html>
