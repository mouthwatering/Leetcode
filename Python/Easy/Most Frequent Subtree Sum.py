# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  
    def findFrequentTreeSum(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        d = {}
        self.getValue(root, d);
       
        if len(d) == 0: return []
        if len(d) > 0:
            maxValue = 1
            rst = [];
            for key,value in d.items():
                if maxValue < value:       
                    maxValue = value;
            if maxValue > 1:
                for key, value in d.items():
                    if maxValue == value:
                        rst.append(key);
                return rst
            else:
                return [l for l in d]
                    
        
    def getValue(self, root, d): 
        val = 0;
        
        if root is None: return 0;
        
        if root.left is not None and root.right is not None:
            val  = root.val + self.getValue(root.left, d) + self.getValue(root.right, d)
        elif root.left is None and root.right is None:
            val = root.val;
        elif root.left is None:
            val = root.val + self.getValue(root.right, d)
        elif root.right is None:
            val = root.val + self.getValue(root.left, d)
         
        if val not in d:
            d[val] = 1
        else :
            d[val] += 1
      
        return val;
        
        
            