package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class LeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int shuffleIndex = 3;
        LeetCode1470 obj1470 = new LeetCode1470();
        System.out.println(Arrays.toString(obj1470.shuffleArray(nums, shuffleIndex)));
        System.out.println(Arrays.toString(obj1470.shuffleArraySolution2(nums, shuffleIndex)));
    }

    //Solution1: Runtime: 0ms(100%), Memory: 45.4 MB(68.10%)
    private int[] shuffleArray(int[] nums, int shuffleIndex) {
        int[] resultant = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                resultant[i] = nums[counter];
                counter++;
                continue;
            }
            resultant[i] = nums[shuffleIndex];
            shuffleIndex++;
        }
        return resultant;
    }

    //Solution1: Runtime: 0ms(100%), Memory: 41.9MB(99.55%)
    private int[] shuffleArraySolution2(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
