package Recursion.Easy;

public class GFG4 {
    public static void main(String[] args) {
        GFG4 obj = new GFG4();
        int n = 5;
        obj.printNos(n);
    }

    private void printNos(int n) {
        if(n==0)return;
        printNos(n-1);
        System.out.print(n+" ");
    }
}
