package Module25.Zoo;

public class Cat extends Animal implements Soundable {

    @Override
    public String toString() {
        return "I am a cat.";
    }

    public void sound() {
        System.out.println("Meow");
    }
}
