public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums != null){
           
           
            if(k!=0&&k<nums.length){
                int[] tmp = new int[k];
                int i,j = 0;
                for ( i = nums.length-k;i<nums.length;i++){
                    tmp[j++]=nums[i];
                 }
            
              for(i = nums.length-1;i>=k;i--){
                 nums[i]=nums[i-k];
                 }
                 for (i = 0;i<k;i++){
                    nums[i]=tmp[i];
                }
            }
           else if(k!=0){
               int small_length=k%nums.length;
               int []tmp = new int[small_length];
               int i,j = 0;
                for ( i = nums.length-small_length;i<nums.length;i++){
                    tmp[j++]=nums[i];
                 }
               for(i = nums.length-1;i>=small_length;i--){
                 nums[i]=nums[i-small_length];
                 }
                 for (i = 0;i<small_length;i++){
                    nums[i]=tmp[i];
                }
           }
        }
    }
}