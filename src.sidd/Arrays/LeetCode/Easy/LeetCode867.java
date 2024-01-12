package Arrays.LeetCode.Easy;

import java.util.Arrays;
/*
Runtime::0 ms. Beats 100.00% of users with Java.
Memory:: 45.14MB Beats 6.78% of users with Java
 */
public class LeetCode867 {
    public static void main(String[] args) {
        LeetCode867 objLeetCode867 = new LeetCode867();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(objLeetCode867.transpose(matrix)));
        System.out.println(Arrays.deepToString(objLeetCode867.transpose(matrix1)));
    }

    private int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }

        }
        return transpose;
    }
}
