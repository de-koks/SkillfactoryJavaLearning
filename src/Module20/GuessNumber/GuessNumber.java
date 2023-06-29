package Module20.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        System.out.println("Эта программа может загадать случайное целое число, а Вы можете попробовать его отгадать");
        System.out.println("Но прежде нужно задать максимальное количество попыток и диапазон, в котором будет загадано число");

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int attemptQuantity = 0;
        int hidNumLowBound = 0;
        int hidNumUpBound= 0;
        boolean isBoundariesCorrect = false;
        int hiddenNumber;

        while (attemptQuantity < 1){
            System.out.println("Введите максимальное количество попыток");
            attemptQuantity = scan.nextInt();
            if (attemptQuantity < 1){
                System.out.println("Количество попыток должно быть больше 0");
            }
        }

        while (!isBoundariesCorrect) {
            System.out.println("Введите целое число - нижнюю границу диапазона загадываемого числа");
            hidNumLowBound = scan.nextInt();

            System.out.println("Введите целое число - верхнюю границу диапазона загадываемого числа");
            hidNumUpBound = scan.nextInt();

            if (hidNumUpBound < hidNumLowBound) {
                System.out.println("Верхняя граница диапазона меньше нижней, введите границы заново");
                scan.next();
            } else {
                isBoundariesCorrect = true;
            }
        }

        hiddenNumber = hidNumLowBound + rand.nextInt(hidNumUpBound - hidNumLowBound + 1);
        System.out.println("Введите целое число, которое загадала программа");
        int attemptNumber;

        while (attemptQuantity > 0){
            attemptNumber = scan.nextInt();
            if (attemptNumber == hiddenNumber){
                System.out.println("Поздравляю! Вы отгадали загаданное число.");
                System.exit(1);
            } else if (attemptNumber > hiddenNumber){
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            System.out.println("У Вас осталось попыток: " + --attemptQuantity);
            if (attemptQuantity > 0){
                System.out.println("Введите другое целое число");
            } else {
                System.out.println("Вы исчерпали все свои попытки. Загаданное число было " + hiddenNumber);
            }
        }
    }
}
