public class Solution {
    public int singleNumber(int[] nums) {
        int one= 0,two = 0,three =0;
        for(int i=0;i<nums.length;i++){
            three = two& nums[i];
            two = two| one & nums[i];
            one =one |nums[i];
            two = two & ~ three;
            one = one & ~ three;
        }
        return one;
    }
}