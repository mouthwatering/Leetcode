public class Solution {
    public void setZeroes(int[][] matrix) {
        int row  = matrix.length;
        int col = matrix[0].length;
        boolean [][] isCovered= new boolean[row][col];
         for(int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                isCovered [i][j]=false;
            }
         }
     
        for(int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                if(isCovered[i][j]==false&&matrix[i][j]==0){
                    for(int m =0;m<matrix.length;m++){
                        if(matrix[m][j]!=0){
                             matrix[m][j]=0;
                            isCovered[m][j]=true;
                        }
                       
                    }
                    for(int n = 0;n<matrix[0].length;n++){
                        if(matrix[i][n]!=0){
                            matrix[i][n]=0;
                            isCovered[i][n]=true;
                        }
                        
                    }
                }
            }
        }
    }
}
