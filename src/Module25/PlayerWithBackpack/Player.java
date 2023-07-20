package Module25.PlayerWithBackpack;

public class Player extends Human {
    private String name;
    public Player(String name) {
        super(name);
    }

    public void take(String content) {
        if (Backpack.backpacksContent == "") {
            Backpack.backpacksContent = content;
        } else {
            Backpack.backpacksContent += "," + content;
        }
    }

    public class Backpack {
        private static String backpacksContent;
        public Backpack() {
            backpacksContent = "";
        }

        public String toString() {
            if (backpacksContent.equals("")) {
                return "the backpack is empty";
            } else {
                return backpacksContent + " in the backpack";
            }
        }
    }
}
