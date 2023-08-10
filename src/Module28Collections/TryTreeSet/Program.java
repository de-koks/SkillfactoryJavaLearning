package Module28Collections.TryTreeSet;

import java.util.*;

public class Program{

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // adding to the list several elements
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        System.out.println(states.first()); // getting the first - the smallest element
        System.out.println(states.last()); // getting the last - the biggest element
        // getting a range of elements from one to another
        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println(set);
        // getting the element that is the next to the current element
        String greater = states.higher("Germany");
        // getting the element that is the previus to the current element
        String lower = states.lower("Germany");
        // getting the list in the reversal order
        NavigableSet<String> navSet = states.descendingSet();
        // getting the set where all elements sre smaller than the current element
        SortedSet<String> setLower=states.headSet("Germany");
        // getting the set where all elements are bigger than the current element
        SortedSet<String> setGreater=states.tailSet("Germany");
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }
}
