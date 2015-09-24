public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor ^= nums[i];
        }
        int mask = xor&(~(xor-1));
        int [] res=new int[2];res[0]=0;res[1]=0;
        for(int i = 0;i<nums.length;i++){
            if((mask&nums[i])==0){
                res[0]^=nums[i];//切记是抑或，因为twice 的数中也有可能切好与为0 的
            }
            else{
                res[1]^=nums[i];
            }
        }
        return res;
    }
}