package Strings.Easy;

import Searching.LeetCode.Easy.LeetCode744;

import java.util.Stack;

public class LeetCode1047 {
    public static void main(String[] args) {
        LeetCode1047 objLeetCode1047 = new LeetCode1047();
        String s = "abbaca";
        System.out.println(objLeetCode1047.removeDuplicates(s));
    }
// Use basic data structure for faster operations. Stack, Queue etc
    // Solution 61.6, 98.4
    private String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length() ;i++){
            if(!st.isEmpty()){
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ns = new StringBuilder("");
        while(!st.isEmpty()){
            ns.append(st.pop());
        }
        return ns.reverse().toString();
    }
}
