package Module22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Напишите регулярное значение, которое найдет в строке "aba aba a!a abba adca abea" строки "abba", "adca", "abea" по шаблону: буква a, 2 любых символа, буква a.
 */
public class Task_22_3_2_RegExp {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        String[] words = text.split(" ");
        String regExp = "a..a";
        Pattern pattern = Pattern.compile(regExp);
        for (int i = 0; i < words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);
            if (matcher.matches()) {
                System.out.println(words[i] + " matches the regular expression \"" + regExp + "\"");
            }
        }
    }
}
