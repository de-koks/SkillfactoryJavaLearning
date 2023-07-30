package Module26;

public class Mathematics {

    public static double abs(double num) {
        if (num < 0) return -num;
        else return num;
    }

    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    public static void main(String[] args) {

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }
}
