package midterm;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CountryGUI {

  private JFrame frame;
  private JPanel mainPanel;
  private JLabel countryLabel, capitalLabel;
  private JTextField capitalCityTf;
  private JComboBox<String> countryOptions;

  private ItemListener itemListener = new ItemListener() {

    @Override
    public void itemStateChanged(ItemEvent e) {
      CountryUtil c = new CountryUtil();
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == "Thailand") {
          capitalCityTf.setText(c.getCapitalCity((String) e.getItem()));
        } else if (e.getItem() == "Japan") {
          capitalCityTf.setText(c.getCapitalCity((String) e.getItem()));
        } else if (e.getItem() == "China") {
          capitalCityTf.setText(c.getCapitalCity((String) e.getItem()));
        } else {
          capitalCityTf.setText("");
        }
      }

    }

  };

  public void init() {
    frame = new JFrame("Search Engine");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainPanel = new JPanel(new GridLayout(2, 2));

    countryOptions = new JComboBox<String>();
    countryLabel = new JLabel("Country :");
    capitalLabel = new JLabel("Capital :");
    capitalCityTf = new JTextField(20);

    countryOptions.addItemListener(itemListener);

    countryOptions.addItem(new String("<< Choose Country >>"));
    countryOptions.addItem("Thailand");
    countryOptions.addItem("Japan");
    countryOptions.addItem("China");

    mainPanel.add(countryLabel);
    mainPanel.add(countryOptions);

    mainPanel.add(capitalLabel);
    mainPanel.add(capitalCityTf);

    frame.add(mainPanel);

    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    CountryGUI country = new CountryGUI();
    country.init();

  }

}
