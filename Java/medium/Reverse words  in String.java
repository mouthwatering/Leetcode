
public class Solution {
    public String reverseWords(String s) {
        if(s ==null){
            return null;
        }
        StringBuilder rst=new StringBuilder("");
        int length = s.length();
        boolean hasNumber = false;
        for (int i = length-1;i>=0;i--){
            String tmp=new String();
            while(i>=0&&s.charAt(i)!=' '){
                tmp = tmp+String.valueOf(s.charAt(i));
                i--;
                hasNumber = true;
            }
            if(hasNumber ==true){
                tmp = transform(tmp);
                if(rst.length()!=0){
                    rst.append(" ");
                }
                rst = rst.append(tmp);
            }
            hasNumber = false;
        }
        return rst.toString();
    }
    
    public String transform (String s){
        if(s==null){
            return null;
        }
        StringBuffer str= new StringBuffer(s);
        for(int i = 0,j=s.length()-1;i<=j;i++,j--){
            char tmp =s.charAt(i);
            str.setCharAt(i,s.charAt(j));
            str.setCharAt(j,tmp);
        }
        return str.toString();
    }
}
