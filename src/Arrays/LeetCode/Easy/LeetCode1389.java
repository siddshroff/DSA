package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        System.out.println(Arrays.toString(createTargetArray2(nums, index)));
    }
// ArrayList add method shifts values to right indices
    private static int[] createTargetArray2(int[] nums, int[] index) {
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = (int) list.get(i);
        }
        return array;
    }


    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            int ind = index[i];

            if (ind < i) {
                int j = i;
                while (j > ind) {
                    target[j] = target[j - 1];
                    target[j - 1] = nums[i];
                    j--;
                }
            } else {
                target[i] = nums[ind];
            }

        }
        return target;
    }
}
