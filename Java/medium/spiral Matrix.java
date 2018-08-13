public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List list = new ArrayList();
        if( matrix.length==0){
            return list;
        }
        int count =0;
        int row = matrix.length-1,col = matrix[0].length-1;
        int rotateNum = (int)Math.ceil(Math.min(row+1,col+1)/2.0);
      
        int i=0,j=0;
        for (int pile = 0;pile<rotateNum ;pile++){
            if(count > (col+1)*(row+1)){
                break;
            }
            //Judge ����һȦ��ʱ�������»������ң�˼άҪ���ܣ�Ҫ�����ܶ��������֪��Ϣ������ʣ�µ������������������Ѿ��ù������ָ���
            if(i ==j && count<(row+1)*(col+1)){
                list.add(matrix[i][j]);
                count++;
                if(col+1-(pile)*2>1){
                    j++;
                }else{
                    i++;
                }
            }
            
            while(i==(pile) && j<=col-pile-1 && count<(row+1)*(col+1)){
                list.add(matrix[i][j++]);
                count++;
            }
            while(i<=row-pile-1 && j == col-pile && count<(row+1)*(col+1)){
                list.add(matrix[i++][j]);
                 count++;
                
            }

            while(i == row-pile && j>=pile+1 && count<(row+1)*(col+1)){
                list.add(matrix[i][j--]);
                 count++;
            }
        
            while(j == pile && i>=pile+1 && count<(row+1)*(col+1)){
                list.add(matrix[i--][j]);
                 count++;
            }
            i = i+1;j = j+1;
        }
        
        return list;
    }
}