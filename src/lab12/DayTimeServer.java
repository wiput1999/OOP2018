package lab12;

import java.io.*;
import java.net.*;

public class DayTimeServer {

  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(5050);
      for (;;) {
        System.out.println("Waiting for client..");
        Socket s = ss.accept();
        OutputStream out = s.getOutputStream();
        DataOutputStream dout = new DataOutputStream(out);
//        dout.writeUTF(new java.util.Date() + "");
        dout.writeUTF("60070090 Wiput Pootong");
        dout.close();
        s.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}