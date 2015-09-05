public class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int count =1;
        
        int row = n-1,col = n-1;
        int rotateNum = (int)Math.ceil(n/2.0);
      
        int i=0,j=0;
        for (int pile = 0;pile<rotateNum ;pile++){
            if(count > (col+1)*(row+1)){
                break;
            }
            //Judge 重新一圈的时候是向下还是向右，思维要严密，要尽可能多的利用已知信息，比如剩下的行数，列数，比如已经用过的数字个数
            if(i == j && count<=(row+1)*(col+1)){
                matrix[i][j]=count++;
                if(col+1-(pile)*2>1){
                    j++;
                }else{
                    i++;
                }
            }
            while(i==(pile) && j<=col-pile-1 && count<=(row+1)*(col+1)){
                matrix[i][j++]=count++;
            }
            while(i<=row-pile-1 && j == col-pile && count<=(row+1)*(col+1)){
               matrix[i++][j]=count++;
            }
            while(i == row-pile && j>=pile+1 && count<=(row+1)*(col+1)){
                matrix[i][j--]=count++;
            }
            while(j == pile && i>=pile+1 && count<=(row+1)*(col+1)){
                matrix[i--][j]= count++;
            }
            i = i+1;j = j+1;
        }
        return matrix;
    }
}