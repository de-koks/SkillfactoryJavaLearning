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

//public class Player extends Human{
//
//    class Backpack{
//        private String staff = "";
//        void put(String thing){
//            staff += thing +",";
//        }
//        public String toString(){
//            if (staff.equals("")) {
//                return "the backpack is empty";
//            }
//            return staff.substring(0, staff.length()-1) + " in the backpack";
//        }
//    }
//
//    Backpack backpack;
//
//    public Player(String name) {
//        super(name + " the Player");
//        backpack = new Backpack();
//    }
//
//    public void take(String thing){
//        backpack.put(thing);
//    }
//}