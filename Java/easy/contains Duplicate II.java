import java.util.Hashtable; 

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Hashtable hash= new  Hashtable();
       int length = nums.length;
       for(int i =0;i<length;i++){
           if(hash.containsKey(nums[i])){
               int rst=(int)hash.get(nums[i]);
               int difference = (int)rst -i;
               if((difference>=-k)&&(difference<=k)){
                   return true;
               }else{
                   hash.put(nums[i],i);
               }
           }else{
               hash.put(nums[i],i);
           }
       }
       return false;
    }
}