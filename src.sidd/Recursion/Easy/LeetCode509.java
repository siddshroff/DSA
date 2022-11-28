package Recursion.Easy;

public class LeetCode509 {
    public static void main(String[] args) {
        LeetCode509 objLeetCode509 = new LeetCode509();
        int n = 3;
        System.out.println(objLeetCode509.fib(n));
    }

    private int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
