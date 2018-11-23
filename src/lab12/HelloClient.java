package lab12;

import java.rmi.*;

public class HelloClient {

  public static void main(String[] args) {
    try {
      Hello obj = (Hello) Naming.lookup("rmi://127.0.0.1/hello");
      System.out.println(obj.sayHello());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}