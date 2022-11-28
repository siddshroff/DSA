package Strings.Easy;

import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        LeetCode20 objLeetCode20 = new LeetCode20();
        String s = "{[]}";
        System.out.println(objLeetCode20.isValid(s));
        //System.out.println(objLeetCode20.isValidStack(s));
    }

    private boolean isValid(String s) {
        int braces = 0, squareBraces = 0, curlyBraces = 0;
        int overlap = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') braces++;
            if (s.charAt(i) == '(' && (squareBraces > 0 || curlyBraces > 0)) overlap++;
            if (s.charAt(i) == ')') braces--;
            if (s.charAt(i) == '[') squareBraces++;
            if (s.charAt(i) == '[' && (braces > 0 || curlyBraces > 0)) overlap++;
            if (s.charAt(i) == ']') squareBraces--;
            if (s.charAt(i) == '{') curlyBraces++;
            if (s.charAt(i) == '{' && (squareBraces > 0 || braces > 0)) overlap++;
            if (s.charAt(i) == '}') curlyBraces--;
        }
        return braces == 0 && squareBraces == 0 && curlyBraces == 0;
    }
}
