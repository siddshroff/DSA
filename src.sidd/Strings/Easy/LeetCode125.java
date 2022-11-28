package Strings.Easy;

public class LeetCode125 {
    public static void main(String[] args) {
        LeetCode125 objLeetCode125 = new LeetCode125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(objLeetCode125.isPalindrome(s));
    }

    private boolean isPalindrome(String s) {
        String truncatedString = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder truncatedBuilder = new StringBuilder(truncatedString);
        return truncatedBuilder.reverse().toString().equals(truncatedString);
    }
}
