/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

class PrintNameThread extends Thread{

    private String name;

    PrintNameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + ": " + i);
        }
    }

}

/**
 *
 * @author wiput
 */
public class TestPrintNameThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName());
        
        PrintNameThread p1 = new PrintNameThread("Hi");
        p1.start();
        p1.setPriority(1);
        PrintNameThread p2 = new PrintNameThread("Hello");
        p2.start();
        p2.setPriority(10);

    }
}
