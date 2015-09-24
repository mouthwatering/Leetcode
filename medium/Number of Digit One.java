public class Solution {
    public int countDigitOne(int n) {
        if(n<=0){
            return 0;
        }
        String s = String.valueOf(n);
        int digits = s.length();
        if(digits == 1&& s.charAt(0) != '0') return n>=1?1:0;
    
        int numRecursive = countDigitOne(n - (s.charAt(0)-'0')*genTen(s.length()-1)) ;
        int numMid= (s.charAt(0)-'0')*genTen(s.length() -2)*(s.length()-1);
        int numHigh=((s.charAt(0)-'0')>1?1:0 )*genTen(s.length() -1);
        if(s.charAt(0)=='1')
            numHigh = n - (s.charAt(0)-'0')*genTen(s.length()-1)+1;
        return numRecursive + numHigh + numMid;
    }  
    public int genTen(int l){
        int res =1;
        while(l-->0){
            res = res*10;
        }
        return res;
    }
}