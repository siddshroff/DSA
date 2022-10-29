package Arrays.LeetCode.Easy;

public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(findRichestCustomer(accounts));
    }
    //Solution1: Runtime: 1ms(76.79%), Memory: 42.8MB(79.18%)
    private static int findRichestCustomer(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int counter = 0;
            for (int bank : account) {
                counter += bank;
            }
            if (counter > maxWealth) maxWealth = counter;
        }
        return maxWealth;
    }
}
