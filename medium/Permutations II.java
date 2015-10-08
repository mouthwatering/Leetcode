public class Solution {
    List<List<Integer>> list;
    List<Integer> subList;
    public List<List<Integer>> permuteUnique(int[] nums) {
        list = new ArrayList<List<Integer>>();
        subList = new ArrayList<Integer>();
        if(nums == null){
            return list;
        }
        
        DFS(nums,0);
        
        return list;
    }
    
    public void DFS(int []nums, int cur){
        
        if(cur== nums.length){
            for(int i = 0;i<nums.length;i++){
                subList.add(nums[i]);
            }
            List<Integer> newList = new ArrayList<Integer>();
            newList.addAll(subList);
            list.add(newList);
            subList.clear();
        }
        for(int i = cur;i<nums.length;i++){
            if(unique(cur,i,nums)){
                 int tmp = nums[cur];
                 nums[cur] = nums[i];
                 nums[i] = tmp;
                
                 DFS(nums,cur+1);
                
                 tmp = nums[cur];
                 nums[cur] = nums[i];
                 nums[i] = tmp;
            }
           
        }
    }
    public boolean unique(int cur,int i ,int [] nums){
        for(int k = cur;k<i;k++){
            if(nums[k] == nums[i]){
                return false;
            }
        }
        return true;
    }
}