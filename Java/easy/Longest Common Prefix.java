// to have the longed substring we need to uncommen the commend sentence
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String tmp =new String("");
        if(strs==null){
            return tmp;
        }        
        StringBuilder sb = new StringBuilder();
        int index =minLength(strs);
        if(index ==-1){
            return tmp;
        }
      
        for(int i =0;i<strs[index].length();i++){
            boolean flag = true;
            
            //int jbefore = sb.length();
            for(int j =0;j<strs.length;j++){
             
                if(j!=index&&strs[j].charAt(0)!=strs[index].charAt(0)){
                    return tmp;
                }
                if(j!=index&&(strs[j].charAt(i)!=strs[index].charAt(i))){
                //if(j!=index&&(strs[j].substring(jbefore,strs[j].length()).indexOf(strs[index].charAt(i))== -1)){
                   flag = false;
                  
                }
            }
            if(flag ==true){
                sb.append(strs[index].charAt(i));
            }
            //else{
               //  s.append('.');
           // }
        }
        String str = sb.toString();
       // String [] array = str.split("\\.");
       // int maxIndex = maxLength(array);
       // return maxIndex==-1?tmp:array[maxIndex];
        return str;
       
    }
    
    public int minLength(String[] strs){
        if (strs.length ==0)
            return -1;
        int l = strs[0].length();
        int index =0;
        for(int i =1;i<strs.length;i++){
            if(strs[i].length()<l){
                index =i;
                l = strs[i].length();
            }
        }
        return index;
    }
    
    public int maxLength(String[] strs){
        if (strs.length ==0)
            return -1;
        int l = strs[0].length();
        int index =0;
        for(int i =1;i<strs.length;i++){
            if(strs[i].length()>l){
                index =i;
                l = strs[i].length();
            }
        }
        return index;
    }
}