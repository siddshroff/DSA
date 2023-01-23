package Bitwise.Easy;

import Recursion.Easy.LeetCode704;

public class LeetCode67 {
    public static void main(String[] args) {
        LeetCode67 obj = new LeetCode67();
        String a = "11", b = "1";
        System.out.println(obj.addBinary(a, b));
    }

    private String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
