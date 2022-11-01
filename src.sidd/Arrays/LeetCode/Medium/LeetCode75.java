package Arrays.LeetCode.Medium;

import java.util.Arrays;

public class LeetCode75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    //In place sorting. Sort 2 digits and third would be done by itself
    private static void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, index = 0;
        while (index <= end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
                index--;
            }
            index++;
        }
    }
}
