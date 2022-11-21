package Recursion.Easy;

import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class GFG1 {
    public static void main(String[] args) {
        GFG1 obj = new GFG1();
        int[] A = {1, 2, 3, 4, 5};
        obj.sumTriangle(A);
    }

    private void sumTriangle(int[] a) {
        int[] ans = new int[a.length - 1];
        if (a.length <= 1) return;
        for (int i = 0; i < a.length - 1; i++) {
            ans[i] = a[i] + a[i + 1];
        }
        sumTriangle(ans);
        System.out.println(Arrays.toString(ans));
    }
}
