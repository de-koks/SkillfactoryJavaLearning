package Module21;

/*
В классе Main дана строка. Выведите в столбик ее подстроки так, чтобы каждую итерацию пропадали первый и последний ее символы.
Выводите до тех пор, пока не останется 1 или 2 символа. Пример для строки "helloworld":
helloworld
elloworl
llowor
lowo
ow
 */
public class Task10 {
    static String text = "helloworld";

    public static void main(String[] args) {
        while (text.length() > 2) {
            text = text.substring(1, text.length()-1);
            System.out.println(text);
        }
    }
}
