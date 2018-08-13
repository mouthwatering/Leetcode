public class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = 0;
        if(rows>0){
            cols = grid[0].length;
        }
        
        int count = 0;
        for(int i = 0;i<rows;i++){
            for (int j =0;j<cols;j++){
                if(grid[i][j]=='1'){
                    count++;
                    transformBoundery(i,j,grid);
                }
            }
        }
        return count;
    }
    
    void transformBoundery(int i,int j ,char [][]grid){
        grid[i][j]='0';
        if(i-1>=0&&grid[i-1][j]=='1'){
           transformBoundery(i-1,j,grid);
        }
        if(j-1>=0&&grid[i][j-1]=='1'){
           transformBoundery(i,j-1,grid);
        }
        if(i+1<grid.length&&grid[i+1][j]=='1'){
            transformBoundery(i+1,j,grid);
        }
        if(j+1<grid[0].length&&grid[i][j+1]=='1'){
           transformBoundery(i,j+1,grid);
        }
    }
}