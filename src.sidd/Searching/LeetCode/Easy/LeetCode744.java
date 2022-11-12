package Searching.LeetCode.Easy;

public class LeetCode744 {
    public static void main(String[] args) {
        LeetCode744 objLeetCode744 = new LeetCode744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(objLeetCode744.nextGreatestLetter(letters, target));
    }

    private char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
