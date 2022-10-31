package Arrays.LeetCode.Medium;

import java.util.Arrays;

public class LeetCode238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        LeetCode238 obj238 = new LeetCode238();
        System.out.println(Arrays.toString(obj238.productExceptSelfNotAccptable(nums2)));
        System.out.println(Arrays.toString(obj238.productExceptSelf(nums2)));
        System.out.println(Arrays.toString(obj238.productExceptSelfOptimised(nums2)));
    }

    private int[] productExceptSelfOptimised(int[] nums) {

        int n = nums.length;
        int preProduct[] = new int[n];
        preProduct[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preProduct[i] = nums[i] * preProduct[i - 1];
        }
        int sufProduct[] = new int[n];
        sufProduct[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufProduct[i] = nums[i] * sufProduct[i + 1];
        }
        int ans[] = new int[n];
        ans[0] = sufProduct[1];
        ans[n - 1] = preProduct[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = preProduct[i - 1] * sufProduct[i + 1];
        }
        return ans;
    }

    //Solution1: Runtime: 3ms(74.12%), Memory: 58.2MB(15.16%)
    private int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= product;
            product *= nums[i];
        }
        return answer;
    }

    //This is not accepted as this is O(n^2).
    private int[] productExceptSelfNotAccptable(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                product *= nums[j];
            }
            answer[i] = product;
        }
        return answer;
    }
}
