package Module25.StaticNestedClass;

public class Main {

    public static void main(String[] args) {
        // we create new object MotherBoard
        MotherBoard mb = new MotherBoard();
        // we work with an object of a nested class
        System.out.println("Total Ports = " + mb.usb.getTotalPorts());
    }
}
