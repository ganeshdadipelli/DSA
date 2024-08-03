
class HelloWorld {
    public static void sumSubArray(int nums[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=nums[k];
                }
                System.out.println("the current sum from "+i+ "to"+j+ "is "+currSum);
                   if(maxSum<currSum){
            maxSum=currSum;
        }
            }
                

        }
         System.out.println("maxSum is "+maxSum);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        sumSubArray(nums);
    }
}
