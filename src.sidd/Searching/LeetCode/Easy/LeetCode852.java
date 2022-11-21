package Searching.LeetCode.Easy;

public class LeetCode852 {
    public static void main(String[] args) {
        LeetCode852 objLeetCode852 = new LeetCode852();
        int[] arr = {0, 1, 0};
        System.out.println(objLeetCode852.peakIndexInMountainArray(arr));
    }

    private int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start != end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
