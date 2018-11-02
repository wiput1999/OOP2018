package lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class TellerGUI implements ActionListener {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2, l3, l4, err;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2, bn3;
    private CheckingAccount account1, account2, account3, account = account1;
    private JComboBox<String> accountOptions;

    TellerGUI() {
        // Balance
        tf1 = new JTextField();
        // Credit
        tf2 = new JTextField();
        // Input
        tf3 = new JTextField();
    }

    private final ItemListener itemListener = new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (e.getItem() == "Account 1") {
                    account = account1;
                    tf1.setText(String.valueOf(account.getBalance()));
                    tf2.setText(String.valueOf(account.getCredit()));
                } else if (e.getItem() == "Account 2") {
                    account = account2;
                    tf1.setText(String.valueOf(account.getBalance()));
                    tf2.setText(String.valueOf(account.getCredit()));

                } else if (e.getItem() == "Account 3") {
                    account = account3;
                    tf1.setText(String.valueOf(account.getBalance()));
                    tf2.setText(String.valueOf(account.getCredit()));
                }
            }

        }

    };

    public void init() {

        account1 = new CheckingAccount(5000, 500);
        account2 = new CheckingAccount(4000, 400);
        account3 = new CheckingAccount(3000, 300);

        fr = new JFrame("Bank");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        l1 = new JLabel("Balance: ");
        l2 = new JLabel("Credit: ");
        l3 = new JLabel("Amount: ");
        l4 = new JLabel("Account: ");

        err = new JLabel(" ", SwingConstants.CENTER);
        err.setForeground(Color.RED);

        Font boldFont = err.getFont();
        err.setFont(boldFont.deriveFont(boldFont.getStyle() | Font.BOLD));

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);

        fr.setFont(new Font("Dialog", Font.BOLD, 14));

        p1.setLayout(new GridLayout(4, 2));

        accountOptions = new JComboBox<>();

        accountOptions.addItemListener(itemListener);

        accountOptions.addItem("Account 1");
        accountOptions.addItem("Account 2");
        accountOptions.addItem("Account 3");

        p1.add(l4);
        p1.add(accountOptions);
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);

        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);

        p3.setLayout(new BorderLayout());

        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2);
        p3.add(err, BorderLayout.SOUTH);

        fr.add(p3);

        tf1.setEditable(false);
        tf2.setEditable(false);

        tf3.requestFocus();

        fr.pack();
        fr.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        double balance = account.getBalance();
        double amount;

        try {
            amount = Double.parseDouble(tf3.getText());

        } catch (NumberFormatException e) {
            amount = 0;
            if (!command.equals("Exit")) {
                err.setText("Invalid amount!");
                return;
            }
        }

        switch (command) {
            case "Deposit":
                account.deposit(amount);
                tf1.setText(String.valueOf(account.getBalance()));
                tf2.setText(String.valueOf(account.getCredit()));
                err.setText("");
                break;
            case "Withdraw":
                if (!account.withdraw(amount)) {
                    err.setText("Not enough money");
                }
                tf1.setText(String.valueOf(account.getBalance()));
                tf2.setText(String.valueOf(account.getCredit()));
                break;
            case "Exit":
                System.exit(0);
                break;
        }

        tf3.setText("");
    }

    public static void main(String[] args) {
        TellerGUI teller = new TellerGUI();
        teller.init();
    }

}
