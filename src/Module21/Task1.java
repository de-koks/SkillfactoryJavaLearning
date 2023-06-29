package Module21;
import java.util.Arrays;
/*
Создайте массив и инициализируйте его следующими значениями: 5, 24, 3, 66, 38, 16, 27. Проведите сортировку массива и выведите третий элемент массива.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] nums1 = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(nums1);
//        for (int i = 0; i < nums1.length - 1; i++) {
//            for (int j = 0; j < nums1.length - 1; j++) {
//                if (nums1[j] > nums1[j + 1]) {
//                    int var = nums1[j + 1];
//                    nums1[j + 1] = nums1[j];
//                    nums1[j] = var;
//                }
//            }
//        }
        System.out.println("The 3rd element is " + nums1[2]);
    }
}
