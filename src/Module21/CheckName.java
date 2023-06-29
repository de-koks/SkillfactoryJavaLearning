package Module21;
import java.util.Scanner;
/*
Программа проверяет и обрабатывает ввод полного имени пользователя. Функционал:
1) вводимая строка должна состоять из 3 слов, разделенных пробелами.
Если слов не 3, то программа выводит сообщение и запрашивает повторный ввод.
2) во введенной строке программа сортирует отдельные слова по длине от самого короткого к самому длинному
3) программа проверяет регистр написания первой буквы в каждом слове. Если регистр нижний, то он исправляется на верхний.
 */

public class CheckName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полное имя пользователя, состоящее из трех слов, разделенных пробелами.");
        boolean isCorrectName = false;
        while (!isCorrectName) {
            //scanner считывает строку из System.in
            String name = scanner.nextLine();
            //метод checkName возвращает true, если ввод состоит из 3 слов
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                //formatName() переводит все первые буквы слов в верхний регистр и сортирует слова по возрастанию длины
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        //trim() убирает лишние пробелы в начале и в конце строки,
        //split() возвращает массив из строк, полученный разделением исходной строки, разделитель - строка-аргумент split()
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }
//        метод checkName можно также реализовать через подсчет пробелов между словами:
//        String copyName = name.trim();
//        int spacesAmount = 0;
//        for (int i = 0; i<copyName.length(); i++){
//            if (copyName.charAt(i) == ' '){
//                spacesAmount++;
//            }
//        }
//        if (spacesAmount == 2){
//            return true;
//        } else {
//            return false;

    private static String formatName(String name) {
        //убираем лишние пробелы в начале и в конце, разделяем на массив строк
        String[] words = name.trim().split(" ");
        //sortByLength() сортирует слова по возрастанию количества букв
        sortByLength(words);
        String result = "";
        //проверяем первую букву каждого слова в массиве на Верхний регистр
        //после проверки добавляем все слова в одну переменную
        for (String str : words) {
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + " ";
            }
        }
        //убираем пробел после последнего слова и возвращаем строку, отсортированную по длине слов, с верхним регистром первых букв
        return result.trim();
    }
    private static void sortByLength(String[] words) {
        //цикл с вложенным циклом сортируют массив строк по возрастанию длины
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }
}

