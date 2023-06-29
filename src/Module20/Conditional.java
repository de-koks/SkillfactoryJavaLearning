package Module20;

public class Conditional {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';
        char ch4 = 'k';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch4) + " " + decode(ch3));
    }

    public static String decode (char ch){

        String result;
        switch (ch){
            case 'h':
                result = "Hello!";
                break;
            case 'i', 'm', 'k':
                result = "I can decode!";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don't know these symbols :(";
        }
        return result;
    }
}
