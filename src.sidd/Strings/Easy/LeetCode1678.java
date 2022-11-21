package Strings.Easy;

import java.util.Stack;

public class LeetCode1678 {
    public static void main(String[] args) {
        LeetCode1678 objLeetCode1678 = new LeetCode1678();
        String command = "(al)G(al)()()G";
        System.out.println(objLeetCode1678.interpret(command));
        System.out.println(objLeetCode1678.interpretFaster(command));
    }

    private String interpretFaster(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    private String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') sb.append(command.charAt(i));
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a'
                    && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }
}
