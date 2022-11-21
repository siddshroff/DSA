package Arrays.LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String wrongPanagram = "leetcode";
        LeetCode1832 obj1832 = new LeetCode1832();
        System.out.println(obj1832.isPangram(sentence));
        System.out.println(obj1832.isPangramOptimised(sentence));
        System.out.println(obj1832.isPangram(wrongPanagram));
        System.out.println(obj1832.isPangramOptimised(wrongPanagram));
    }

    //Solution1: Runtime: 0ms(100%), Memory: 42.1MB(47.24%)
    //String operations indexOf while character finding
    private boolean isPangramOptimised(String sentence) {
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
    private boolean isPangram(String sentence) {
        Set dictionary = new HashSet();
        for (char ch : sentence.toCharArray()) {
            dictionary.add(ch);
        }
        if (dictionary.size() == 26)
            return true;
        return false;
    }
}
