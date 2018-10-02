package lab2;

public class SolutionFinder {
  public static void main(String args[]) {
    double a = 4, b = 8, c = 3;

    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    System.out.printf("x1 : %.2f\n", x1);
    System.out.printf("x2 : %.2f", x2);
  }
}
