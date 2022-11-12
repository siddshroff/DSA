package Searching.LeetCode.Easy;

import Searching.LeetCode.Medium.LeetCode167;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int[] arr2 = {1,2,3,4};
        int k = 5;
        int k2=2;
        LeetCode1539 objLeetCode1539 = new LeetCode1539();
        System.out.println(objLeetCode1539.findKthPositive(arr, k));
        System.out.println(objLeetCode1539.findKthPositiveEasy(arr2, k2));
    }

    private int findKthPositiveEasy(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }

    private int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }
}
