package lab6;

public class ComplexNumber {

  private double re, im;

  public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }

  public void doPlus(double re, double im) {
    this.re += re;
    this.im += im;
  }

  public void doPlus(ComplexNumber a) {
    re += a.getRe();
    im += a.getIm();
  }

  public void doMinus(double re, double im) {
    this.re -= re;
    this.im -= im;
  }

  public void doMinus(ComplexNumber a) {
    re -= a.getRe();
    im -= a.getIm();
  }

  public void doMultiply(double re, double im) {
    this.re -= this.re * re - this.im * im;
    this.im -= this.re * im - this.im * re;
  }

  public void doMultiply(ComplexNumber a) {
    this.re -= this.re * a.re - this.im * a.im;
    this.im -= this.re * a.im - this.im * a.re;
  }

  @Override
  public String toString() {
    String re = Double.toString(this.re);
    String im = Double.toString(this.im);

    return re + " + " + im + "i\n";

  }

  public boolean equals(ComplexNumber a) {
    if (a.getIm() == im && a.getRe() == re)
      return true;
    return false;
  }

  public static void main(String[] args) {
    ComplexNumber a = new ComplexNumber(4, 4);
    ComplexNumber b = new ComplexNumber(43, 4);

    System.out.println(a.equals(b));

    a.doMultiply(b);

    System.out.println(a);

  }

}
