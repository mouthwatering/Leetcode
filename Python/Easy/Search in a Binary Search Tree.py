# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def searchBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        if root.val > val  and root.left:
            return self.searchBST(root.left, val)
        elif root.val < val and root.right:
            return self.searchBST(root.right, val)
        elif root.val == val:
            return root
        else :
            return [];