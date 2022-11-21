package Strings.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1704 {
    public static void main(String[] args) {
        LeetCode1704 objLeetCode1704 = new LeetCode1704();
        String s = "textbook";
        System.out.println(objLeetCode1704.halvesAreAlike(s));
    }

    private boolean halvesAreAlike(String s) {
        char[] word = s.toCharArray();
        List vowels = new ArrayList(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int sum = 0;
        for (int i = 0, j = word.length - 1; i < j; i++, j--) {
            if (vowels.contains(word[i])) sum++;
            if (vowels.contains(word[j])) sum--;
        }
        return sum == 0;
    }
}
