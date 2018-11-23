package lab12;

import java.rmi.*;
import java.rmi.registry.*;

public class HelloServer {

  public static void main(String[] args) {
    try {
      LocateRegistry.createRegistry(1099);
      HelloImpl obj = new HelloImpl();
      Naming.rebind("hello", obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}