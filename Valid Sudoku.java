import java.util.List;
import java.util.ArrayList;
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return true;
        HashSet []checkRow = new HashSet[9];
        HashSet []checkColumn = new HashSet[9];
        HashSet []checkBox = new HashSet[9];
        
        // 这里需要注意，需要再为每个HashSet 初始化
        for(int i=0;i<9;i++){
            checkRow[i]=new HashSet();
            checkColumn[i]=new HashSet();
            checkBox[i]=new HashSet();
        }
        
        for(int i = 0;i<9;i++){
            for (int j = 0;j<9;j++){
                
                if(board[i][j]!='.'){
                            int orderRow = i/3;
                            int orderCol = j/3;
                            if(checkRow[i].contains(board[i][j])||checkColumn[j].contains(board[i][j])||checkBox[orderRow*3+orderCol].contains(board[i][j])){
                                return false;
                            }else{
                            
                                 checkRow[i].add(board[i][j]);
                                checkColumn[j].add(board[i][j]);
                                checkBox[orderRow*3+orderCol].add(board[i][j]);
                            }
                }
            } 
        }
        return true;
    }
}