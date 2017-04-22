package com.sample.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class sign_up extends HttpServlet{
	@RequestMapping(method = RequestMethod.GET)
	public static void exists(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	try
	{
		MongoClient m1 = new MongoClient("localhost");
		DB db = m1.getDB("test");
		DBCollection coll = db.getCollection("sign_up_class");
		DBCursor valid;
	 
		
        System.out.println("Connect to database successfully");
		
        //boolean auth = db.authenticate(myUserName, myPassword);
        //System.out.println("Authentication: "+auth);         
        System.out.println("Collection mycol selected successfully");
        BasicDBObject doc = new BasicDBObject("title", "MongoDB").
           append("firstName", request.getParameter("firstName")).
           append("lastName", request.getParameter("surname")).
           append("Address", request.getParameter("address")).
           append("phoneNumber", request.getParameter("phoneNumber")).
           append("Email",request.getParameter("Email") ).
           append("password",request.getParameter("password"));
				
        coll.insert(doc);
        System.out.println("Document inserted successfully");
     }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     }
	}

}
