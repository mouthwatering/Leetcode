public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        for(int i =0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else{
                 hash.put(s.charAt(i),1);
            }
        }
        
        for(int i =0;i<t.length();i++){
            if(hash.containsKey(t.charAt(i))){
                hash.put(t.charAt(i),hash.get(t.charAt(i))-1);
            }else{
                 return false;
            }
        }
        Set keySet = hash.keySet();
        for(Iterator iterator = keySet.iterator();iterator.hasNext();)
        {
             if(hash.get(iterator.next())!=0){
                return false;
             }
        }
        return true;
    }
}