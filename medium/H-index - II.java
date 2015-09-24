public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null|| citations.length ==0 )  return  0;
       
        int i = citations.length - 1;
        for(i = citations.length - 1;i>=0;i--){
            if(citations[i] >= (citations.length - i)){
                
            }else{
                break;
            }
        }
        return (citations.length - i-1);
    }
}