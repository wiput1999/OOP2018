package lecture4;

import javax.swing.*;

public class TestGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Frame!!!!!");
		JButton jbtOK = new JButton("Press for Pizza!");

		frame.add(jbtOK);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}
