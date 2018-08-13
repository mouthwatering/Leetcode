public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] org = nums.clone();
        Arrays. sort(nums);
        int start = 0,end = nums.length-1;
        while(start<end){
             if(nums[start]+nums[end]>target){
                 end--;
             }
             else if(nums[start]+nums[end]<target){
                 start++;
             }
             else{
                 break;
             }
         }
        for(int i =0;i<org.length;i++){
            if(org[i]==nums[start]){
                start =i;
                break;
            }
        }

        for(int i =0;i<org.length;i++){
            if(org[i]==nums[end]&&i!=start){
                end =i;
                break;
            }
        }
        
         int res[]= new int[2];
         res[0] = start+1<end+1?start+1:end+1;
         res[1] = start+1>end+1?start+1:end+1;
         return res;
    }
}