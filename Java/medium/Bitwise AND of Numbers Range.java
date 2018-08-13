
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m==n){
            return m;
        }
        int tmp = n-m+1;
        int bits = (int)Math.ceil(Math.log((double)tmp)/Math.log((double)2)) ;
        int num = 1;
        num = num<<bits;
        if(Math.floor(Math.log((double)n)/Math.log((double)2))-Math.floor(Math.log((double)m)/Math.log((double)2)) >=1.0){
            return 0;
        }
        else if(m==1&&n==2){
            return 0;
        }
        else if(m==0&&n ==1){
            return 0;
        }
        else{
             int low = (int)Math.floor(Math.log((double)m)/Math.log((double)2));
             int ex = 1;
             while(low-->0){
                 ex = ex*2;
             }
                return ex+rangeBitwiseAnd(m-ex,n-ex);
            
        }
      
    }
    
    public int isLog(int m){
        int count = 0;
        while(m!=0&&m%2==0){
            m = m%2;
            count++;
        }
        if(count>0&&m==0){
            return count;
        }
        else 
            return -1;
    }
}



    public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
    //The whole point is to find the first bit where and m and n is different;
        long i = 1L<<31;
        long res = 0;
        while(i>0){
            if((m&i) == (n&i)){
                res |= m & i;
            }
            else{
                break;
            }
            i = i>>>1;
        }
        return (int)res;
    }
};