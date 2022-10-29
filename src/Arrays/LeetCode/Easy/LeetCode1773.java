package Arrays.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        items.add(new ArrayList<String>(Arrays.asList("phone", "blue", "pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer", "silver", "lenovo")));
        items.add(new ArrayList<String>(Arrays.asList("phone", "gold", "iphone")));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
        System.out.println(countMatchesOther(items, ruleKey, ruleValue));
    }
    //Solution1: Runtime: 12ms(32.8%), Memory: 57.3MB(7.3%)
    private static int countMatchesOther(List<List<String>> items, String ruleKey, String ruleValue) {
        int a, b, c, i=0;
        String s;
        if(ruleKey.equals("type"))
            a=0;
        else if(ruleKey.equals("color"))
            a=1;
        else if(ruleKey.equals("name"))
            a=2;
        else
            return 0;
        int l=items.size();
        for(int x=0;x<l;x++){
            s=items.get(x).get(a);
            if(s.equals(ruleValue))
                i++;
        }
        return i;
    }
    //Solution1: Runtime: 9ms(50.85%), Memory: 56MB(79.77%)
    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatches=0;
        switch (ruleKey) {
            case "type":
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(0).equalsIgnoreCase(ruleValue)){
                        countMatches++;
                    }
                }
                break;
            case "color":

                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(1).equalsIgnoreCase(ruleValue)){
                        countMatches++;
                    }
                }
                break;
            case "name":

                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(2).equalsIgnoreCase(ruleValue)){
                        countMatches++;
                    }
                }
            default:
                break;
        }
        return countMatches;
    }
}
