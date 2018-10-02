package lab3;

public class Factorial {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    long sum = 0;

    for (int i = 1; i <= n; i++) {
      long tmp = 1;
      for (int j = 1; j <= i; j++) {
        tmp *= j;
      }
      sum += tmp;
    }
    System.out.println(sum);
  }

}
