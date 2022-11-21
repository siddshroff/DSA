package Strings.Easy;

public class LeetCode557 {
    public static void main(String[] args) {
        LeetCode557 objLeetCode557 = new LeetCode557();
        String s = "Let's take LeetCode contest";
        System.out.println(objLeetCode557.reverseWords(s));
    }

    private String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            sb.append(wordBuilder.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
