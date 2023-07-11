package Module22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Сгенерировать строку номеров телефонов в формате «+7 (926) 123-4567» с разделителем «; ».
Найти «платиновые» номера телефонов, оканчивающиеся на 6 нулей.
 */
public class TaskAdditional_1 {
    public static void main(String[] args) {

//        String createRegExp = "(8|+7) \([0-9]{3}\) [0-9]{3}-[0-9]{4}";
//        String searchRegExp = "(8|+7) \([0-9]{3}\) [0-9][0]{2}-[0]{4}";

        StringBuilder strBuilder = new StringBuilder();
        //задаем регулярное выражение <начало строки> 3 цифры, 4 цифры <конец строки>
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");
        //собираем в StringBuilder одну строку со всеми вариантами от +7 (926) 100-0000 до +7 (926) 999-9999 с разделителем "; "
        for (int aCount = 1000000; aCount <= 9999999; aCount++) {
            Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if (matcher.find()) {
                strBuilder.append("+7 (926) ").append(matcher.group(1)).append("-").append(matcher.group(2)).append("; ");
            }
        }
        //задаем регулярное выражение "...00-0000..."
        pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");
        Matcher matcher2 = pattern.matcher(strBuilder);
        //ищем в собранном StringBuilder все совпадения со вторым регулярным выражением и выводим их
        while (matcher2.find()) {
            System.out.println("+7 (926) " + matcher2.group(1) + "-" + matcher2.group(2) + "; ");
        }
    }
}
