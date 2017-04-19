package test_sign_in;

import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import java.net.ConnectException;

public class Sign_In {
	static String emailin;
	static String password;
	
	public static void main(String [] args) throws ConnectException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your email: ");
		emailin = sc.nextLine();
		System.out.println("Please enter your password: ");
		password = sc.nextLine();
		exists();
		sc.close();
	}
	
	public static void exists(){
		MongoClient m1 = new MongoClient("localhost");
		DB db = m1.getDB("test");
		DBCollection coll = db.getCollection("sign_up_class");
		DBCursor valid;
		BasicDBObject dbo = new BasicDBObject();
		
		dbo.put("Email", emailin);
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
		}
	}
