package mongo;
import java.util.Scanner;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class insert_record {

   public static void main( String args[] ) {
	 
	 Scanner KeyIn = new Scanner(System.in);
      try{   
 		 System.out.println("Enter description: ");
 		 String descrip = KeyIn.nextLine();
 		 System.out.println("Enter likes: ");
 		 int like = KeyIn.nextInt();
 		 KeyIn.nextLine();
 		 System.out.println("Enter url: ");
 		 String urlin = KeyIn.nextLine();
 		 System.out.println("Enter owner of site: ");
 		 String siteowner = KeyIn.nextLine();
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
			
         //boolean auth = db.authenticate(myUserName, myPassword);
         //System.out.println("Authentication: "+auth);         
         DBCollection coll = db.getCollection("mycol");
         System.out.println("Collection mycol selected successfully");
         BasicDBObject doc = new BasicDBObject("title", "MongoDB").
            append("description", descrip).
            append("likes", like).
            append("url", urlin).
            append("by", siteowner);
				
         coll.insert(doc);
         System.out.println("Document inserted successfully");
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}
