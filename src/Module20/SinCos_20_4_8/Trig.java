package Module20.SinCos_20_4_8;
import java.util.*;
import java.lang.*;

/*
Проверить на практике утверждение, что на отрезке от 0 до 2PI y=sin(cos(x)) всегда будет больше, чем y=cos(sin(x)).

Входные данные:
Нижнее значение отрезка.
Верхнее значение отрезка.
Шаг дискретизации.
 */

public class Trig {
    public static void main(String[] args) {
        System.out.println("Программа сравнения значений y=sin(cos(x)) и y=cos(sin(x)");
        System.out.println("Введите нижнее значение x:");
        Scanner scanner = new Scanner(System.in);
        double x_down = scanner.nextDouble();
        System.out.println("Введите верхнее значение x:");
        double x_up = scanner.nextDouble();
        System.out.println("Введите шаг дискретизации:");
        double step = scanner.nextDouble();
        double i = x_down;
        do {
            if (Math.sin(Math.cos(i)) < Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) меньше, чем cos(sin(x))");
            } else if (Math.sin(Math.cos(i)) > Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) больше, чем cos(sin(x))");
            } else {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) равен cos(sin(x))");
            }
            i += step;
        }
        while (i <= x_up);
    }
}
