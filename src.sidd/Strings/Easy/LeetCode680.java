package Strings.Easy;

public class LeetCode680 {
    public static void main(String[] args) {
        LeetCode680 objLeetCode680 = new LeetCode680();
        String s = "abc";
        System.out.println(objLeetCode680.validPalindrome(s));
        System.out.println(objLeetCode680.validPalindromeFaster(s));

    }
    public boolean validPalindromeFaster(String s) {
        int len = s.length();
        int x = -1;
        x = breakingBad(s, 0, len - 1);
        if (x == -1) return true;
        if (breakingBad(s, x + 1, len - 1 - x) == -1) return true;
        return breakingBad(s, x, len - x - 2) == -1;
    }

    private int breakingBad(String s, int left, int right) {
        for (int i = left, j = right; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return i;
            }
        }
        return -1;
    }
    private boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        String firstHalf, secondHalf;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                firstHalf = s.substring(0, i);
                secondHalf = s.substring(i + 1);
                if (isPalindrome(firstHalf + secondHalf)) return true;
                firstHalf = s.substring(0, j);
                secondHalf = s.substring(j + 1);
                if (isPalindrome(firstHalf + secondHalf)) return true;
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
