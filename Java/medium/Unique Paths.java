public class Solution {
    public int uniquePaths(int m, int n) {
        // 如果有障碍物呢
        int [][] nums = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
        
            for(int j = 0;j<=n;j++){
             nums[i][j] =0;
            }
        }
        nums[1][1] = 1;
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                nums[i][j] = nums[i][j]+nums[i-1][j] + nums[i][j-1];
            }
        }
        return nums[m][n];
    }
}