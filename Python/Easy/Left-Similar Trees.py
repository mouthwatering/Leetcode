# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        s1 = [];
        s2 = [];
        
        self.findNextNode(root1, s1);
        self.findNextNode(root2, s2);
        print(s1)
        print(s2)
        if len(s1) == len(s2):
            for i in range(0,len(s1)):
                if s1[i] != s2[i]:
                    return False;
            return True;
        return False;
        
        
    def findNextNode(self, root, s):
        if root.left is None and root.right is None:
            s.append(root.val) 
        if not root.left is None:
            self.findNextNode(root.left, s)
        if not root.right is None:
            self.findNextNode(root.right, s)