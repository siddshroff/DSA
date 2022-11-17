package Strings.Easy;

public class LeetCode657 {
    public static void main(String[] args) {
        LeetCode657 objLeetCode657 = new LeetCode657();
        String moves = "LLD";
        System.out.println(objLeetCode657.judgeCircle(moves));
    }

    private boolean judgeCircle(String moves) {
        char[] moveArray = moves.toCharArray();
        int vertical = 0, horizontal = 0;
        for (char move : moveArray) {
            if (move == 'U') vertical++;
            if (move == 'D') vertical--;
            if (move == 'L') horizontal += 1;
            if (move == 'R') horizontal -= 1;
        }
        return horizontal == 0 && vertical == 0;
    }
}
