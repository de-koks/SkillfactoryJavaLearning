package Module20.Task_20_4_13;

/*
Из ведра объемом 30 литров нужно перелить воду в пустое ведро. Каждый десятый литр проливается мимо.
Вывести процесс перелива в консоль — в первом ведре количество уменьшается, во втором увеличивается.
 */
public class Buckets {
    public static void main(String[] args) {
        int a = 30;
        int b = 0;
        while (a > 0) {
            a--;
            if (a % 10 != 0) {
                b++;
            }
            System.out.println(a + " - " + b);
        }
    }
}
