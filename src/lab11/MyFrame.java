package lab11;

import javax.swing.JFrame;

public class MyFrame {

  private JFrame myFrame;

  public static void main(String[] args) {
    MyClock clock = new MyClock();
    Thread t = new Thread(clock);
    t.start();

    JFrame myFrame = new JFrame("Clock");
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myFrame.add(clock);

    myFrame.setVisible(true);
    myFrame.pack();
  }
}
