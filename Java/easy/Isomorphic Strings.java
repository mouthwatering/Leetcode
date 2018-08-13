import java.util.HashMap;
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
         HashMap hashMap = new HashMap();
         int length = s.length();
         for(int i = 0;i<length;i++){
             if(!hashMap.containsKey(s.charAt(i))&&!hashMap.containsValue(t.charAt(i))){
                 hashMap.put(s.charAt(i),t.charAt(i));
             }
             else if(hashMap.containsKey(s.charAt(i))){
                 if((char)hashMap.get(s.charAt(i))!=t.charAt(i)){
                     return false;
                 }
             }
             else if(hashMap.containsValue(t.charAt(i))){
                 return false;
             }
         }
         return true;
    }
}