package Arrays.LeetCode.Easy;

public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        LeetCode1732 obj1732 = new LeetCode1732();
        System.out.println(obj1732.largestAltitude(gain));
        System.out.println(obj1732.largestAltitudeOtherSolution(gain));
        System.out.println(obj1732.largestAltitude(gain2));
        System.out.println(obj1732.largestAltitudeOtherSolution(gain2));
    }

    //Solution1: Runtime: 1ms(60.6%), Memory: 41.9MB(41.2%)
    private int largestAltitudeOtherSolution(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    //Solution1: Runtime: 1ms(60.6%), Memory: 57.3MB(13.57%)
    private int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
