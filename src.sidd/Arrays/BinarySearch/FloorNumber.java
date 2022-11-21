package Arrays.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,8, 12, 19, 50 };
        int target = 20  ;

        System.out.println(floor(arr, target));
    }

    private static int floor(int[] arr, int target) {

        int startIndex=0;
        int endIndex = arr.length-1;
        while(startIndex<=endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;
            if(arr[mid]>target){
                endIndex=mid-1;
            } else if (arr[mid]<target) {
                startIndex=mid+1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return endIndex;
    }
}
