package Module22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Напишите регулярное выражение, которое находит в тексте все года 21-го столетия. Будем считать, что 2000 год — это нулевой год века.
 */
public class Task_22_3_4_RegExp {
    public static void main(String[] args) {

        String text = "1999 год - это ещё 20й век, а 2000 или, например, 2020 года - это уже вполне себе 21 век. Но 2100 год - уже 22 век.";
        String[] words = text.split(" ");
        String regExp = "20[0-9]{2}";
        Pattern pattern = Pattern.compile(regExp);
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                System.out.println("\"" + word + "\"" + " matches the regular expression " + "\"" + regExp + "\"");
            }
        }
    }
}
