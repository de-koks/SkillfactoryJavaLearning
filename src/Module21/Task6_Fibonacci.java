package Module21;
/*
В классе объявлен массив numbers. Заполните его весь (30 ячеек) числами Фибоначчи.
Числа Фибоначчи определяются так: первые два числа равны единице, а каждое последующее — сумме двух предыдущих.
Начало последовательности выглядит так: 1, 1, 2, 3, 5, 8, 13, 21, …
 */
import java.util.Arrays;

public class Task6_Fibonacci {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        numbers[0] = 1;
        numbers[1] = 1;
        int numbersLength = numbers.length;
        for (byte i = 2; i < numbersLength; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
