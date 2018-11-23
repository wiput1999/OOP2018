package lab12;

import java.util.*;
import java.net.*;

public class ChatServer {

  public static void main(String[] args) {
    ArrayList<Socket> list = new ArrayList();
    try {
      ServerSocket ss = new ServerSocket(5200);
      while (true) {
        Socket s = ss.accept();
        list.add(s);
        ChatHandler ch = new ChatHandler(list, s);
        Thread t = new Thread(ch);
        t.start();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}