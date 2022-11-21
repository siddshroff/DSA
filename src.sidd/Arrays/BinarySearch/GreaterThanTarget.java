package Arrays.BinarySearch;

public class GreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j' };
        int target = 'z';

        System.out.println(smallestLetterGreaterThanTarget(arr, target));
    }

    private static char smallestLetterGreaterThanTarget(char[] arr, int target) {
        int startIndex=0;
        int endIndex = arr.length-1;
        while(startIndex<=endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;
            if(arr[mid]>target){
                endIndex=mid-1;
            } else {
                startIndex=mid+1;
            }
        }
        return arr[startIndex%arr.length];
    }
}
