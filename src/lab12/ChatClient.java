package lab12;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatClient implements KeyListener {

  private JFrame fr;
  private JTextArea ta;
  private JTextField tf;
  private PrintStream ps;

  public void init() {
    fr = new JFrame("Chat Program");
    ta = new JTextArea(15, 30);
    ta.setEditable(false);

    JScrollPane sp = new JScrollPane(ta);
    tf = new JTextField();
    tf.addKeyListener(this);
    fr.add(ta);
    fr.add(tf, BorderLayout.SOUTH);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.pack();
    fr.setVisible(true);
    tf.requestFocus();
  }

  public void initConnection() {
    try {
      Socket s = new Socket("10.72.9.191", 5200);
      ps = new PrintStream(s.getOutputStream());
      InputStream in = s.getInputStream();
      BufferedReader br = new BufferedReader(new
          InputStreamReader(in));
      while (true) {
        ta.append(br.readLine() + "\n");
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ChatClient obj = new ChatClient();
    obj.init();
    obj.initConnection();
  }

  public void send() {
    try {
      InetAddress inet = InetAddress.getLocalHost();
      ps.println(inet.getHostName() + " --> " + tf.getText());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    tf.setText("");
    tf.requestFocus();
  }

  public void keyPressed(KeyEvent ev) {
    int key = ev.getKeyCode();
    if (key == KeyEvent.VK_ENTER) {
      send();
    }
  }

  public void keyReleased(KeyEvent ev) {
  }

  public void keyTyped(KeyEvent ev) {
  }
}
