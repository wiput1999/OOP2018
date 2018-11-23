package lab10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Notepad {

    private JFrame fr;
    private JMenuBar jmb;
    private JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6, jm5, jmi7;
    private JCheckBoxMenuItem jcb1;
    private JMenu jm1, jm2, jm3, jm4;
    private JTextArea ta1;
    private JScrollPane jsp1;
    private JFileChooser fc;
    private PrinterJob pj;

    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Exit":
                    System.exit(0);
                    break;
                case "Open":
                    int result = fc.showDialog(null, "Choose file");
                    if (result == JFileChooser.APPROVE_OPTION) {
                        ta1.setText(""); // clear the TextArea before applying the file contents
                        try {
                            Scanner scan = new Scanner(new FileReader(fc.getSelectedFile().getPath()));
                            while (scan.hasNext()) {
                                ta1.append(scan.nextLine() + "\n"); // append the line to the TextArea
                            }
                        } catch (FileNotFoundException ex) { // catch any exceptions, and...
                            System.out.println(ex.getMessage());
                        }

                    }
                    break;
                case "New":
                    ta1.setText("");
                    break;

                case "Save":
                    JFileChooser save = new JFileChooser();
                    int option = save.showSaveDialog(null);
                    if (option == JFileChooser.APPROVE_OPTION) {
                        try {
                            try (BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()))) {
                                out.write(ta1.getText());
                            }
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
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

        jm5 = new JMenuItem("New");
        jmi1 = new JMenuItem("Open");
        jmi2 = new JMenuItem("Print");
        jmi3 = new JMenuItem("Exit");
        jmi7 = new JMenuItem("Save");

        // Add Action Listener
        jm5.addActionListener(actionListener);
        jmi1.addActionListener(actionListener);
        jmi2.addActionListener(actionListener);
        jmi3.addActionListener(actionListener);
        jmi7.addActionListener(actionListener);

        jm1.add(jm5);
        jm1.add(jmi1);
        jm1.add(jmi7);
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

        ta1 = new JTextArea(50, 80);
        jsp1 = new JScrollPane(ta1);

        fr.add(jsp1);

        fr.setJMenuBar(jmb);

        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {

        Notepad menu = new Notepad();
        menu.init();
    }

}
