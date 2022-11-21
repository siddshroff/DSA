package Strings.Easy;

public class LeetCode1309 {
    public static void main(String[] args) {
        LeetCode1309 objLeetCode1309 = new LeetCode1309();
        String s = "10#11#12";
        System.out.println(objLeetCode1309.freqAlphabets(s));
        System.out.println(objLeetCode1309.freqAlphabetsFaster(s));

    }

    private String freqAlphabetsFaster(String s) {
        StringBuffer output = new StringBuffer();
        int len = s.length();

        for(int i = len - 1; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                int ones = (int)s.charAt(--i) - 48;
                int tens = (int)s.charAt(--i) - 48;
                int index = 10 * tens + ones;
                char ch = (char)(index + 96);
                output.append(ch);
            } else {
                // `1` translates to `a`,
                // i.e. ASCII of `1` = 49 translates to ASCII of `a` = 97
                // 97 - 49 = 48. Hence, adding 48 to get the corrsponding alphabet.
                char ch = (char)(s.charAt(i) + 48);
                output.append(ch);
            }
        }

        return output.reverse().toString();
    }

    private String freqAlphabets(String s) {
        char[] result = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == '#') {
                sb.append(mapInteger((result[i - 1] - '0') + (result[i - 2] - '0') * 10));
                i -= 2;
                continue;
            }
            sb.append(mapInteger(result[i] - '0'));
        }
        return sb.reverse().toString();
    }

    private char mapInteger(int c) {
        if (c == 1) return 'a';
        if (c == 2) return 'b';
        if (c == 3) return 'c';
        if (c == 4) return 'd';
        if (c == 5) return 'e';
        if (c == 6) return 'f';
        if (c == 7) return 'g';
        if (c == 8) return 'h';
        if (c == 9) return 'i';
        if (c == 10) return 'j';
        if (c == 11) return 'k';
        if (c == 12) return 'l';
        if (c == 13) return 'm';
        if (c == 14) return 'n';
        if (c == 15) return 'o';
        if (c == 16) return 'p';
        if (c == 17) return 'q';
        if (c == 18) return 'r';
        if (c == 19) return 's';
        if (c == 20) return 't';
        if (c == 21) return 'u';
        if (c == 22) return 'v';
        if (c == 23) return 'w';
        if (c == 24) return 'x';
        if (c == 25) return 'y';
        return 'z';
    }
}
