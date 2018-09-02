class Solution:
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        N = len(t)
        dp = [0] * N 
       
        if len(s) ==0 : return True
        index = 0;
        for i in range(0, N):         
            if s[index] == t[i]:
                dp[i] = 1
                index = index + 1;
            if index == len(s):
                return True;     
                   
        return False
        
        