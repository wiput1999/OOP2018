package lab12;


import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject
    implements Hello {

  public HelloImpl() throws RemoteException {
  }

  public String sayHello() throws RemoteException {
    System.out.println("Executed!");
    return "60070090 Wiput Pootong";
  }
}