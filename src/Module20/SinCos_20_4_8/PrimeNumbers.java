package Module20.SinCos_20_4_8;
/*
программа выводит простые числа в промежутке от 2 до 100.
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i ++){
            boolean isExit = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isExit = false;
                    break;
                }
            }

            if(isExit){
                System.out.println(i);
            }
        }
    }
}
