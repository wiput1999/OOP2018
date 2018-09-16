package lecture4;

import java.awt.*;
import javax.swing.*;

public class LectureTextField {

	private JFrame frame;
	private JLabel nameLabel, commentLabel;
	private JTextField nameTextField;
	private JTextArea commentTextArea;

	public void createGUI() {
		frame = new JFrame("Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		nameLabel = new JLabel("Name : ");
		nameTextField = new JTextField(18);

		commentLabel = new JLabel(" Comment : ");
		commentTextArea = new JTextArea(4, 14);
		JScrollPane commentScrollPane = new JScrollPane(commentTextArea);

		frame.add(nameLabel);
		frame.add(nameTextField);
		frame.add(commentLabel);
		frame.add(commentScrollPane);

		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(300, 150);

	}

	public static void main(String[] args) {
		LectureTextField obj = new LectureTextField();
		obj.createGUI();
	}

}
