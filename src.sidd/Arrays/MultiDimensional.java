package Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 39, 4},
                {5, 6},
                {7, 8, 99, 10}
        };
        int target = 34;

        System.out.println(search(arr, target));
        System.out.println(max(arr));

    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    private static boolean search(int[][] arr, int target) {

        for(int i =0 ;i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
