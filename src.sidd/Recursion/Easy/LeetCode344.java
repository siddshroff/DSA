package Recursion.Easy;

import java.util.Arrays;

public class LeetCode344 {
    public static void main(String[] args) {
        LeetCode344 objLeetCode344 = new LeetCode344();
        char[] s= "hello".toCharArray();
        System.out.println(Arrays.toString(objLeetCode344.reverseString(s)));
    }

    private char[] reverseString(char[] s) {
        solve(s,0,s.length-1);
        return s;
    }

    private void solve(char[] s, int i, int length) {
        if(i>length)return;
        char temp=s[i];
        s[i]=s[length];
        s[length]=temp;
        solve(s,++i,--length);
    }
}
