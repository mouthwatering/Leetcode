public class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int length = lengthA>lengthB?lengthA:lengthB;
        char []sum =new char[length];
        char [] aa = a.toCharArray();
        char [] bb = b.toCharArray();
        int i = lengthA-1,j=lengthB-1;
        char add ='0';
        int index = length -1;
        while(i>=0||j>=0){
            if(i>=0&&j>=0){
                if(aa[i]-'0'+bb[j]-'0'+add-'0'-2>=0){
                    sum[index--]=(char)(aa[i--]-'0'+bb[j--]-'0'+add-'0'-2+'0');
                    add = '1';
                 }
                 else{
                    sum[index--]=(char)(aa[i--]+bb[j--]+add+'0'-'0'-'0'-'0');
                    add = '0';
                }
            }else if(i>=0){
                 if(aa[i]-'0'+add-'0'-2>=0){
                    sum[index--]=(char)(aa[i--]+add-2+'0'-'0'-'0');
                    add = '1';
                 }
                 else{
                    sum[index--]=(char)(aa[i--]+add+'0'-'0'-'0');
                    add = '0';
                }
            }else{
                if(bb[j]-'0'+add-'0'-2>=0){
                    sum[index--]=(char)(bb[j--]+add-2+'0'-'0'-'0');
                    add = '1';
                 }
                 else{
                    sum[index--]=(char)(bb[j--]+add+'0'-'0'-'0');
                    add = '0';
                }
            }
        }
        
        if(add=='1')
           return '1'+String.valueOf(sum);
        else 
           return String.valueOf(sum);
        
    }
}