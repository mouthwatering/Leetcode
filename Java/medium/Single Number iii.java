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
                res[0]^=nums[i];//�м����ֻ���Ϊtwice ������Ҳ�п����к���Ϊ0 ��
            }
            else{
                res[1]^=nums[i];
            }
        }
        return res;
    }
}