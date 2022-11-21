package Strings.Easy;

public class LeetCode1967 {
    public static void main(String[] args) {
        LeetCode1967 objLeetCode1967 = new LeetCode1967();
        String[] patterns = {"a","a","a"};
        String word = "ab";
        System.out.println(objLeetCode1967.numOfStrings(patterns, word));
    }

    private int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) count++;
        }
        return count;
    }
}
