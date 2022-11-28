package Recursion.Easy;

public class LeetCode231 {
    public static void main(String[] args) {
        LeetCode231 obj = new LeetCode231();
        int number = 16;
        System.out.println(obj.isPowerOfTwo(number));
    }

    private boolean isPowerOfTwo(int number) {
        if (number < 1) return false;
        if (number % 2 == 0) return isPowerOfTwo(number / 2);
        return number == 1;
    }
}
