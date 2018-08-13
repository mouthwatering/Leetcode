public class Solution {
    public void rotate(int[][] matrix) {
        int piles = (int)Math.ceil((matrix.length) /2.0);
        for(int i= 0;i < piles; i++){
            for(int j = i;j<matrix.length -1-i;j++){
                int tmp1 = matrix[j][matrix.length -1 -i];
                matrix[j][matrix.length -1 - i] = matrix[i][j];
                int tmp2 = matrix[matrix.length -1 - i][matrix.length -1 - j];
                 matrix[matrix.length -1- i][matrix.length -1- j]= tmp1;
                int tmp3= matrix[matrix.length -1 - j][i];
                matrix[matrix.length -1- j][i] = tmp2;
                matrix[i][j] = tmp3;
            }
        }
    }
}