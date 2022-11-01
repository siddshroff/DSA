package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Use linkedList when dealing with lot of iterations. 10^4 types
// Add the carry overs with main sum(here k)
public class LeetCode989 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 4};
        int k = 181;
        System.out.println(addToArrayForm(nums, k));
        System.out.println(addToArrayFormOptimised(nums, k));
    }

    private static List<Integer> addToArrayForm(int[] nums, int k) {
        final List<Integer> result = new ArrayList<>();
        int len = nums.length - 1;

        while(len >= 0 || k != 0){

            if(len >= 0){
                k += nums[len--];
            }

            result.add(0,k % 10);
            k /= 10;
        }

        return result;

    }

    private static List<Integer> addToArrayFormOptimised(int[] nums, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        for(int i=nums.length-1; i>=0; i--){
            int sum = nums[i]+k;
            res.addFirst(sum%10);
            k = sum/10;
        }
        while(k>0){
            res.addFirst(k%10);
            k/=10;
        }
        return res;

    }

}
