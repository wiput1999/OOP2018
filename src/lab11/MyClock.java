package lab11;

import java.awt.Font;
import java.util.Calendar;
import javax.swing.JLabel;

public class MyClock extends JLabel implements Runnable {

  public MyClock() {
    super("00:00:00", CENTER);
  }

  @Override
  public void run() {
    for (; ; ) {
      Calendar d = Calendar.getInstance();

      int second = d.get(Calendar.SECOND);
      int minute = d.get(Calendar.MINUTE);
      int hour = d.get(Calendar.HOUR_OF_DAY);

      setText(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String
          .format("%02d", second));
      setFont(new Font("Dosis", Font.BOLD, 48));


      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }
}
