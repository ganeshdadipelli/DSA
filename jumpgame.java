package JumpGame;

class Jumpgame {
    public boolean canJump(int[] nums) {
    int finalPosition=nums.length-1;
    //this is for decalring finalposition where to reach
    for(int i=nums.length-2;i>=0;i--){
    if(i+nums[i]>=finalPosition){
    finalPosition=i;
    }
}
    return false;
    }
    }
    