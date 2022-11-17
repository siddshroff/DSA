package Strings.Easy;

public class LeetCode1662 {
    public static void main(String[] args) {
        LeetCode1662 objLeetCode1662 = new LeetCode1662();
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        System.out.println(objLeetCode1662.arrayStringsAreEqual(word1, word2));
        System.out.println(objLeetCode1662.arrayStringsAreEqualFaster(word1, word2));
    }

    private boolean arrayStringsAreEqualFaster(String[] word1, String[] word2) {
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sum1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sum2.append(word1[i]);
        }
        String ans1= new String(sum1);
        String ans2= new String(sum2);
        return sum1.equals(sum2);
    }

    private boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = "";
        String sum2 = "";
        for (int i = 0; i < word1.length; i++) {
            sum1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            sum2 += word2[i];
        }
        return sum1.equals(sum2);
    }
}
