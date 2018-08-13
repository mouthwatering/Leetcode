public class Solution {
    public String getPermutation(int n, int k) {
        int nums[] = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = i+1;
            }
            int [] fac = new int[3628];
            fac[0] = 1; fac[1] = 1;
            for(int i =2;i<fac.length;i++){
                fac[i] = i*fac[i-1];
            }
            
            boolean isUsed[] = new boolean[n];
            for(int i = 0;i<n;i++){
                isUsed[i] = false;
            }
            int res[] = new int [n];
            res[0] = 0;
            int residual = k-1;int rst = 0;
            
            int tmp = n;
            for(int i =0;i<n;i++){
                rst = (int) residual/fac[tmp-1] ;

                int count=0,m  = -1;
                int trueNum = 0;
                // 这里的处理 找到第几大很关键
                while(count<n&&m<rst){
                    if(isUsed[count]){
                        count++;
                        trueNum++;
                    }else{
                        m++;
                        count++;
                    }
                }
                
                isUsed[m+trueNum] = true;
                res[i] = nums[m+trueNum];
                residual =residual%(fac[tmp-1]);
                tmp--;
            }  
            String s = "";
            for(int i = 0;i<n;i++){
                s = s+String.valueOf(res[i]);
            }
            return s;
    }
  
}