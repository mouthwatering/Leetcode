
public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length ==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int [][] res = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j =0;j<=n;j++){
                res[i][j] =0;
            }
        }
        if(m>=2){
            for(int i = 2;i<=grid.length;i++){
                res[i][0] = Integer.MAX_VALUE;
            }
        }
        if(n>=2){
            for(int i = 2;i<=grid[0].length;i++){
                res[0][i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                res[i][j] = grid[i-1][j-1]+ Math.min(res[i-1][j], res[i][j-1]);
            }
        }
        return res[m][n];
    }
}