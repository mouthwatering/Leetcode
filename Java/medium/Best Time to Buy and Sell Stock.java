public class Solution {
    public int maxProfit(int[] price) {
        if(price.length<=1){
            return 0;
        }
        int []pre =  new int[price.length];
        pre[0]=0;
        int small = price[0];
        for(int i = 1;i<price.length;i++){
            
            pre[i]=Math.max(pre[i-1],price[i]-small);
            small = Math.min(small,price[i]);
        }
        return pre[price.length-1];
    }
}