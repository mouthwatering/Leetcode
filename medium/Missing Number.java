public class Solution {
    public int missingNumber(int[] nums) {
        if(nums ==null)
            return 0;
        int rst = (nums.length+1)*nums.length/2;
        for (int i = 0;i<nums.length;i++){
            rst = rst - nums[i];
        }
        return rst;
    }
}