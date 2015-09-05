public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null||nums.length ==0)
            return 0;
        int i = 0,j=0;
        while(i+j<nums.length){
            while(i+j<nums.length&&nums[i+j]==val){
                j++;
            }
            if(j!=0&&i+j<nums.length){
                nums[i]=nums[i+j];
            }else if(j!=0){
                return i ;
            }
            i++;
        }
        return i;
    }
}