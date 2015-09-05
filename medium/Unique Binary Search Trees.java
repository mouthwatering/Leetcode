public class Solution {
    public int numTrees(int n) {
        int []res = new int[n+1];
        res[0]=1;
        res[1]=1;
        if(n==1) return 1;
        for(int i = 2;i<=n;i++){
            for (int j = 0;j<=i-1;j++){
                res[i]=res[i]+res[j]*res[i-1-j];
            }
        }
        return res[n];
    }
}

//Catalan number