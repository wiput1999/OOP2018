package lab3;

public class SolutionFinder {
  public static void main(String args[]) {
    double a = 1, b = -1, c = 1;

    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    double tmp = b * b - 4 * a * c;

    if (tmp < 0) {
      System.out.println("No answer");
    } else {
      System.out.printf("x1 : %.2f\n", x1);
      System.out.printf("x2 : %.2f", x2);
    }

  }
}
