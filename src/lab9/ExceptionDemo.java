/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author wiput
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        try {
            a = Double.parseDouble(scanner.nextLine());
            b = Double.parseDouble(scanner.nextLine());
            c = Double.parseDouble(scanner.nextLine());
            scanner.close();
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        double x1, x2;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        if (Double.isNaN(x1)) {
            throw new ArithmeticException();
        }

        System.out.println(x1);

        if (Double.isNaN(x2)) {
            throw new ArithmeticException();
        }
        System.out.println(x2);

    }
}
