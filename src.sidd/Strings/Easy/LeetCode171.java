package Strings.Easy;


public class LeetCode171 {
    public static void main(String[] args) {
        LeetCode171 objLeetCode171 = new LeetCode171();
        String columnTitle = "AB";
        //System.out.println(objLeetCode171.titleToNumber(columnTitle));
        System.out.println(objLeetCode171.titleToNumberFaster(columnTitle));
        System.out.println(objLeetCode171.titleToNumberOther(columnTitle));
    }
    public int val(char c){
        int cval = c - '@' ;
        return cval;
    }
    public int titleToNumberOther(String columnTitle) {
        int len = columnTitle.length();
        int ans = 0;
        int fact = 1;
        for(int i=len-1;i>=0;i--){
            ans += val(columnTitle.charAt(i)) * fact;
            fact = fact * 26;
        }
        return ans;
    }
    private int titleToNumberFaster(String columnTitle) {
        if (columnTitle == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }

    private int titleToNumber(String columnTitle) {
        char[] title = columnTitle.toCharArray();
        int column = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            column = (int) title[i] - 20;
        }
        return column + '0';
    }
}
