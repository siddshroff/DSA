package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSumOptimized(nums)));
        System.out.println(Arrays.toString(runningSumOptimized2(nums)));
    }
    //Solution3: Runtime: 1ms(51.67%), Memory: 43.2MB(63.39%)
    private static int[] runningSumOptimized2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    //Solution2: Runtime: 0ms(100%), Memory: 43.5MB(26.3%)
    private static int[] runningSumOptimized(int[] nums) {
        int runningCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = runningCounter += nums[i];
        }
        return nums;
    }

    //Solution1: Runtime: 0ms(100%), Memory: 43.7MB(17.63%)
    private static int[] runningSum(int[] nums) {
        int runningCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            runningCounter += nums[i];
            nums[i] = runningCounter;
        }
        return nums;
    }
}
