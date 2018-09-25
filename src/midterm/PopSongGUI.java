package midterm;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PopSongGUI {

	private JFrame frame;
	private JPanel mainPanel, contentPanel, buttonPanel;
	private JButton nextButton, previousButton;
	private JLabel titleLabel, artistLabel;
	private JTextField titleTf, artistTf;

	private ActionListener actionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Song p1 = new PopSong("Heal the World", "Michael Jackson");
			Song p2 = new PopSong("Torn", "Natalie Imbruglia");

			if (e.getSource() == nextButton) {
				titleTf.setText(p2.getTitle());
				artistTf.setText(p2.getArtist());
				nextButton.setEnabled(false);
				previousButton.setEnabled(true);
			}

			if (e.getSource() == previousButton) {
				titleTf.setText(p1.getTitle());
				artistTf.setText(p1.getArtist());
				nextButton.setEnabled(true);
				previousButton.setEnabled(false);
			}

		}

	};

	public void init() {
		frame = new JFrame("Select Song");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new JPanel(new BorderLayout());

		contentPanel = new JPanel(new GridLayout(2, 2));

		titleLabel = new JLabel("Title:");
		titleTf = new JTextField(20);
		artistLabel = new JLabel("Artist:");
		artistTf = new JTextField(20);

		titleTf.setEditable(false);
		artistTf.setEditable(false);

		contentPanel.add(titleLabel);
		contentPanel.add(titleTf);
		contentPanel.add(artistLabel);
		contentPanel.add(artistTf);

		Song p1 = new PopSong("Heal the World", "Michael Jackson");

		titleTf.setText(p1.getTitle());
		artistTf.setText(p1.getArtist());

		buttonPanel = new JPanel();

		nextButton = new JButton("Next");
		previousButton = new JButton("Previous");

		nextButton.addActionListener(actionListener);
		previousButton.addActionListener(actionListener);

		previousButton.setEnabled(false);

		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);

		mainPanel.add(contentPanel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);

		frame.add(mainPanel);

		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		PopSongGUI popsong = new PopSongGUI();
		popsong.init();

	}

}
