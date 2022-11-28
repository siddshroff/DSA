package Recursion.Easy;

public class GFG3 {
    public static void main(String[] args) {
        GFG3 obj = new GFG3();
        String s = "geeksforgeeKs";
        System.out.println(obj.firstCaps(s, 0));
    }

    private char firstCaps(String s, int i) {
        if (s.charAt(i) == '\0') return 0;
        if (Character.isUpperCase(s.charAt(i))) return s.charAt(i);
        try{
            return firstCaps(s, i + 1);
        }catch(Exception e){
            System.out.println();
        }
        return 0;
    }
}
