package lecture4;

import java.awt.*;
import javax.swing.*;

public class LectureFlowLayout {
	private JFrame frame;
	private JButton button1, button2, button3;

	public void createGUI() {
		frame = new JFrame("Flow Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		button1 = new JButton("Submit");
		button2 = new JButton("Cancel");
		button3 = new JButton("Exit");

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
	}

	public static void main(String[] args) {
		LectureFlowLayout obj = new LectureFlowLayout();
		obj.createGUI();
	}
}
