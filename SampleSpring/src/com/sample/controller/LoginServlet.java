package com.sample.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String email = request.getParameter("Email");
		String password = request.getParameter("password");
		
		MongoClient m1 = new MongoClient("localhost");
		DB db = m1.getDB("test");
		DBCollection coll = db.getCollection("sign_up_class");
		DBCursor valid;
		BasicDBObject dbo = new BasicDBObject();
		
		dbo.put("Email", email);
		valid = coll.find(dbo);
		
		dbo.put("password", password);
		valid = coll.find(dbo);
		
		try{
			if(valid.hasNext()){
				System.out.println("Login Successful");
			}
			else
				System.out.println("Login Failed");
			}
		catch(Exception exe){
			System.out.println("Error: " + exe.getStackTrace());
		}
		finally{
				m1.close();
				valid.close();
		}
		
		PrintWriter writer = response.getWriter();
		
		writer.println("Login Successfull");
	}
}
