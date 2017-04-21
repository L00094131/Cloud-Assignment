package com.sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Controller
public class LoginController extends HttpServlet{
	@RequestMapping(method = RequestMethod.GET)
	public static void exists(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MongoClient m1 = new MongoClient("localhost");
		DB db = m1.getDB("test");
		DBCollection coll = db.getCollection("sign_up_class");
		DBCursor valid;
		BasicDBObject dbo = new BasicDBObject();

		dbo.put("E-Mail", request.getParameter("e-mail"));
		valid = coll.find(dbo);
		
		dbo.put("password", request.getParameter("password"));
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
	}
}

