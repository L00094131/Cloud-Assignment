package mongo;

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

public class getting_selecting_collection {

   public static void main( String args[] ) {
	
      try{   
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
			
         //boolean auth = db.authenticate(myUserName, myPassword);
         //System.out.println("Authentication: "+auth);
			
         DBCollection coll = db.createCollection("mycol",null);
         System.out.println("Collection created successfully");
			
         DBCollection collec = db.getCollection("mycol");
         System.out.println("Collection mycol selected successfully");
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}
