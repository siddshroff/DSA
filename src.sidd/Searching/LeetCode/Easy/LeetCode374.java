package Searching.LeetCode.Easy;

public class LeetCode374 {
    public static void main(String[] args) {
        int n = 10;
        LeetCode374 objLeetCode374 = new LeetCode374();
        System.out.println(objLeetCode374.guessNumber(n));
    }
    //Solution1: Runtime: 0ms(100%), Memory: 38.9MB(92.54%)
    private int guessNumber(int n) {
        int start = 0;
        int mid = 0;
        while (start <= n) {
            mid = start + (n - start) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == 1) {
                start = mid + 1;
            } else {
                n = mid - 1;
            }
        }
        return mid;
    }

    private int guess(int mid) {
        int pick = 6;
        if (mid > pick) return -1;
        if (mid < pick) return 1;
        return 0;
    }
}
