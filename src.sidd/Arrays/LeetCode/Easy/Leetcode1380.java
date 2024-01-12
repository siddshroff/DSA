package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1380 {
    public static void main(String[] args) {
        Leetcode1380 objLeetCode1380 = new Leetcode1380();
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(objLeetCode1380.luckyNumbers(matrix));
    }

    private List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumber = new ArrayList<>();
        List<Integer> minOfRows = new ArrayList<>();
        List<Integer> maxOfColumns = new ArrayList<>();
        int minRow, maxCol;
        for (int i = 0; i < matrix.length; i++) {
            minRow = Integer.MAX_VALUE;
            maxCol = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                }
                if (matrix[j][i] > maxCol) {
                    maxCol = matrix[j][i];
                }
            }
            minOfRows.add(minRow);
            maxOfColumns.add(maxCol);
        }
        for (int i = 0; i < minOfRows.size(); i++) {
            if(minOfRows.get(i)==maxOfColumns.get(i)){
                luckyNumber.add(minOfRows.get(i));
            }
        }
        return luckyNumber;

    }
}
