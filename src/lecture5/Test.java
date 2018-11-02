package lecture5;

class A {

    @SuppressWarnings("unused")
    private String name;

    A(String name) {
        this.name = name;
    }
}

public class Test {

    public static void main(String[] args) {
        A obj1 = new A("Test");
        String obj2 = new String("Test");

        System.out.println(obj1);
        System.out.println(obj2);

    }
}
