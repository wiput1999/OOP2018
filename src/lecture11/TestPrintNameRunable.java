/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

class PrintNameRunable implements Runnable {

    private String name;

    PrintNameRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + ": " + i);
            Thread.yield();
        }
    }

}

/**
 *
 * @author wiput
 */
public class TestPrintNameRunable {

    public static void main(String[] args) {

        PrintNameRunable p1 = new PrintNameRunable("Hi");
        Thread t1 = new Thread(p1);

        t1.start();

        PrintNameRunable p2 = new PrintNameRunable("Hello");
        Thread t2 = new Thread(p2);

        t2.start();

    }
}
