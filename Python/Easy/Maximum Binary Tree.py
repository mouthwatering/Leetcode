class Solution:
    def constructMaximumBinaryTree(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
       
        if len(nums) == 0:
            return None;
        max_num = max(nums);
        index = nums.index(max_num);
        
        root = TreeNode(max_num);
        
        root.left = self.constructMaximumBinaryTree(nums[0: index if index > 0  else 0]);    
        start = index + 1 if index + 1 < len(nums) else len(nums)
        root.right = self.constructMaximumBinaryTree(nums[start : len(nums)]);
        
        return root;