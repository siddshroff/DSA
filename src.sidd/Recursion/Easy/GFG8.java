package Recursion.Easy;

public class GFG8 {
    public static void main(String[] args) {
        GFG8 obj = new GFG8();
        String s = "nitin";
        obj.printPalindromes(s);
    }

    private void printPalindromes(String s) {
        if (s.length() == 1) {
            System.out.print(s + " ");
            return;
        }

        printPalindromes(s.substring(1));
        isPalindrome(s);

    }

    private boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        System.out.print(s + " ");
        return true;
    }
}
