package Sorting;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main (String[] args)
    {
        int arr[] = {1291, 897, 4566, 1232, 80, 700};
        int n = arr.length;

        for (int i = 0; i < n; i++)
            if(isLucky(arr[i]))
                System.out.print(arr[i] + " is Lucky \n");
            else
                System.out.print(arr[i] + " is not Lucky \n");
    }
    static boolean isLucky(int arr){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        while(arr>0) {
            if(ls.contains(arr%10))
                return false;
            ls.add(arr % 10);
            arr /= 10;
        }
        return true;
    }
}
