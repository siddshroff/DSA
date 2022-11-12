package Searching.LeetCode.Easy;

public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        LeetCode35 objLeetCode35 = new LeetCode35();
        System.out.println(objLeetCode35.searchInsert(nums, target));
    }

    private int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if (target > nums[end]) return end + 1;
        if (target < nums[start]) return 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
