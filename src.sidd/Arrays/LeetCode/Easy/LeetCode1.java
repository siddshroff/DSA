package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        LeetCode1 objLeetCode1 = new LeetCode1();
        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(objLeetCode1.twoSum(nums, target)));
    }

    private int[] twoSum(int[] nums, int target) {
        int[] indices = {-1, -1};
        for (int i = 0; i < nums.length && indices[0] == -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;

    }
}
