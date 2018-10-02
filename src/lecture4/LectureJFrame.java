package lecture4;

import javax.swing.JFrame;

public class LectureJFrame {

  private JFrame frame;

  public void createGUI() {
    frame = new JFrame("GUI!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 150);
    frame.setVisible(true);

  }

  public static void main(String[] args) {
    LectureJFrame obj = new LectureJFrame();
    obj.createGUI();
  }

}
