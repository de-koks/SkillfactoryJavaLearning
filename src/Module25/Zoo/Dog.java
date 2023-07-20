package Module25.Zoo;

public class Dog extends Animal implements Soundable {

    @Override
    public String toString() {
        return "I am a dog.";
    }

    public void sound() {
        System.out.println("Woof");
    }
}
