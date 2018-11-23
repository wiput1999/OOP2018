package lab11;

import java.awt.Font;
import java.time.Duration;
import java.util.Calendar;
import javax.swing.JLabel;

public class MyCountdown extends JLabel implements Runnable {

  private Calendar future;

  public MyCountdown(String text) {
    super(text);
    setFont(new Font("Dosis", Font.BOLD, 48));
    setHorizontalAlignment(CENTER);
  }

  private void setFutureTime(Calendar d) {
    d = Calendar.getInstance();
    d.add(Calendar.HOUR, 2);
    future = d;
  }

  @Override
  public void run() {
    setFutureTime(Calendar.getInstance());
    for (; ; ) {
      Calendar d = Calendar.getInstance();

//      int second = (int) Duration.between(d.toInstant(), future.toInstant()).toSeconds() % 60;
//      int minute = (int) Duration.between(d.toInstant(), future.toInstant()).toMinutes() % 60;
//      int hour = (int) Duration.between(d.toInstant(), future.toInstant()).toHours();
//
//      setText(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String
//          .format("%02d", second));


      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }
}
