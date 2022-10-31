package Arrays.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1, 2};
        int shift = 3;
        LeetCode189 obj189 = new LeetCode189();
        obj189.rotate(nums, shift);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length; // for length of array is less to k
        if (k < 0) { // for -ve value
            k += nums.length;
        }

        //complete rotate array
        rev(nums, 0, nums.length - 1);

        //K part reversal
        rev(nums, 0, k - 1);

        //Non K part reversal
        rev(nums, k, nums.length - 1);
    }

    private void rev(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    private void rotateOption2(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }

    //Time exceeded
    private void rotateNotOptimised(int[] nums, int k) {
        if (nums.length == 1) return;
        List<Integer> lst = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < k; i++) {
            lst.add(0, lst.get(lst.size() - 1));
            lst.remove(nums.length);
        }
        for (int i = 0; i < lst.size(); i++) {
            nums[i] = lst.get(i);
        }
        return;
    }
}
