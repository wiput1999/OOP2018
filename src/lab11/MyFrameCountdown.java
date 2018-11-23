package lab11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class MyFrameCountdown {

  private JFrame myFrame;
  private JButton startButton;
  private JPanel panel, buttonPanel;
  private Thread t;

  private ActionListener actionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (!t.isAlive()) {
        t.start();
      };
    }
  };

  public void init() {
    MyCountdown clock = new MyCountdown("02:00:00");
    t = new Thread(clock);

    JPanel panel = new JPanel(new GridLayout(2,1));
    JPanel buttonPanel = new JPanel();

    JFrame myFrame = new JFrame("Clock");
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton startButton = new JButton("Start");

    startButton.addActionListener(actionListener);

    panel.add(clock);
    buttonPanel.add(startButton);
    panel.add(buttonPanel);

    myFrame.add(panel);
    myFrame.setSize(300, 200);

    myFrame.setVisible(true);
  }

  public static void main(String[] args) {
    MyFrameCountdown obj = new MyFrameCountdown();
    obj.init();
  }
}
