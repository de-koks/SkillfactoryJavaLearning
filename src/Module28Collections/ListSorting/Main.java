package Module28Collections.ListSorting;
/*
This program sorts a list in the reversal order without using the sort() method
and without creation another one list.
 */
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            int start = list.get(i);
            int end = list.get(j);
            list.set(j, start);
            list.set(i, end);
        }

        System.out.println(list);
    }
}
