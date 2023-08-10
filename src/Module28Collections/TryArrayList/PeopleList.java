package Module28Collections.TryArrayList;
/*
In this program I try ArrayList class.
 */

import java.util.ArrayList;

public class PeopleList {
    public static void main(String[] args) {

        //creating a list of people
        ArrayList<String> people = new ArrayList<>(0);

        //adding a few people to the list
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");

        //adding an element by the index
        people.add(1, "Bob");
        //Bob added to the second cell, the element that before was the second and all elements next to it were moved 1 cell further

        //checking that Bob has got the cell with index 1 successfully
        System.out.println(people.get(1));

        //changing an element
        people.set(1, "Robert");
        //Bob became Robert, we do not have Bob in the list anymore

        //let us see how many elements we have in the list
        System.out.printf("The ArrayList has %d elements\n", people.size());

        //let us meet every person in the list
        for (String person: people){
            System.out.println(person);
        }

        //checking if the list has a particular element
        if (people.contains("Tom")) System.out.println("ArrayList contains Tom");

        //removing a particular element from the list
        people.remove("Robert");

        //removing an element with a particular index
        people.remove(0);

        //creating usual array of objects from the list
        Object[] peopleArray = people.toArray();
        for (Object person: peopleArray) System.out.println(person);
    }
}
