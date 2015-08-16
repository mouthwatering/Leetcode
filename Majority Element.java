public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int rst = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=rst){
                count--;
                if(count<0){
                    count =0;
                     rst = nums[i];
                }
            }else{
                count++;
                if(count ==1){ //第一次为1的；
                    rst = nums[i];
                }
            }
        }
        return rst;
    }
}