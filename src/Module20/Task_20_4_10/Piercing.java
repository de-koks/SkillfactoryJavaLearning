package Module20.Task_20_4_10;

import java.util.Scanner;

/*
Напишите простую программу для салона пирсинга, где при вводе возраста клиента через переменную выводились бы соответствующие ограничения:
младше 14: прокол ушей в присутствии родителей;
от 14 до 18: прокол ушей, пупка, языка, носа в присутствии родителей;
от 18 лет: без ограничений.
 */
public class Piercing {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в салон пирсинга. Сколько Вам полных лет?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("Вы неправильно ввели возраст");
        } else if (age >= 0 && age < 14) {
            System.out.println("прокол ушей в присутствии родителей");
        } else if (age >= 14 && age < 18) {
            System.out.println("прокол ушей, пупка, языка, носа в присутствии родителей");
        } else {
            System.out.println("без ограничений");
        }
    }
}
