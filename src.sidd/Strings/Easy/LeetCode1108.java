package Strings.Easy;

public class LeetCode1108 {
    public static void main(String[] args) {
        LeetCode1108 objLeetCode1108 = new LeetCode1108();
        String address = "1.1.1.1";
        System.out.println(objLeetCode1108.defangIPaddr(address));
    }

    private String defangIPaddr(String address) {
        String replacement = "[.]";
        return address.replace(".", replacement);
    }
}
