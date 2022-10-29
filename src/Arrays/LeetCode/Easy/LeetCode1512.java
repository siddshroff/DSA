package Arrays.LeetCode.Easy;

import java.util.HashMap;

public class LeetCode1512 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(findGoodPair(nums));
        System.out.println(findGoodPairOptimised(nums));
    }

    //Solution1: Runtime: 1ms(89.70%), Memory: 41.3MB(61.79%)
//Usage of data structure solves half problem- hash getOrDefault
    private static int findGoodPairOptimised(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int friend:nums)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        return ans;
    }
    //Solution1: Runtime: 8ms(5.8%), Memory: 41MB(79.55%)
    private static int findGoodPair(int[] nums) {
        int pairCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j])
                    pairCounter++;
            }
        }
        return pairCounter;
    }

}
