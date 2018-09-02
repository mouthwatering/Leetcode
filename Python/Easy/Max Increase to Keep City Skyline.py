class Solution:
    def maxIncreaseKeepingSkyline(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        N = len(grid)
        top = [0 for col in range(N)]
        for i in range(N):
            val = 0;
            for j in range(N):
                val = grid[j][i] if grid[j][i] > val else val
            top[i] = val   
        print (top)
        
        left = [0 for row in range(N)] 
        for i in range(N):
            val = 0
            for j in range(N):
                val = grid[i][j] if grid[i][j] > val else val
            left[i] = val
        print(left)             
        
        array = [[0 for col in range(N)] for row in range(N)]
        res = 0;
        for i in range(0, N):
            for j in range(0, N):
                array[i][j] = left[i] if left[i] < top[j] else top[j]
                res +=  array[i][j] - grid[i][j]       
        return res