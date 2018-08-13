public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null||obstacleGrid.length ==0){
            return 0;
        }
        int m = obstacleGrid.length+1;
        int n = obstacleGrid[0].length+1;
        int [][]dp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                dp[i][j] = 0;
            }
        }
        
        if(obstacleGrid[0][0] ==0 )
           dp[1][1] = 1;
           else dp[1][1] = 0;
        for(int i = 1;i< m;i++){
            for(int j = 1;j< n;j++){
                if(i ==1){
                    if(obstacleGrid[i-1][j-1]==0){
                         dp[i][j] = dp[i][j] + dp[i][j-1];
                    }
                }
                else if(j ==1){
                    if(obstacleGrid[i-1][j-1]==0){
                        dp[i][j]  = dp[i][j] +dp[i-1][j];
                    }
                }
                else if(obstacleGrid[i-1][j-1] == 0){
                    dp[i][j] = dp[i][j] +(obstacleGrid[i-2][j-1] ==0 ?dp[i-1][j]:0)+(obstacleGrid[i-1][j-2]==0? dp[i][j-1]:0);
                }
            }
        }
        return dp[m-1][n-1];
    }
}