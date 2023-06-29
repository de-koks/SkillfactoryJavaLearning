package Module20.Calculator2;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число. Число должно быть целым.");
        int operand1 = scan.nextInt();

        System.out.println("Введите нужную операцию: + - / *");
        //инициализируем переменную для операции и логическую переменную для цикла валидации ввода
        char operation = '0';
        boolean isOperationCorrect = false;

        // в цикле запрашиваем ввод операции, проверяем ввод, запрашиваем повторно, пока ввод не будет валидный
        while (isOperationCorrect != true) {
            operation = scan.next().charAt(0);
            switch (operation) {
                case '+':
                case '-':
                case '*':
                case '/':
                    isOperationCorrect = true;
                    break;
                default:
                    System.out.println("Некорректная операция. Введите одну из четырех: + - / *");
                    break;
            }
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
