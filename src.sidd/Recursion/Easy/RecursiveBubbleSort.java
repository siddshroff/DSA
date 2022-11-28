package Recursion.Easy;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        int[] input = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(obj.sort(input)));
    }

    private int[] sort(int[] input) {
        int temp = 0, swap = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                swap++;
            }
        }
        if(swap!=0){
            sort(input);
        }
        return input;
    }
}
