package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1304 {
    public static void main(String[] args) {
        LeetCode1304 objLeetCode1304 = new LeetCode1304();
        int n = 4;
        System.out.println(Arrays.toString(objLeetCode1304.sumZero(n)));
    }

    private int[] sumZero(int n) {
        int[] sumZero = new int[n];
        if (n % 2 == 0) {
            for (int i = 1, j = n - 1; i <= n / 2; i++, j--) {
                sumZero[i - 1] = i * -1;
                sumZero[j] = i;
            }
        } else {
            for (int i = 1, j = n - 1; i <= n / 2; i++, j--) {
                sumZero[i - 1] = i * -1;
                sumZero[j] = i;
            }
        }

        return sumZero;
    }

}
