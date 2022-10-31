package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        LeetCode1431 obj1431 = new LeetCode1431();
        System.out.println(obj1431.kidsWithCandies(candies, extraCandies));
        System.out.println(obj1431.kidsWithCandiesOptimised(candies, extraCandies));
        System.out.println(obj1431.kidsWithCandiesOptimised2(candies, extraCandies));
    }

    private List<Boolean> kidsWithCandiesOptimised2(int[] candies, int extraCandies) {
        // Store the boolean value if the kids has maximum number of
        // candies after adding extra candies.
        List<Boolean> list = new ArrayList<Boolean>(candies.length);

        int max = Integer.MIN_VALUE;
        // Get the maximum number of candies from candies array
        for (int candy : candies) {

            if (candy > max)
                max = candy;
        }

        for (int i = 0; i < candies.length; i++) {
            list.add(i, (candies[i] + extraCandies >= max));
        }


        return list;
    }

    //Solution2: Runtime: 1ms(98.82%), Memory: 42.9MB(53.33%)
    private List<Boolean> kidsWithCandiesOptimised(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> resultant = new ArrayList<Boolean>();
        for (int candy : candies) {
            if (candy > maxCandies) maxCandies = candy;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                resultant.add(true);
            } else {
                resultant.add(false);
            }
        }
        return resultant;
    }


    //Solution1: Runtime: 9ms(7.33%), Memory: 43.4MB(10.1%)
    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        OptionalInt maxCandiesKid = Arrays.stream(candies).max();
        return Arrays.stream(candies).mapToObj(x -> maxCandiesKid.getAsInt() <= x + extraCandies).collect(Collectors.toCollection(ArrayList<Boolean>::new));
    }
}
