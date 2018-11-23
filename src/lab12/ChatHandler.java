package lab12;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatHandler implements Runnable {

  private ArrayList<Socket> list;
  private Socket s;

  public ChatHandler(ArrayList<Socket> list, Socket s) {
    this.list = list;
    this.s = s;
  }

  public void run() {
    while (true) {
      try {
        InputStream in = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String msg = br.readLine();
        for (Socket s : list) {
          PrintStream ps = new PrintStream(s.getOutputStream());
          ps.println(msg);
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}