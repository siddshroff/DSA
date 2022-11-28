package Strings.Easy;

public class LeetCode1668 {
    public static void main(String[] args) {
        LeetCode1668 objLeetCode1668 = new LeetCode1668();
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", word = "aaaba";
        System.out.println(objLeetCode1668.maxRepeating(sequence, word));
    }

    private int maxRepeating(String sequence, String word) {
        int count = 0;
        int index = sequence.indexOf(word);
        while (index >= 0) {
            count++;
            sequence = sequence.substring(index + word.length(), sequence.length());
            index = sequence.indexOf(word);
        }
        return count;
    }
}
