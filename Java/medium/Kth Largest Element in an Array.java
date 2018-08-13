public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int i = 0, j = nums.length-1;
        k= k-1 ; 
        quickSort(nums,i,j,k);
        return nums[k];
    }
    void quickSort(int []nums,int start,int end,int v){
        if(start<=v&&v<=end){
           int i = start,j = end;
            int tmp;
            int counts_equal = 0;
            int key = nums[v];
            nums[v] = nums[i];
            nums[i] = key;
            while(i<j){
                while(i<j && nums[j] <=key) {
                    if(nums[j] == key){
                        counts_equal++;
                    }
                    j--;
                }
                  nums[i] = nums[j];
                while(i<j && nums[i] > key) i++;
                  nums[j] = nums[i];
            }
            nums[i] = key;
  
            if(i<v){
                quickSort(nums,i+1,end,v);
            }else if(i>v){
                quickSort(nums,start,i-1,v);
            } 
        }    
    }
}