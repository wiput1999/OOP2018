package lecture4;

abstract class A {

    abstract void method1();

    void method2() {
        System.out.println("OOOOOOOO");
    }

}

interface C {

    void method3();
}

interface D {
}

class B extends A implements C, D {

    void method1() {
        System.out.println("lel");
    }

    public void method3() {
        System.out.println("M3");
    }
}

public class Sample {

    public static void main(String[] args) {
        B lel = new B();
        lel.method1();
        lel.method2();
        lel.method3();
    }
}
