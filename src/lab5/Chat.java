package lab5;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat {

  private JFrame fr;
  private JPanel p1, p2;
  private JTextArea ta;
  private JTextField tf;
  private JButton bn1, bn2, bn3;

  public void init() {
    fr = new JFrame("Chat Program");
    p1 = new JPanel();
    p2 = new JPanel();
    ta = new JTextArea();
    tf = new JTextField();
    bn1 = new JButton("Submit");
    bn2 = new JButton("Cancel");
    bn3 = new JButton("Exit");

    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    p1.setLayout(new BorderLayout());
    p1.add(ta);
    p1.add(tf, BorderLayout.SOUTH);

    tf.setBackground(Color.green);

    p2.add(bn1);
    p2.add(bn2);
    p2.add(bn3);

    fr.add(p1, BorderLayout.CENTER);
    fr.add(p2, BorderLayout.SOUTH);
    fr.pack();
    fr.setVisible(true);

    tf.requestFocus();

  }

}
