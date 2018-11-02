package lab5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TellerGUI {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2, err;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;

    public void init() {

        fr = new JFrame("Bank");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        l1 = new JLabel("Balance: ");
        l2 = new JLabel("Amount: ");

        err = new JLabel();

        tf1 = new JTextField("6000");
        tf2 = new JTextField();

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");

        fr.setFont(new Font("Dialog", Font.BOLD, 14));

        p1.setLayout(new GridLayout(2, 2));

        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);

        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);

        p3.setLayout(new BorderLayout());

        p3.add(p1);
        p3.add(p2, BorderLayout.SOUTH);

        fr.add(p3);
        fr.add(err, BorderLayout.SOUTH);

        tf1.setEditable(false);

        tf2.requestFocus();

        fr.pack();
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        TellerGUI teller = new TellerGUI();
        teller.init();
    }

}
