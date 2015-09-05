public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int i =0,k = 0;
        while(i+k<nums.length){
            while(i+1+k<nums.length&&nums[i]==nums[i+1+k]){
                k++;
            }
            if(i+1<nums.length&&i+k+1<nums.length){
                 nums[i+1]=nums[i+k+1];
            }
            i++;
        }
        return i;
    }
}