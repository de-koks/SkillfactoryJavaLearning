package Module22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Напишите регулярное выражение, которое находит все английские слова в тексте, начинающиеся и заканчивающиеся на букву s. Например, в тексте:
Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.
должно быть найдено только слово strings.
 */
public class Task_22_3_5_RegExp {
    public static void main(String[] args) {

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching," +
                "manipulating and editing a text. It is widely used to define a constraint on strings such as a password. " +
                "Regular Expressions are provided under java.util.regex package.";
        String[] words = text.split(" ");
        String regExp = "(S|s)[a-z]*?s";
        Pattern pattern = Pattern.compile(regExp);

        for (String word: words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                System.out.println("\"" + word + "\"" + " begins and ends with \"S\" letter");
            }
        }
    }
}
