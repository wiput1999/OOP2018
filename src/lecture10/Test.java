package lecture10;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set objs = new HashSet();
        objs.add(2.5);
        objs.add(2);
        objs.add("Hi");
        objs.add('A');
        
        for(Object item: objs) {
            int value = (Integer) item;
        }

    }
}
