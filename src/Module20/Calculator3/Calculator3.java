package Module20.Calculator3;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Эта программа - калькулятор. Она работает только с целыми числами.");
        System.out.println("Калькулятор может сложить +, вычесть -, умножить * и разделить / два целых числа.");

        System.out.println("Введите первое число. Число должно быть целым.");
        //инициализируем переменную для первого числа и переменную для валидации ввода первого числа
        int operand1 = 0;
        boolean isOperand1Correct = false;
        //проверяем, что ввод первого числа корректный, если нет - то повторяем ввод
        while (!isOperand1Correct){
            if (scan.hasNextInt()){
                operand1 = scan.nextInt();
                isOperand1Correct = true;
            } else {
                System.out.println("Введено не целое число, повтор ввода первого числа:");
                scan.next();
            }
        }

        System.out.println("Введите одну из четырех операций: + - / *");
        //инициализируем переменную для операции и логическую переменную для цикла валидации ввода
        char operation = '0';
        boolean isOperationCorrect = false;

        // в цикле запрашиваем ввод операции, проверяем ввод, запрашиваем повторно, пока ввод не будет валидный
        while (!isOperationCorrect) {
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
        //инициализируем переменную для второго числа и переменную для валидации ввода второго числа
        int operand2 = 0;
        boolean isOperand2Correct = false;
        //проверяем, что ввод второго числа корректный, если нет - то повторяем ввод
        while (!isOperand2Correct){
            if (scan.hasNextInt()){
                operand2 = scan.nextInt();
                isOperand2Correct = true;
            } else {
                System.out.println("Введено не целое число, повтор ввода второго числа:");
                scan.next();
            }
        }

        //инициализируем результат и выполняем введенную операцию
        int result;
        switch (operation){
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат: " + operand1 + " " + operation + " " + operand2 + " = " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Результат: " + operand1 + " " + operation + " " + operand2 + " = " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Результат: " + operand1 + " " + operation + " " + operand2 + " = " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println("Результат: " + operand1 + " " + operation + " " + operand2 + " = " + result);
                break;
            default:
                System.out.println("Ошибка ввода операции, результат не определён.");
                /*
                System.exit(0); // завершение без ошибки
                System.exit(1); // завершение c ошибкой 1
                 */
                break;
        }
    }
}
