public class Solution {
    public int titleToNumber(String s) {
        if(s==null){
            return 0;
        }
        int i,length = s.length(),rst=0;
        for(i = 0;i<length;i++){
            rst = rst*26+s.charAt(i)-'A'+1;
        }
        return rst;
    }
}