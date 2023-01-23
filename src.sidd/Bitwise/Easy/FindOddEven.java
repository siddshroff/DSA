package Bitwise.Easy;

public class FindOddEven {
    public static void main(String[] args) {
        FindOddEven findOddEven = new FindOddEven();
        int num = 7;
        System.out.println(findOddEven.isOdd(num));
    }

    private boolean isOdd(int num) {
        if((num & 1)==1)
            return true;
        return false;
    }
}
