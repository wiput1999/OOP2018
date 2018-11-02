package lecture9;

import java.util.Arrays;

class OOP {

    private char grade;

    OOP(char grade) {
        this.grade = grade;
    }

}

/**
 *
 * @author wiput
 */
public class Test {

    public static void main(String[] args) {
        int num;

        int[] num1;
        num1 = new int[112];

        System.out.println(num1);
        System.out.println(num1[12]);

        OOP[] objs;

        objs = new OOP[3];

        System.out.println(objs[0]);

        objs[0] = new OOP('A');
        objs[1] = new OOP('B');
        objs[2] = new OOP('C');

        System.out.println(objs[0]);

        int[][] num3;

        String[] words = {"Tree", "ant", "Good"};

        Arrays.sort(words);

        for (String i : words) {
            System.out.println(i);
        }

    }
}
