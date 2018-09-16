package lab3;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Sphere {

	private JFrame fr;
	private JLabel label;
	private JTextField tf;
	private String input;
	private String result;
	private double radius;

	private class ShpereAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			input = tf.getText();
			radius = Double.parseDouble(input);
			if (radius <= 0) {
				result = "Invalid value plase try again!";
			} else {
				result = String.valueOf((Math.PI * 4 * Math.pow(radius, 3)));
			}
			label.setText(result);
			System.out.println(radius);
		}
	}

	public void init() {
		fr = new JFrame("Sphere");
		tf = new JTextField("");
		label = new JLabel("Hello");

		tf.addActionListener(new ShpereAction());

		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setLayout(new BorderLayout());

		fr.add(label, BorderLayout.NORTH);
		fr.add(tf, BorderLayout.SOUTH);

		fr.setSize(300, 200);
		fr.setResizable(false);
		fr.setVisible(true);

	}

	public static void main(String[] args) {
		Sphere s = new Sphere();
		s.init();
	}

}
