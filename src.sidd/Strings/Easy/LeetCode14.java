package Strings.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LeetCode14 {
    public static void main(String[] args) {
        LeetCode14 objLeetCode14 = new LeetCode14();
        String[] strs = {"abca", "aba", "aaab"};
        //System.out.println(objLeetCode14.longestCommonPrefix(strs));
        System.out.println(objLeetCode14.longestCommonPrefixFaster(strs));
    }


    private String longestCommonPrefixFaster(String[] strs) {
        String commonPrefix = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(commonPrefix)) continue;
            for (int j = 0; j < strs[i].length(); j++) {
                if (commonPrefix.length() > j && strs[i].charAt(j) != commonPrefix.charAt(j)) {
                    commonPrefix = commonPrefix.substring(0, j);
                    continue;
                }
            }
            continue;
        }
        return commonPrefix;
    }
}
