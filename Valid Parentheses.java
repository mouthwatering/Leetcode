import java.util.Stack;  

public class Solution {
    public boolean isValid(String s) {
        if(s==null)
            return true;
        char [] c = s.toCharArray();
        Stack stack = new Stack();
        for(int i = 0;i<c.length;i++){
            if(c[i]=='('||c[i]=='['||c[i]=='{'){
                stack.push(c[i]);
            }else{
                char tmp;
                if(!stack.empty()){
                    tmp = (char)stack.pop();
                }else{
                    return false;
                }
                
                if(tmp-c[i]<=2&&tmp-c[i]>=-2){
                    
                }
                else{
                    return false;
                }
            }
        }
        if(stack.empty()){
             return true;
        }
        return false;
    }
}