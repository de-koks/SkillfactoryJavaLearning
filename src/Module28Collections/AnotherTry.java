package Module28Collections;

import java.util.LinkedList;
import java.util.List;

public class AnotherTry {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.addLast(28);
        list.remove(0);
        list.set(0, 33);
        list.addFirst(null);
        List<Integer> anotherList = list;
        System.out.println(anotherList);
    }
}
