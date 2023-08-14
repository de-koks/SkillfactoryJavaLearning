package Module28Collections.CardDeck;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Card> set = new HashSet<>();

        // hearts
        set.add(new Card("6", "черви"));
        set.add(new Card("7", "черви"));
        set.add(new Card("8", "черви"));
        set.add(new Card("9", "черви"));
        set.add(new Card("10", "черви"));
        set.add(new Card("валет", "черви"));
        set.add(new Card("дама", "черви"));
        set.add(new Card("король", "черви"));
        set.add(new Card("туз", "черви"));

        // diamonds
        set.add(new Card("6", "бубны"));
        set.add(new Card("7", "бубны"));
        set.add(new Card("8", "бубны"));
        set.add(new Card("9", "бубны"));
        set.add(new Card("10", "бубны"));
        set.add(new Card("валет", "бубны"));
        set.add(new Card("дама", "бубны"));
        set.add(new Card("король", "бубны"));
        set.add(new Card("туз", "бубны"));

        // clubs
        set.add(new Card("6", "крести"));
        set.add(new Card("7", "крести"));
        set.add(new Card("8", "крести"));
        set.add(new Card("9", "крести"));
        set.add(new Card("10", "крести"));
        set.add(new Card("валет", "крести"));
        set.add(new Card("дама", "крести"));
        set.add(new Card("король", "крести"));
        set.add(new Card("туз", "крести"));

        // spades
        set.add(new Card("6", "пики"));
        set.add(new Card("7", "пики"));
        set.add(new Card("8", "пики"));
        set.add(new Card("9", "пики"));
        set.add(new Card("10", "пики"));
        set.add(new Card("валет", "пики"));
        set.add(new Card("дама", "пики"));
        set.add(new Card("король", "пики"));
        set.add(new Card("туз", "пики"));

        // adding a few duplicates into the full deck
        set.add(new Card("валет", "черви"));
        set.add(new Card("валет", "крести"));
        set.add(new Card("7", "бубны"));
        set.add(new Card("туз", "пики"));

        System.out.println(set.size()); // 36
    }
}
