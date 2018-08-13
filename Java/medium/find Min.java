public class Solution {
    public int findMin(int[] nums) {
        if(nums ==null||nums.length ==0){
            return -1;
        }
       int  min = nums[0];
        boolean isDown = false;
        for(int i =1;i<nums.length;i++){
           if(nums[i]<nums[i-1]){
                min = nums[i];
                break;
            }
        }
        return isDown?nums[nums.length-1]:min;
    }
}
