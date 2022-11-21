package Strings.Easy;

import Arrays.LeetCode.Easy.LeetCode1773;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCode1859 {
    public static void main(String[] args) {
        LeetCode1859 objLeetCode1859 = new LeetCode1859();
        String s = "is2 sentence4 This1 a3";
        System.out.println(objLeetCode1859.sortSentence(s));
        System.out.println(objLeetCode1859.sortSentenceFaster(s));
    }

    private String sortSentenceFaster(String s) {
        String[] str = s.split(" ");
        String[] store = new String[str.length];

        for (String value : str) {
            int p = value.length() - 1;
            int k = value.charAt(p) - '0';
            store[k - 1] = value.substring(0, p);
        }


        StringBuilder sb = new StringBuilder();
        for (String value : store) {
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }

    private String sortSentence(String s) {
        String[] sorted = new String[s.split(" ").length];
        String[] originalString = s.split(" ");
        for (String word : originalString) {
            // character to ascii value
            int index = word.charAt(word.length() - 1) - '0';
            sorted[index - 1] = word.substring(0, word.length() - 1);
        }
        return Arrays.stream(sorted).collect(Collectors.joining(" "));
    }
}
