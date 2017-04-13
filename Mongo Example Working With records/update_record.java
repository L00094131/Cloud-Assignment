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

public class update_record {

   public static void main( String args[] ) {
	
      try{   
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
			
        // boolean auth = db.authenticate(myUserName, myPassword);
        // System.out.println("Authentication: "+auth);   
			
         DBCollection coll = db.getCollection("mycol");
         System.out.println("Collection mycol selected successfully");
			
         DBCursor cursor = coll.find();
			
         while (cursor.hasNext()) { 
            DBObject updateDocument = cursor.next();
            updateDocument.put("likes","200");
            coll.update(updateDocument, updateDocument); 
         }
			
         System.out.println("Document updated successfully");
         cursor = coll.find();
			
         int i = 1;
			
         while (cursor.hasNext()) { 
            System.out.println("Updated Document: "+i); 
            System.out.println(cursor.next()); 
            i++;
         }
			
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}
