package Strings.Easy;

public class LeetCode58 {
    public static void main(String[] args) {
        LeetCode58 objLeetCode58 = new LeetCode58();
        String s = "luffy is still joyboy";
        System.out.println(objLeetCode58.lengthOfLastWord(s));
    }

    private int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
