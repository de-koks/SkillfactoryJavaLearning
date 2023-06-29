package Module20;

public class average {
    public static void main(String[] args) {
        int[] arr = {15, 27, 3, 344, 17};
        int summ = 0;
        int average = 0;
        for (int i: arr) {
            summ += i;
        }
        average = summ / arr.length;
        System.out.println(average);
    }
}
