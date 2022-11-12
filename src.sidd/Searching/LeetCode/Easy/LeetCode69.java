package Searching.LeetCode.Easy;

public class LeetCode69 {
    public static void main(String[] args) {
        int x = 10;
        LeetCode69 objLeetCode69 = new LeetCode69();
        System.out.println(objLeetCode69.mySqrt(x));
        System.out.println(objLeetCode69.mySqrt2(x));
    }
//Why binary search? searching square root in sequential(ascending sorted) numbers
    private int mySqrt2(int x) {
        long low =  0;
        long high = x;
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            if(mid*mid < x){
                low = mid + 1;
                ans = mid;
            }
            else if(mid*mid > x){
                high = mid - 1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)ans;
    }

    private long mySqrt(int x) {
        long sqrt = 1, diff = 0;
        if(x==0)return 0;
        for (int i = 1; i <= x / 2; i++) {
            sqrt = i;
            diff = x - i * i;
            if (diff == 0) return i;
            else if (diff < 0) return i - 1;
        }
        return sqrt;
    }
}
