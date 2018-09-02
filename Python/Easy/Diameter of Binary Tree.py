# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0;
        depth = self.getDepth(root.left) + self.getDepth(root.right);
        leftDia = self.diameterOfBinaryTree(root.left) ;
        rightDia = self.diameterOfBinaryTree(root.right);
        depth = depth if depth > leftDia else leftDia;
        depth = depth if depth > rightDia else rightDia;
        return depth;
        
    def getDepth(self, root):
        if root is None:
            return 0;
        leftDepth = self.getDepth(root.left)+1;
        rightDepth = self.getDepth(root.right)+1;
        return leftDepth if leftDepth>rightDepth else rightDepth;