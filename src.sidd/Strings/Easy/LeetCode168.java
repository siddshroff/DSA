package Strings.Easy;

public class LeetCode168 {
    public static void main(String[] args) {
        LeetCode168 objLeetCode168 = new LeetCode168();
        int columnNumber = 28;
        System.out.println(objLeetCode168.convertToTitle(columnNumber));
    }

    private String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        // A-> 65, 1->49
        while (columnNumber % 10 != 0) {
            title.append((char) (Math.ceil(columnNumber / 26) + 64));
            columnNumber /= 10;
        }
        return title.toString();
    }
}
