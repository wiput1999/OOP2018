package midterm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchEngineGUI {

  private JFrame frame;
  private JPanel mainPanel, searchBar, radioBar;
  private JLabel label;
  private JTextField searchField;
  private JTextArea textArea;
  private JButton searchButton;
  private JRadioButton yahoo, google;
  private JScrollPane scroll;
  private ButtonGroup buttonGroup;

  public void init() {
    frame = new JFrame("Search Engine");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainPanel = new JPanel(new BorderLayout());

    searchBar = new JPanel();

    label = new JLabel("Search");
    searchField = new JTextField(20);
    searchButton = new JButton("GO!");

    searchBar.add(label);
    searchBar.add(searchField);
    searchBar.add(searchButton);

    mainPanel.add(searchBar, BorderLayout.NORTH);

    radioBar = new JPanel(new FlowLayout());

    buttonGroup = new ButtonGroup();

    yahoo = new JRadioButton("Yahoo");
    google = new JRadioButton("Google", true);

    buttonGroup.add(google);
    buttonGroup.add(yahoo);

    radioBar.add(yahoo);
    radioBar.add(google);

    textArea = new JTextArea(20, 10);
    scroll = new JScrollPane(textArea);

    mainPanel.add(scroll, BorderLayout.SOUTH);
    mainPanel.add(radioBar);
    frame.add(mainPanel);

    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SearchEngineGUI search = new SearchEngineGUI();
    search.init();

  }

}
