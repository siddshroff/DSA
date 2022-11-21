package Searching.LeetCode.Medium;

public class LeetCode540 {
    public static void main(String[] args) {
        LeetCode540 objLeetCode540 = new LeetCode540();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int[] nums3 = {1, 1, 2};
        System.out.println(objLeetCode540.singleNonDuplicateBinary(nums));
        System.out.println(objLeetCode540.singleNonDuplicate(nums3));
    }

    private int singleNonDuplicate(int[] nums) {
        int ans = -1;
        if (nums.length == 1) return nums[0];
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                ans = nums[i];
                break;
            }
            i += 2;
        }
        return nums.length % 2 != 0 && ans == -1 ? nums[nums.length - 1] : ans;
    }

    /*
    * EXPLANATION:-
    Suppose array is [1, 1, 2, 2, 3, 3, 4, 5, 5]
    we can observe that for each pair,
    first element takes even position and second element takes odd position
    for example, 1 is appeared as a pair,
    so it takes 0 and 1 positions. similarly for all the pairs also.

    this pattern will be missed when single element is appeared in the array.

    From these points, we can implement algorithm.
    1. Take left and right pointers .
        left points to start of list. right points to end of the list.
    2. find mid.
        if mid is even, then it's duplicate should be in next index.
        or if mid is odd, then it's duplicate  should be in previous index.
        check these two conditions,
        if any of the conditions is satisfied,
        then pattern is not missed,
        so check in next half of the array. i.e, left = mid + 1
        if condition is not satisfied, then the pattern is missed.
        so, single number must be before mid.
        so, update end to mid.
    3. At last return the nums[left]

    Time: -  O(logN)
    space:-  O(1)

    */
    private int singleNonDuplicateBinary(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
