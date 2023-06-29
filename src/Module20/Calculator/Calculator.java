package Module20.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число. Число должно быть целым.");
        int operand1 = scan.nextInt();

        System.out.println("Введите нужную операцию: + - / *");
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+':
            case '-':
            case '*':
            case '/':
                break;
            default:
                System.out.println("Введена некорректная операция. Процесс выполнения прекращен.");
                System.exit(0);
                break;
        }

        System.out.println("Введите второе число. Число должно быть целым.");
        int operand2 = scan.nextInt();

        int result;
        switch (operation){
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Ошибка ввода операции, результат не определён.");
                break;
        }

    }

}
