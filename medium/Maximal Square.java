public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null) return 0;
        if(matrix.length>0){
             int l =maximalEdge(matrix, matrix.length,matrix[0].length);
             return (l)*(l);
        }else{
            return 0;
        }
    }
    public int maximalEdge(char [][] matrix,int n,int m){
        boolean isAllzero  = true;
        System.out.println("n="+n+" m= "+m);
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]=='1'){
                    isAllzero = false;
                    char right = matrix[i][(j+1>=m-1)?m-1:j+1] ; 
                    char down  = matrix[(i+1<=n-1)?i+1:n-1][j];
                    char diag  = matrix[(i+1>=n-1)?n-1:i+1][(j+1>=m-1?m-1:j+1)];
                    if(right=='0'||down=='0' ||diag =='0')
                        matrix[i][j]='0' ;
                    if(j+1==m || i+1==n)
                         matrix[i][j]='0' ;
                }
            }
        }
        if(isAllzero ==true){
            return 0;
        }else{
            return (1+maximalEdge(matrix,n,m));
        }
    }
}