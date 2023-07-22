package Module25.PlayerWithBackpack;

public class Main {
    public static void main(String[] args) {
/*
Extend Human class by Player class with inner Backpack
*/
        Player player = new Player("Tourist");
        Player.Backpack bp = player.getBackpack();
        System.out.println(bp);
        player.take("rope");
        System.out.println(bp);
        player.take("bottle");
        player.take("flower");
        System.out.println(bp);

/*
The code above has to output

the backpack is empty
rope in the backpack
rope,bottle,flower in the backpack
*/
    }
}
