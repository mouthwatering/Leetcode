public class Solution {
    ListListInteger list;
    ListInteger subList;
    public ListListInteger permute(int[] nums) {
        list = new ArrayListListInteger();
        subList = new ArrayListInteger();
        if(nums == null){
            return list;
        }
        
        DFS(nums,0);
        
        return list;
    }
    
    public void DFS(int []nums, int cur){
        
        if(cur== nums.length){
            for(int i = 0;inums.length;i++){
                subList.add(nums[i]);
            }
            ListInteger newList = new ArrayListInteger();
            newList.addAll(subList);
            list.add(newList);
            subList.clear();
        }
        for(int i = cur;inums.length;i++){
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