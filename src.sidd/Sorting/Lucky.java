package Sorting;

public class Lucky {
    public static int counter = 2;
    public static void main (String[] args)
    {
        int x = 7;
        if( isLucky(x) )
            System.out.println(x+" is a lucky no.");
        else
            System.out.println(x+" is not a lucky no.");
    }
    static boolean isLucky(int x){
        if(x%counter==0)
            return false;
        if(counter>x)
            return true;

        int next_position = x - (x/counter);

        counter++;
        return isLucky(next_position);
    }
}
