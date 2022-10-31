package Arrays.LeetCode.Easy;

import java.util.Arrays;

public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] image2 = {{1, 0, 1, 1}, {1, 0, 0, 0}, {1, 1, 0, 1}, {0, 0, 0, 1}};
        LeetCode832 obj832 = new LeetCode832();
        System.out.println(Arrays.deepToString((obj832.flipAndInvertImage(image))));
    }

    //Solution1: Runtime: 1ms(86.53%), Memory: 42.2MB(97.26%)
    private int[][] flipAndInvertImage(int[][] image) {

        //return invertImage(flipHorizontal(image));
        return flipHorizontalAndInvert(image);

    }

    private int[][] invertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }

    private int[][] flipHorizontal(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0, end = image[i].length - 1;
            while (start < end) {
                if (image[i][start] != image[i][end]) {
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                }
                start++;
                end--;
            }
        }
        return image;
    }

    //Solution1: Runtime: 2ms(33.54%), Memory: 45.2MB(12.18%)
    private int[][] flipHorizontalAndInvert(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0, end = image[i].length - 1;
            while (start <= end) {
                if (image[i][start] != image[i][end]) {
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                }
                if (image[i][start] == 0) image[i][start] = 1;
                else if (image[i][start] == 1) image[i][start] = 0;
                if (image[i][end] == 0 && start != end) image[i][end] = 1;
                else if (image[i][end] == 1 && start != end) image[i][end] = 0;
                start++;
                end--;
            }
        }
        return image;
    }
}
