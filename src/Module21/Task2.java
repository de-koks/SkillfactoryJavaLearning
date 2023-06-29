package Module21;

import java.util.Scanner;

/*
Напишите программу, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов.
В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.
В случае, если пароль введен верно, программа должна выводить имя пользователя и его пароль.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a login.");
        String login = scan.next();
        System.out.println("Enter a password. The password should contain from 8 to 15 characters.");
        String password = scan.next();
        boolean isPasswordCorrect = false;
        while (!isPasswordCorrect) {
            if (password.length() < 8) {
                System.out.println("It's too short. The password should contain from 8 to 15 characters.");
                password = scan.next();
            } else if (password.length() > 15) {
                System.out.println("It's too long. The password should contain from 8 to 15 characters.");
                password = scan.next();
            } else {
                isPasswordCorrect = true;
                System.out.println("Login: " + login);
                System.out.println("Password: " + password);
            }
        }
    }
}
