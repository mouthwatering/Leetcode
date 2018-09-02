class Solution:
    def surfaceArea(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        if len(grid) == 0: return 0;
        
        upperSurface = 0
        for row in grid:
            for c in row:
                if c != 0:
                    upperSurface = upperSurface + 1;
        upperSurface = upperSurface *2
  
        
        outerSurface = 0
        outerSurface = outerSurface + sum(grid[0]) 
        if len(grid) > 1:
            outerSurface = outerSurface + sum(grid[len(grid) - 1])
        if len(grid) == 1:
            outerSurface = outerSurface + sum(grid[0]) 
      
        l = len(grid) 
        if len(grid[0]) > 0:
            for i in range(0, l):
                outerSurface += grid[i][0]
        if len(grid[0]) > 1:
            for i in range(0, l):
                outerSurface += grid[i][len(grid[0])-1]
        if len(grid[0]) == 1:
             for i in range(0, l):
                outerSurface += grid[i][0]
        
                
        innerSurface = 0
        for i in range(1, len(grid)):
            for j in range(0, len(grid[0])):
                innerSurface = innerSurface + abs(grid[i][j] - grid[i-1][j])
        for j in range(1, len(grid[0])):
            for i in range(0, len(grid)):
                innerSurface = innerSurface + abs(grid[i][j] - grid[i][j-1])
        print(innerSurface)    
        
        return upperSurface + outerSurface + innerSurface