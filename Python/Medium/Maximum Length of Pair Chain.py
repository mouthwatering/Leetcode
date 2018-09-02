class Solution:
    def findLongestChain(self, pairs):
        """
        :type pairs: List[List[int]]
        :rtype: int
        """
        pairs.sort(key = lambda x: x[1])
        
        dp = [1] * len(pairs)
       
        for i in range(len(pairs)-2 , -1, -1):
            for j in range(i+1, len(pairs)):
                if pairs[i][1] < pairs[j][0]:
                    dp[i] =  dp[j] + 1
                    break
        
        return dp[0]