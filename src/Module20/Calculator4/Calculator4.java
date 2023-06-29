package Module20.Calculator4;

import java.util.Scanner;

public class Calculator4 {

    public static void main(String[] args) {

        System.out.println("This program is a simple calculator. It handles only with integers.");
        System.out.println("The calculator can add +, subtract -, multiply * and divide / two integers.");

        int operand1 = operand1Input();
        char operation = operationInput();
        int operand2 = operand2Input();
        resultCalculation(operand1, operation, operand2);
    }

    private static int operand1Input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer.");
        //initialization of an int variable for the first integer and a boolean variable for the first integer input validation
        int operand1 = 0;
        boolean isOperand1Correct = false;
        //check if the first integer input is correct, if not then repeat the input
        while (!isOperand1Correct) {
            if (scan.hasNextInt()) {
                operand1 = scan.nextInt();
                isOperand1Correct = true;
            } else {
                System.out.println("The input is not integer, repeat the first integer input:");
                scan.next();
            }
        }
        return operand1;
    }

    private static char operationInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter one of the four operations: + - / *");
        //initialization of a char variable for the operation and a boolean variable for the operation input validation
        char operation = '0';
        boolean isOperationCorrect = false;
        //check if the operation input is correct, if not then repeat the input
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
                    System.out.println("Incorrect input of the operation. Enter one of the next: + - / *");
                    break;
            }
        }
        return operation;
    }

    private static int operand2Input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the second integer.");
        //initialization of an int variable for the second integer and a boolean variable for the second integer input validation
        int operand2 = 0;
        boolean isOperand2Correct = false;
        //check if the first integer input is correct, if not then repeat the input
        while (!isOperand2Correct) {
            if (scan.hasNextInt()) {
                operand2 = scan.nextInt();
                isOperand2Correct = true;
            } else {
                System.out.println("The input is not integer, repeat the second integer input:");
                scan.next();
            }
        }
        return operand2;
    }

    private static void resultCalculation(int num1, char func, int num2) {
        int result = 0;

        switch (func) {
            case '+':
                result = num1 + num2;
                System.out.println("Result is: " + num1 + " " + func + " " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result is: " + num1 + " " + func + " " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result is: " + num1 + " " + func + " " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result is: " + num1 + " " + func + " " + num2 + " = " + result);
                break;
            //Adding an exception, however we expect it is unreachable because of the operation input validation.
            default:
                System.out.println("The operation input error, the result is undefined.");
                break;
        }
    }
}