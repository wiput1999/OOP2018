package lecture14;


import com.mongodb.*;
import java.net.UnknownHostException;

public class Books {

  public static DB getConnection() throws UnknownHostException {
    Mongo m = new Mongo("10.110.194.233", 27017);
    DB db = m.getDB("mydatabase");

    return db;
  }

  public static void main(String[] args) {
    DB db = null;
    try {
      db = getConnection();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

    BasicDBObject book = new BasicDBObject();
    book.put("isbn", "10.20.7.80");
    book.put("author", "60070090");
    book.put("title", "Wiput Pootong");
    book.put("price", "1000");

    DBCollection collection = db.getCollection("books");

    collection.insert(book);

    for (DBObject i : collection.find()) {
      System.out.println(i.get("isbn") + " : " + i.get("author"));
    }
  }
}
