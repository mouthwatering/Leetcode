public class Solution {
    public int maxProduct(int[] nums) {
       if(nums == null ||nums.length ==0){
           return 0;
       }
       int dp[] = new int[nums.length];
       int negative [] = new int[nums.length];
       dp[0] = nums[0];
       negative[0] = nums [0];
       for(int i=1;i<nums.length;i++){
           negative[i] =Math.min( Math.min(nums[i],negative[i-1]*nums[i]),dp[i-1]*nums[i]);
           dp[i] = Math.max(Math.max(dp[i-1]*nums[i],nums[i]),negative[i-1]*nums[i]);
       }
       int max = dp[0];
       for(int i = 1;i<nums.length;i++){
           max = max>dp[i]?max:dp[i];
       }
       return max;
    }
}