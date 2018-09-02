class Solution:
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        if len(cost) == 0 : return 0;
        
        rst = [0 for i in range(0, len(cost) + 1)]
        N = len(cost) - 1
        rst[0] = 0
        rst[1] = cost[N ]
        
        for i in range(2, len(cost) + 1):
            
            temp = rst[i - 2] + cost[N - i + 1]        
            rst [i] = rst[i-1] + cost[N - i + 1] if rst[i - 1] + cost[N - i + 1] < temp else temp
       
        return rst[N + 1] if rst[N + 1] < rst[N] else rst[N]
            