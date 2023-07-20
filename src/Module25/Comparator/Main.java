package Module25.Comparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Apple", "Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
    }
}
