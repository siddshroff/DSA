package Strings.Easy;

import java.util.Arrays;

public class LeetCode1528 {
    public static void main(String[] args) {
        LeetCode1528 objLeetCode1528 = new LeetCode1528();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(objLeetCode1528.restoreString(s, indices));
        System.out.println(objLeetCode1528.restoreStringOther(s, indices));
    }

    private String restoreString(String s, int[] indices) {
        char[] restoredString = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            restoredString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(restoredString);
    }
    private String restoreStringOther(String s, int[] indices) {
        char[] restoredString = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            restoredString[indices[i]] = s.charAt(i);
        }
        return new String(restoredString);
    }
}
