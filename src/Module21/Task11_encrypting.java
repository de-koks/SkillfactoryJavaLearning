package Module21;

/*
Вам предстоит написать энкриптор (шифровщик) и декриптор (дешифровщик) для шифра Цезаря.
Шифр Цезаря работает так: берется каждый символ строки и сдвигается на shift (целое число) вправо.
Так, например, при shift = 5, строка ABC станет FGH, а VWXYZ — ABCDE.
Шифруем мы только английский текст, сохраняя регистр, а знаки препинания и прочие символы, не являющиеся английскими буквами, оставляем на своих местах.
Напишите код, реализующий шифрование и дешифрование с произвольным данным текстом и сдвигом.
 */
public class Task11_encrypting {
    static String text = "Lorem ipsum is";

    static String encrypt(String text, int shift) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        char[] encrypted = new char[text.length()];

        while (shift < 0) {
            shift += upper.length();
        }

        for (int i = 0; i < text.length(); i++) {
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
            } else {
                encrypted[i] = text.charAt(i);
            }
        }
        return new String(encrypted);
    }

    static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
        System.out.println(decrypt(encrypt(text, 5), 5));
    }
}
