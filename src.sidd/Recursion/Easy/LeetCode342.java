package Recursion.Easy;

public class LeetCode342 {
    public static void main(String[] args) {
        LeetCode342 objLeetCode342 = new LeetCode342();
        int number = 32;
        System.out.println(objLeetCode342.powerOf4(number));
    }

    private boolean powerOf4(int number) {
        if (number < 1) return false;
        if (number % 4 == 0) return powerOf4(number / 4);
        return number == 1;
    }
}
