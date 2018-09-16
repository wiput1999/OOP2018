package lecture4;

import java.awt.*;
import javax.swing.*;

public class LectureCheckBox {
	private JFrame frame;
	private JCheckBox choice1, choice2, choice3;

	public void createGUI() {
		frame = new JFrame("Checkbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		choice1 = new JCheckBox("Visual Basic");
		choice2 = new JCheckBox("C++", false);
		choice3 = new JCheckBox("Java", true);

		frame.add(choice1);
		frame.add(choice2);
		frame.add(choice3);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		LectureCheckBox obj = new LectureCheckBox();
		obj.createGUI();
	}

}
