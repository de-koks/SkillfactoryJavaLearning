package Module20.Task_20_4_9;

/*
вывести простые числа от 2 до 100
 */
public class From2To100 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            boolean isNumberPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isNumberPrime = false;
                    break;
                }
            }
            if (isNumberPrime) {
                System.out.println(i);
            }
        }
    }
}
