package Bitwise.Easy;

public class FindithBit {
    public static void main(String[] args) {
        FindithBit findithBit = new FindithBit();
        int num = 5;
        int bit = 3;
        System.out.println(findithBit.findBit(num, bit));
        System.out.println(findithBit.resetBit(num, bit));
    }

    private int resetBit(int num, int bit) {
        return num & ~(1 << (bit - 1));

    }

    private int findBit(int num, int bit) {
        return num & (1 << (bit - 1));
    }
}
