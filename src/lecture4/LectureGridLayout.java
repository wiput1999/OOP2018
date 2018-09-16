package lecture4;

import java.awt.*;

import javax.swing.*;

public class LectureGridLayout {
	private JFrame frame;
	private JLabel button1, button2, button3;

	public void createGUI() {
		frame = new JFrame("Flow Layout");
		frame.setLayout(new GridLayout(3, 1));

		button1 = new JLabel("B1", JLabel.CENTER);
		button2 = new JLabel("B2", JLabel.CENTER);
		button3 = new JLabel("B3", JLabel.CENTER);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

		frame.setSize(300, 150);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		LectureGridLayout obj = new LectureGridLayout();
		obj.createGUI();
	}

}
