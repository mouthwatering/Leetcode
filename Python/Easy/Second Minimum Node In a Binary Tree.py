# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def findSecondMinimumValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
       
        rootVal = root.val;
        minVal = 2147483647;
        
        minVal = self.find(root,minVal,rootVal);
        
        if minVal == root.val  or minVal == 2147483647:
            return -1;
        return minVal;
        
    def find(self, root, minVal, rootVal):
        if root.val < minVal and root.val!= rootVal:
            minVal = root.val;
        if root.left:
            minVal = self.find(root.left, minVal, rootVal);
        if root.right:
            minVal = self.find(root.right, minVal, rootVal);
        return minVal;
    
    def updateValue(self, root):
        if not root.left is None or not root.right is None:
            self.updateValue(root.left);
            self.updateValue(root.right);
            root.val = root.left.val if root.left.val <= root.right.val else root.right.val
        
            