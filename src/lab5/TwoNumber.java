package lab5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class TwoNumber {

	private JFrame fr;
	private JPanel p1, p2, p3;
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2, tf3;
	private JButton bn1, bn2, bn3, bn4;

	public void init() {

		fr = new JFrame("Simple Calculator");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		l1 = new JLabel("Number 1");
		l2 = new JLabel("Number 2");
		l3 = new JLabel("Result");

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();

		bn1 = new JButton("Add");
		bn2 = new JButton("Subtract");
		bn3 = new JButton("Multiply");
		bn4 = new JButton("Divide");

		p1.setLayout(new GridLayout(1, 6));

		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);

		p2.add(bn1);
		p2.add(bn2);
		p2.add(bn3);
		p2.add(bn4);

		p3.setLayout(new BorderLayout());

		p3.add(p1);
		p3.add(p2, BorderLayout.SOUTH);

		tf3.setEditable(false);
		
		fr.add(p3);

		fr.pack();
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		TwoNumber two = new TwoNumber();
		two.init();

	}

}
