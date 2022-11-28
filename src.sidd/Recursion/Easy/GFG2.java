package Recursion.Easy;

import java.util.Arrays;

//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class GFG2 {
    public static void main(String[] args) {
        GFG2 obj = new GFG2();
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(obj.minInArray(arr));
        System.out.println(obj.maxInArray(arr));

    }

    private int maxInArray(int[] arr) {
        if (arr.length == 1) return arr[0];

        return Math.max(arr[0], maxInArray(Arrays.copyOfRange(arr, 1, arr.length)));
    }

    private int minInArray(int[] arr) {
        if (arr.length == 1) return arr[0];

        return Math.min(arr[0], maxInArray(Arrays.copyOfRange(arr, 1, arr.length)));
    }
}
