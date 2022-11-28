package Recursion.Easy;

public class GFG5 {
    public static void main(String[] args) {
        GFG5 obj = new GFG5();
        String input = "hello";
        System.out.println(obj.length(input));
    }

    private int length(String input) {
        if (input.length() == 0) return 0;
        return length(input.substring(1)) + 1;
    }
}
