package lab10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TellerGUI implements ActionListener {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2, err;
    private JTextField tf1, tf2;
    private JButton bn1, bn2, bn3;
    private Account account;

    public void init() throws IOException {

        File f = new File("Customer.dat");

        if (f.exists()) {
            double balance = CustomerStorage.getBalance();
            account = new Account(balance);
        } else {
            account = new Account(4000);

        }

        fr = new JFrame("Bank");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        l1 = new JLabel("Balance: ");
        l2 = new JLabel("Amount: ");

        err = new JLabel(" ", SwingConstants.CENTER);
        err.setForeground(Color.RED);

        Font boldFont = err.getFont();
        err.setFont(boldFont.deriveFont(boldFont.getStyle() | Font.BOLD));

        // Balance
        tf1 = new JTextField(String.valueOf(account.getBalance()));
        // Input
        tf2 = new JTextField();

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);

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

        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2);
        p3.add(err, BorderLayout.SOUTH);

        fr.add(p3);

        tf1.setEditable(false);

        tf2.requestFocus();

        fr.pack();
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        double balance = account.getBalance();
        double amount;

        if ("Exit".equals(command)) {
            try {
                CustomerStorage.saveBalance(balance);
            } catch (IOException ex) {
                Logger.getLogger(TellerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }

        try {
            amount = Double.parseDouble(tf2.getText());

        } catch (NumberFormatException e) {
            amount = 0;
            err.setText("Invalid amount!");
            return;
        }

        switch (command) {
            case "Deposit":
                account.deposit(amount);
                tf1.setText(String.valueOf(account.getBalance()));
                err.setText("");
                break;
            case "Withdraw":
                if (balance - amount < 0) {
                    err.setText("Not enough money");
                } else {
                    err.setText("");
                    account.withdraw(amount);
                }
                tf1.setText(String.valueOf(account.getBalance()));
                break;
        }

        tf2.setText("");
    }

    public static void main(String[] args) throws IOException {
        TellerGUI teller = new TellerGUI();
        teller.init();
    }

}
