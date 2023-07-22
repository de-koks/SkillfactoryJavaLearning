package Module25.InnerClassTVset;

public class Main {

    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote remote = tv.getRemote();
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}
