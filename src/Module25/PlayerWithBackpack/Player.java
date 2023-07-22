package Module25.PlayerWithBackpack;

public class Player extends Human {
    private Backpack backpack;

    public Backpack getBackpack() {
        return backpack;
    }

    public Player(String name) {
        super(name);
        this.backpack = new Backpack();
    }

    public void take(String taken) {
        if (this.backpack.getContent().equals("")) {
            backpack.addContent(taken);
        } else {
            backpack.addContent("," + taken);
        }
    }

    public class Backpack {
        private String content;

        public Backpack() {
            content = "";
        }

        public String toString() {
            if (content.equals("")) {
                return "the backpack is empty";
            } else return content + " in the backpack";
        }

        public String getContent() {
            return content;
        }

        public void addContent(String content) {
            this.content += content;
        }
    }
}
