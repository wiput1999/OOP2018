package lab7;

import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterJob;

public class MenuV2 {

	private JFrame fr;
	private JMenuBar jmb;
	private JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6;
	private JCheckBoxMenuItem jcb1;
	private JMenu jm1, jm2, jm3, jm4, jm5;
	private JFileChooser fc;
	private PrinterJob pj;

	private ActionListener actionListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Exit":
				System.exit(0);
				break;
			case "Open":
				int result = fc.showDialog(null, "Choose file");
				if (result == JFileChooser.APPROVE_OPTION)
					;
				break;
			case "Print":
				pj = PrinterJob.getPrinterJob();
				pj.printDialog();
				break;
			}

		}
	};

	public void init() {
		fr = new JFrame("Menubar");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jmb = new JMenuBar();

		jm1 = new JMenu("File");

		jm5 = new JMenu("New");
		jmi1 = new JMenuItem("Open");
		jmi2 = new JMenuItem("Print");
		jmi3 = new JMenuItem("Exit");
		
//		Add Action Listener
		jmi1.addActionListener(actionListener);
		jmi2.addActionListener(actionListener);
		jmi3.addActionListener(actionListener);

		jm1.add(jm5);
		jm1.add(jmi1);
		jm1.add(new JSeparator());
		jm1.add(jmi2);
		jm1.add(new JSeparator());
		jm1.add(jmi3);

		jm2 = new JMenu("Help");

		jm3 = new JMenu("Software");
		jmi4 = new JMenuItem("Unix");
		jmi5 = new JMenuItem("Linux");
		jmi6 = new JMenuItem("Solaris");

		fc = new JFileChooser();

		jm3.add(jmi4);
		jm3.add(jmi5);
		jm3.add(jmi6);

		jm2.add(jm3);

		jm4 = new JMenu("Hardware");

		jm2.add(jm4);

		jcb1 = new JCheckBoxMenuItem("Check it");

		jm2.add(jcb1);

		jmb.add(jm1);
		jmb.add(jm2);

		fr.setJMenuBar(jmb);

		fr.setSize(300, 250);
		fr.setVisible(true);
	}

	public static void main(String[] args) {

		MenuV2 menu = new MenuV2();
		menu.init();
	}

}
