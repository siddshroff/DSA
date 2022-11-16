package Searching.LeetCode.Medium;


public class LeetCode162 {
    public static void main(String[] args) {
        LeetCode162 objLeetCode162 = new LeetCode162();
        int[] nums = {1, 2, 3, 1};
        System.out.println(objLeetCode162.findPeakElement(nums));
    }

    private int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start != end) {
            mid = start + (end - start) / 2;
            //descending part of the array
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            }
            // ascending part of the array
            else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
