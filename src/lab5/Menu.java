package lab5;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Menu {

    private JFrame fr;
    private JMenuBar jmb;
    private JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6, jmi7;
    private JCheckBoxMenuItem jcb1;
    private JMenu jm1, jm2, jm3, jm4;

    public void init() {
        fr = new JFrame("Menubar");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jmb = new JMenuBar();

        jm1 = new JMenu("File");

        jmi1 = new JMenuItem("New");
        jmi2 = new JMenuItem("Open");
        jmi3 = new JMenuItem("Print");
        jmi4 = new JMenuItem("Exit");

        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(new JSeparator());
        jm1.add(jmi3);
        jm1.add(new JSeparator());
        jm1.add(jmi4);

        jm2 = new JMenu("Help");

        jm3 = new JMenu("Software");
        jmi5 = new JMenuItem("Unix");
        jmi6 = new JMenuItem("Linux");
        jmi7 = new JMenuItem("Solaris");

        jm3.add(jmi5);
        jm3.add(jmi6);
        jm3.add(jmi7);

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

        Menu menu = new Menu();
        menu.init();
    }

}
