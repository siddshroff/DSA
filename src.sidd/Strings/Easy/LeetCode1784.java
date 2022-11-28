package Strings.Easy;

public class LeetCode1784 {
    public static void main(String[] args) {
        LeetCode1784 objLeetCode1784 = new LeetCode1784();
        String s = "110";
        System.out.println(objLeetCode1784.checkOnesSegment(s));
    }

    private boolean checkOnesSegment(String s) {
        return s.indexOf("11")>=0;
    }
}
