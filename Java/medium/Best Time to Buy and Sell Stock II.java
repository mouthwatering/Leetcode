public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        if(prices ==null||prices.length==0){
            return sum;
        }
        int minimum =prices[0];
        int ori = 0;
        for(int i = 1;i<prices.length;i++){
            ori = Math.max(ori,prices[i]-minimum);
            minimum = Math.min(minimum,prices[i]);
            if(i+1<prices.length&&prices[i+1]<=prices[i]){
                sum = sum+ori;
                ori=0;
                minimum = prices[i+1];
            }
        }
        sum = sum+ori;
        return sum;
    }
}