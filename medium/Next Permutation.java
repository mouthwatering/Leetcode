public class Solution {
    public void nextPermutation(int[] nums) {
       
        int pre = Integer.MIN_VALUE;
        int i = nums.length -1;
        for( i = nums.length -1;i>=0;i--){
            if(pre<=nums[i]){
                pre = nums[i];
            }else {
                break;
            }
        }
        
        if(i ==-1){
            Arrays.sort(nums,0,nums.length);
        }else{
            int index = findMin(nums,i);
            int tmp = nums[index];
            nums[index] = nums[i];
            nums[i] = tmp;
            
            Arrays.sort(nums,i+1,nums.length);
        }
    }
    public int findMin(int []nums,int i){
        int min = Integer.MAX_VALUE;
        int index = nums.length -1;
        int floor = nums[i];
        for(int k = i+1;k<nums.length;k++){
            if(min>=nums[k]&& floor<nums[k]){
                min = nums[k];
                index = k;
            }
        }
        return index;
    }
}