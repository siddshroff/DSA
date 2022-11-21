package Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
int[] arr ={555,901,482,1771};
EvenNumbers obj = new EvenNumbers();
    int number = obj.findNumbers(arr);
    }
    public int findNumbers(int[] nums) {
        //Input: nums = [555,901,482,1771]
        //Output: 1
        //Explanation:
        //Only 1771 contains an even number of digits.
        int evenNumberCount = 0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    private boolean even(int num) {
        int count=0;
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return false;
        }
        while (num > 0) {
            count++;
            num/=10;
        }
        return (count%2==0)?true:false;
    }
}
