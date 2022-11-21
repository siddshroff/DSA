package Searching.LeetCode.Easy;


public class LeetCode367 {
    public static void main(String[] args) {
        LeetCode367 objLeetCode367 = new LeetCode367();
        int n = 17;
        System.out.println(objLeetCode367.isPerfectSquare(n));
    }

    private boolean isPerfectSquare(int num) {
        long low=1,high=num;

        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==num) return true;
            else if(mid*mid>num)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
}
