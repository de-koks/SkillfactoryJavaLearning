package Module21;

public class Array5_15 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int five = 5;
        for (int i = 0; i < nums.length; i++){
            nums[i] = five++;
            System.out.println(nums[i]);
        }
    }
}
