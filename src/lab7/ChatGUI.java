package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatGUI implements ActionListener {

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

        // Add action listener
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);

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
        ta.setEditable(false);

        tf.requestFocus();

    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String message = tf.getText();
        String history = ta.getText();

        switch (command) {
            case "Submit":
                history += (message + "\n");
                ta.setText(history);
                tf.setText("");
                break;
            case "Cancel":
                tf.setText("");
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        ChatGUI chat = new ChatGUI();
        chat.init();
    }
}
