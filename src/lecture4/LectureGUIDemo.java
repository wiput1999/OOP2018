package lecture4;

import java.awt.*;

public class LectureGUIDemo {
	private Frame frame;

	public void createGUI() {
		frame = new Frame("Frame");
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		LectureGUIDemo obj = new LectureGUIDemo();
		obj.createGUI();
	}
}
