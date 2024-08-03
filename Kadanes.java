
import java.util.*;
class HelloWorld {
    public static void sumSubArrayUsingKadans(int nums[]){
     int maxSum=Integer.MIN_VALUE;
     
     int currSum=0;
     for(int i=0;i<nums.length;i++){
         currSum+=nums[i];
          if(currSum<0){
         currSum=0;
     }
       maxSum=Math.max(currSum,maxSum);
     }
    
   System.out.println("maxSum is"+maxSum);
     
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        sumSubArrayUsingKadans(nums);
    }
}
