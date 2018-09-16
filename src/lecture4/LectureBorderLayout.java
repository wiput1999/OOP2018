package lecture4;

import java.awt.*;
import javax.swing.*;

public class LectureBorderLayout {
	private JFrame frame;
	private JButton button1, button2, button3, button4, button5;

	public void createGUI() {
		frame = new JFrame("BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("B1");
		button2 = new JButton("B2");
		button3 = new JButton("B3");
		button4 = new JButton("B4");
		button5 = new JButton("B5");
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.WEST);
		frame.add(button3);
		frame.add(button4, BorderLayout.EAST);
		frame.add(button5, BorderLayout.SOUTH);
		frame.setSize(200, 150);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		LectureBorderLayout obj = new LectureBorderLayout();
		obj.createGUI();
	}

}
