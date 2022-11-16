package Searching.LeetCode.Medium;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        LeetCode34 objLeetCode34 = new LeetCode34();
        int[] nums = {5, 7, 7, 8, 8, 8, 8, 8};
        int target = 8;
        System.out.println(Arrays.toString(objLeetCode34.searchRange(nums, target)));
    }

    private int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, 0, nums.length - 1, true);
        if (ans[0] != -1)
            ans[1] = binarySearch(nums, target, 0, nums.length - 1, false);
        return ans;
    }

    private int binarySearch(int[] nums, int target, int start, int end, boolean initialPart) {
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            // If we have found target element then we need to find the first or last element
            if (nums[mid] == target) {
                if (initialPart) end = mid - 1;
                else start = mid + 1;
                ans = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return ans;
    }
}
