package Arrays.LeetCode.Easy;
// Type conversions are more expensive than iterations
public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) count++;
        }
        return count;
    }

    public int findNumbersOther(int[] nums) {
        //Input: nums = [555,901,482,1771]
        //Output: 1
        //Explanation:
        //Only 1771 contains an even number of digits.
        int evenNumberCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    private boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return (count % 2 == 0) ? true : false;
    }
}
