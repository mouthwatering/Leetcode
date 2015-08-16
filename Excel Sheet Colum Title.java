import java.util.Hashtable;
public class Solution {
    public String convertToTitle(int n) {
           if(n<=0)
             return null;
           char []rst = new char[10];
           Hashtable hash = new Hashtable(2,(float)0.8);
           int num = 1;char letter = 65;
           for (int i = 1;i<=26;i++){
               hash.put(num++,letter++);
           }
           int i = 0;
           while(n>=1){
               int key = n%26;
               if(key==0)
                  key = 26;
               rst[i++]=(char)hash.get(key);
               n = (n-key)/26;
           }
           rst[i]='\0';
           int start = 0,end = i-1;
           while(start<=end){
               char tmp = rst[end];
               rst[end--]=rst[start];
               rst[start++]=tmp;
           }
           return String.valueOf(rst);
    }
}