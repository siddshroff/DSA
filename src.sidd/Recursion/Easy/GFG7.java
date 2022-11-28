package Recursion.Easy;

public class GFG7 {
    public static void main(String[] args) {
        GFG7 obj = new GFG7();
        String s = "aabccba";
        System.out.println(obj.removeDuplicates(s));
    }

    private String removeDuplicates(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return removeDuplicates(s.substring(0, i).concat(s.substring(i + 1)));
            }
        }
        return s;
    }
}
