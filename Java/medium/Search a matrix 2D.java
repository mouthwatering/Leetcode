public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i =0;
        int j = matrix[0].length-1;
        while(i>=0&&j>=0&&i<matrix.length&&j<matrix[0].length){
            if(matrix[i][j]>target){
                j = j-1;
            }
            else if(matrix[i][j]==target){
                return true;
            }else{
                i = i+1;
            }
        }
        return false;
    }
}