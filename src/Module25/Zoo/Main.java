package Module25.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.change(new PopcornStall(), 1);
        zoo.print();
        System.out.println(zoo);
        zoo.sound();
    }
}
