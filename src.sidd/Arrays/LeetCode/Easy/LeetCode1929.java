package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class LeetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        LeetCode1929 obj1929 = new LeetCode1929();
        System.out.println(Arrays.toString(obj1929.concateArray(nums)));
        System.out.println(Arrays.toString(obj1929.concateArrayOptimized(nums)));
    }

    //Solution 1 : Runtime 3ms(41.99%), Memory: 50.4MB(19.34%)
    private int[] concateArray(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    //Solution 2 : Runtime 1ms(99.26%), Memory: 43MB(87.94%)
    private int[] concateArrayOptimized(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = ans[i] = nums[i];
        }
        return ans;
    }
}
