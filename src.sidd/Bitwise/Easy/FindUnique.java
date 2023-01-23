package Bitwise.Easy;

public class FindUnique {
    public static void main(String[] args) {
        FindUnique findUnique = new FindUnique();
        int[] arr = {2, 2, 4, 4, 5, 5, 7};
        System.out.println(findUnique.getUnique(arr));
    }

    private int getUnique(int[] arr) {
        int unique =0;
        for (int n:arr) {
            unique^=n;
        }
        return unique;
    }
}
