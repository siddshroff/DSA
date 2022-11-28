package Strings.Medium;

public class LeetCode28 {
    public static void main(String[] args) {
        LeetCode28 objLeetCode28 = new LeetCode28();
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(objLeetCode28.strStr(haystack, needle));
    }

    private int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}
