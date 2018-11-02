package lecture4;

class AA {

    void print() {
        System.out.println("A");
    }
}

class BB extends AA {

    void print() {
        System.out.println("B");
    }
}

interface CC {

    void print();
}

interface DD {

    void print();
}

class FF extends AA implements CC, DD {

    public void print() {
        System.out.println("FF");

    }
;

}


public class SampleInterface {

    public static void main(String[] arg) {
        FF b = new FF();
        b.print();
    }
}
