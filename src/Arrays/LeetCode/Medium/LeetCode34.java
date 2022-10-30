package Arrays.LeetCode.Medium;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        LeetCode34 obj34 = new LeetCode34();
        System.out.println(Arrays.toString(obj34.searchRange(nums, target)));
        System.out.println(Arrays.toString(obj34.searchRangeOptmised(nums, target)));
    }

    public int[] searchRangeOptmised(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(nums, target, true);
        if (result[0] != -1)
            result[1] = binarySearch(nums, target, false);
        return result;
    }

    private int binarySearch(int[] arr, int target, boolean firstHalf) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int mid = 0, ans = -1;
        while (endIndex >= startIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] == target) {
                if (firstHalf) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
                ans = mid;
            } else if (arr[mid] < target) {
                startIndex = mid + 1;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            }
        }
        return ans;
    }

    private int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == target) {
                ans[1] = j;
                break;
            }
        }

        return ans;
    }
}
