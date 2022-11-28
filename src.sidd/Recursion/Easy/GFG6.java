package Recursion.Easy;

public class GFG6 {
    public static void main(String[] args) {
        GFG6 obj = new GFG6();
        int number = 12345;
        System.out.println(obj.sumOfdigits(number));
    }

    private int sumOfdigits(int number) {
        if (number / 10 == 0) return number % 10;
        return number % 10 + sumOfdigits(number / 10);
    }
}
