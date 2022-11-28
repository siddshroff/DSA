package Strings.Easy;

import java.util.Collections;
import java.util.Stack;

public class LeetCode13 {
    public static void main(String[] args) {
        LeetCode13 objLeetCode13 = new LeetCode13();
        String s = "MCMXCIV";
        System.out.println(objLeetCode13.romanToInt(s));
        System.out.println(objLeetCode13.romanToIntFaster(s));
    }

    private int romanToIntFaster(String s) {
        int result = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num * 4 < result) {
                result -= num;
            } else {
                result += num;
            }
        }
        return result;
    }

    private int romanToInt(String s) {
        Stack roman = new Stack();
        int sum = 0;
        for (char ch : s.toCharArray()) {
            roman.push(ch);
        }
        while (!roman.isEmpty()) {
            switch (roman.pop().toString()) {
                case "I":
                    sum += 1;
                    break;
                case "V":
                    if (!roman.isEmpty() && roman.peek().toString().equals("I")) {
                        sum += 4;
                        roman.pop();
                    } else sum += 5;
                    break;
                case "X":
                    if (!roman.isEmpty() && roman.peek().toString().equals("I")) {
                        sum += 9;
                        roman.pop();
                    } else sum += 10;
                    break;
                case "L":
                    if (!roman.isEmpty() && roman.peek().toString().equals("X")) {
                        sum += 40;
                        roman.pop();
                    } else sum += 50;
                    break;
                case "C":
                    if (!roman.isEmpty() && roman.peek().toString().equals("X")) {
                        sum += 90;
                        roman.pop();
                    } else sum += 100;
                    break;
                case "D":
                    if (!roman.isEmpty() && roman.peek().toString().equals("C")) {
                        sum += 400;
                        roman.pop();
                    } else sum += 500;
                    break;
                case "M":
                    if (!roman.isEmpty() && roman.peek().toString().equals("C")) {
                        sum += 900;
                        roman.pop();
                    } else sum += 1000;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}
