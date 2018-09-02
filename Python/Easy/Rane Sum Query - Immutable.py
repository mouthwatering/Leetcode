class NumArray:
  
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
      
        self.arrays = []
        self.arrays = [0 for i in range(0, len(nums)+1)]
        
        if nums is not None:
            for i in range(1, len(nums) + 1):
                self.arrays[i] = self.arrays[i-1] + nums[i-1]
       
    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        
        return self.arrays[j+1] - self.arrays[i]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(i,j)