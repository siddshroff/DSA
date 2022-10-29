package Arrays.LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1365 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrentOptimised(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrentOptimisedHard(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrentOptimisedMap(nums)));
    }
    //Usage of datastructure solves half problem - putIfAbsent
    private static int[] smallerNumbersThanCurrentOptimisedMap(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int duplicate[] = new int[n];
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            duplicate[i] = nums[i];
        }
        Arrays.sort(duplicate);
        for (int i = 0; i < n; i++) {
            mp.putIfAbsent(duplicate[i], i);
        }
        for (int i = 0; i < n; i++) {
            result[i] = mp.get(nums[i]);
        }
        return result;
    }

    private static int[] smallerNumbersThanCurrentOptimisedHard(int[] nums) {
        int[] freq = new int[101];
        for (int i : nums) {
            freq[i]++;
        }

        for (int i = 1; i < 101; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            ans[i] = freq[nums[i] - 1];
        }
        return ans;
    }

    //Solution1: Runtime: 4ms(89.19%), Memory: 43.8MB(82.2%)
    private static int[] smallerNumbersThanCurrentOptimised(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) res[i] = 0;
            else res[i] = count[nums[i] - 1];
        }

        return res;
    }

    //Solution1: Runtime: 27ms(10.35%), Memory: 45MB(18.15%)
    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] resultant = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) counter++;

            }
            resultant[i] = counter;
        }
        return resultant;
    }
}
