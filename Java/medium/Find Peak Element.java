public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums ==null||nums.length ==0){
            return 0;
        }
        int peakIdx =0;;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                peakIdx= i;
            }
            if(nums[i]<nums[i-1]){
                break;
            }
        }
        return peakIdx;
    }
}