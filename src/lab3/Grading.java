package lab3;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {

        char grade = ' ';

        Scanner input = new Scanner(System.in);

        int score = Integer.parseInt(input.nextLine());

        input.close();

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 0 && score <= 59) {
            grade = 'F';
        } else {
            System.out.print("Invalid!");
        }

        System.out.println(grade);

    }

}
