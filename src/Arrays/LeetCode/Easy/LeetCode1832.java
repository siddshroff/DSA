package Arrays.LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String wrongPanagram = "leetcode";
        System.out.println(isPangram(sentence));
        System.out.println(isPangramOptimised(sentence));
        System.out.println(isPangram(wrongPanagram));
        System.out.println(isPangramOptimised(wrongPanagram));
    }
    //Solution1: Runtime: 0ms(100%), Memory: 42.1MB(47.24%)
    //String operations indexOf while character finding
    private static boolean isPangramOptimised(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
    //Solution1: Runtime: 8ms(23.56%), Memory: 42.4MB(27.85%)
    private static boolean isPangram(String sentence) {
        Set dictionary = new HashSet();
        for (char ch : sentence.toCharArray()) {
            dictionary.add(ch);
        }
        if(dictionary.size()==26)
        return true;
        return false;
    }
}
