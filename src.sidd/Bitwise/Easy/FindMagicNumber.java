package Bitwise.Easy;

public class FindMagicNumber {
    public static void main(String[] args) {
        FindMagicNumber findMagicNumber = new FindMagicNumber();
        int n = 6;
        System.out.println(findMagicNumber.findMagicNumber(n));
    }

    private int findMagicNumber(int n) {
        int base = 5;
        int ans = 0;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }
}
