package lab5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JTextField tf1;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    public void init() {
        fr = new JFrame("Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        tf1 = new JTextField("0.0", 20);

        p1.add(tf1);

        p2.setLayout(new GridLayout(4, 4));

        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("*");
        b13 = new JButton("0");
        b14 = new JButton(".");
        b15 = new JButton("=");
        b16 = new JButton("/");

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);

        p3.setLayout(new BorderLayout());

        p3.add(p1);
        p3.add(p2, BorderLayout.SOUTH);

        fr.add(p3);

        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.init();

    }

}
