public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null)
            return true;
        boolean isPalindrome;
        char []str= s.toCharArray();
        boolean tmpI=true,tmpJ=true;
        int i=0,j=s.length()-1;
        while(i<j){
            tmpI=true;tmpJ=true;
            while((i<=s.length()-1)&&(str[i]<48||(str[i]>57&&str[i]<65)||(str[i]>90&&str[i]<97)||str[i]>122)){
                i++;
              tmpI = false;
            }
          
            while((j>=0)&&(str[j]<48||(str[j]>57&&str[j]<65)||(str[j]>90&&str[j]<97)||str[j]>122)){
                j--;
                tmpJ = false;
            }
            if(tmpI ==true&tmpJ ==true){
                 if((i<=s.length()-1&&j>=0)&&(str[i]==str[j]||str[i]-str[j]==32||str[i]-str[j]==-32)){
                   
                 }else{
                    return false;
                 }
                 i++;j--;
            }
        }
        return true;
    }
}