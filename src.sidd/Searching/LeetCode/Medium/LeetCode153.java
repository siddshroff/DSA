package Searching.LeetCode.Medium;

public class LeetCode153 {
    public static void main(String[] args) {
        LeetCode153 objLeetCode153 = new LeetCode153();
        int[] nums = {11, 13, 15, 17};
        System.out.println(objLeetCode153.findMin(nums));
    }

    private int findMin(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int mid = 0;
        while (startIndex <= endIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            if (mid < endIndex && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            } else if (mid > startIndex && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[mid] <= arr[startIndex]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return arr[0];
    }
}
