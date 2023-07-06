package Module20;
/*
Печать на экране прямоугольника n на m из символов s.
целое число height — высота прямоугольника,
целое число width — ширина прямоугольника,
строка symbol — символ, которым мы хотим нарисовать треугольник.
 */

import java.util.Scanner;

public class RectanglePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a height of the rectangle");
        byte height = scan.nextByte();

        System.out.println("Input a width of the rectangle");
        byte width = scan.nextByte();

        System.out.println("Input a character that will be used to print the rectangle");
        String symbol = scan.next();

        for (byte i = 1; i <= height; i++) {
            for (byte j = 1; j <= width; j++) {
                if (i == 1 || i == height) {
                    System.out.print(symbol);
                } else {
                    if (j == 1 || j == width) {
                        System.out.print(symbol);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
