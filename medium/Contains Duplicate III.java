public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null||nums.length ==0){
            return false;
        }
        if(k<1||t<0)
            return false;
        Map<Long,Long> hash = new HashMap<Long,Long>();
        for(int i =0;i<nums.length;i++){
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum /((long)t+1);
            if(hash.containsKey(bucket)|| hash.containsKey(bucket-1)&& remappedNum - hash.get(bucket-1)<=t
                ||hash.containsKey(bucket+1)&&remappedNum - hash.get(bucket+1)>=-t){
                return true;
            }
            if(hash.entrySet().size()>=k){
                long lastBucket = ((long)nums[i-k] - Integer.MIN_VALUE)/((long)t+1);
                hash.remove(lastBucket);
            }
             hash.put(bucket,remappedNum);
        }
        return false;
    }
}