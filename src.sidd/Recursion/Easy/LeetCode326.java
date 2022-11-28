package Recursion.Easy;

public class LeetCode326 {
    public static void main(String[] args) {
        LeetCode326 obj = new LeetCode326();
        int n = 10;
        System.out.println(obj.isPowerOfThree(n));
    }

    private boolean isPowerOfThree(int number) {
        if (number < 1) return false;
        if (number % 3 == 0) return isPowerOfThree(number / 3);
        return number == 1;
    }
}
