package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorAction {

	private JFrame fr;
	private JPanel p1, p2, p3;
	private JTextField tf1;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;

//	Status 1 = inputing first, 2 = inputing second
	private int status;
	private String temp = "", command;
	private double result, number;

	private ActionListener actionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b0 || e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3
					|| e.getSource() == b4 || e.getSource() == b5 || e.getSource() == b6 || e.getSource() == b7
					|| e.getSource() == b8 || e.getSource() == b9 || e.getSource() == b15) {
				if (temp.indexOf('.') != -1 && e.getSource() == b15) {
					return;
				}
				temp += e.getActionCommand();
				tf1.setText(temp);

			}
			if (e.getSource() == b10 || e.getSource() == b11 || e.getSource() == b12 || e.getSource() == b13) {
				number = Double.parseDouble(tf1.getText());
				temp = "";
				command = e.getActionCommand();
				status = 2;
				tf1.setText("");
			}
			if (e.getSource() == b14 && status == 2) {
				switch (command) {
				case "+":
					result = number + Double.parseDouble(temp);
					break;
				case "-":
					result = number - Double.parseDouble(temp);
					break;
				case "*":
					result = number * Double.parseDouble(temp);
					break;
				case "/":
					result = number / Double.parseDouble(temp);
					break;
				}
				status = 1;
				tf1.setText(String.valueOf(result));
			}
		}

	};

	public void init() {
		fr = new JFrame("Calculator");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		tf1 = new JTextField("0.0", 20);

		p1.add(tf1);

		p2.setLayout(new GridLayout(4, 4));

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		b10 = new JButton("+");
		b11 = new JButton("-");
		b12 = new JButton("*");
		b13 = new JButton("/");
		b14 = new JButton("=");
		b15 = new JButton(".");

		b0.addActionListener(actionListener);
		b1.addActionListener(actionListener);
		b2.addActionListener(actionListener);
		b3.addActionListener(actionListener);
		b4.addActionListener(actionListener);
		b5.addActionListener(actionListener);
		b6.addActionListener(actionListener);
		b7.addActionListener(actionListener);
		b8.addActionListener(actionListener);
		b9.addActionListener(actionListener);
		b10.addActionListener(actionListener);
		b11.addActionListener(actionListener);
		b12.addActionListener(actionListener);
		b13.addActionListener(actionListener);
		b14.addActionListener(actionListener);
		b15.addActionListener(actionListener);

		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b11);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b12);
		p2.add(b0);
		p2.add(b15);
		p2.add(b14);
		p2.add(b13);

		p3.setLayout(new BorderLayout());

		p3.add(p1);
		p3.add(p2, BorderLayout.SOUTH);

		fr.add(p3);

		tf1.setEditable(false);

		fr.pack();
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		CalculatorAction calculator = new CalculatorAction();
		calculator.init();

	}

}
