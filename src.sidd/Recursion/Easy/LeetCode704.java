package Recursion.Easy;

import Strings.Easy.LeetCode20;

public class LeetCode704 {
    public static void main(String[] args) {
        LeetCode704 objLeetCode704 = new LeetCode704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(objLeetCode704.recursiveBinarySearch(nums, target, 0, nums.length));
    }

    private int recursiveBinarySearch(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return recursiveBinarySearch(nums, target, start, mid - 1);
        return recursiveBinarySearch(nums, target, mid + 1, end);
    }
}
