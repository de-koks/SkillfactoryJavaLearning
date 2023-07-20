package Module25.Zoo;

public class PopcornStall implements Soundable {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a popcorn stall.";
    }

    public void sound() {
        System.out.println("Hey! The best popcorn is here!");
    }
}
