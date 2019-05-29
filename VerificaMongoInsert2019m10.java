/*
 * PAOLONI ACHILLE
 *
 * 
 */

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VerificaMongoInsert2019m10
{
    public static void main(String[] args)
    {
    try 
	{    //Mongo m = new Mongo();
	// or
	Mongo m = new Mongo( "localhost" );
	// or
	//Mongo m=null;
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println("PAOLONI-INIZIO BENCHMARK DB borsestudio2019m4 ENGINE WIREDTIGER-100000 rec- 1 milione");
	   System.out.println(dateFormat.format(date));
		
	DB db = m.getDB( "borsestudio2019m4" );
	//Set<String> colls = db.getCollectionNames();
	DBCollection coll = db.getCollection("calcolograduatoria");
		
	for (int i=0; i < 1000000; i++) {
		
          coll.insert(new BasicDBObject().append("i", i));
		
        }
System.out.println("Numero record totali-->" + coll.getCount());
date = new Date();
System.out.println("PAOLONI-FINE BENCHMARK DB borsestudio2019m4 ENGINE WIREDTIGER");
	   System.out.println(dateFormat.format(date));	 }
	 catch(Exception Achille)
	 {
	 }

}
}
