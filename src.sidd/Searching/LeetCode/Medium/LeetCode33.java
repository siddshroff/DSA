package Searching.LeetCode.Medium;

public class LeetCode33 {
    public static void main(String[] args) {
        LeetCode33 objLeetCode33 = new LeetCode33();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(objLeetCode33.search(nums, target));
    }

    public int search(int[] arr, int target) {
        int pivot = findPivotInArray(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
        int mid = 0;
        while (endIndex >= startIndex) {
            // Below line makes sure we are not exceeding int limits while performing
            // addition operation to find mid (start+end)/2
            mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                startIndex = mid + 1;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            }
        }
        return -1;
    }

    private int findPivotInArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int mid = 0;
        while (startIndex <= endIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            if (mid < endIndex && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > startIndex && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[startIndex]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
