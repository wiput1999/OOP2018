package lab2;

import java.util.Scanner;
import java.lang.Math;

public class CircleArea {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double radius = input.nextDouble();

		double result = Math.PI * Math.pow(radius, 2);

		input.close();

		System.out.printf("Result : %.2f", result);

	}

}
