package lab3;

public class NumberPrinter {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++)
        System.out.printf(" %d", j);
      System.out.println();
    }

  }

}
