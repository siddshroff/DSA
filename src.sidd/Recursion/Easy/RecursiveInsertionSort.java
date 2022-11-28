package Recursion.Easy;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        RecursiveInsertionSort obj = new RecursiveInsertionSort();
        int[] input = {5, 1, 4, 2, 8};
        obj.insertSort(input, input.length);
        System.out.println(Arrays.toString(input));
    }

    private void insertSort(int[] input, int length) {
        if (length <= 1) return;
        insertSort(input, length - 1);
        int last = input[length - 1];
        int j = length - 2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && input[j] > last) {
            input[j + 1] = input[j];
            j--;
        }
        input[j + 1] = last;
    }
}
