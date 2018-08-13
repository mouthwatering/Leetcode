public class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        List list=new ArrayList();
        if(nums==null||nums.length==0){
            return list;
        }
        
        int start = nums[0];
        int end = nums[0];
        String tmp = "->";
        String nodes;
        for(int i = 0;i<nums.length;i++){
            if(i-1>=0&&nums[i]!=nums[i-1]+1){
                end = nums[i-1];
                if(end==start){
                     nodes = String.valueOf(start);
                 }else{
                     nodes = String.valueOf(start)+tmp+String.valueOf(end);
                }
         
                list.add(nodes);
                start = nums[i];
            }
        }
         end = nums[nums.length-1];
         if(end==start){
             nodes = String.valueOf(start);
         }else{
             nodes = String.valueOf(start)+tmp+String.valueOf(end);
         }
         
         list.add(nodes);
         return list;
    }
}