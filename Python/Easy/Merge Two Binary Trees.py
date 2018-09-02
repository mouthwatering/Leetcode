class Solution:
    def mergeTrees(self, t1, t2):
        """
        :type t1: TreeNode
        :type t2: TreeNode
        :rtype: TreeNode
        """
        if not t1 is None and not t2 is None:
            t1.val  =  t1.val + t2.val;
            t1.left = self.mergeTrees(t1.left, t2.left);
            t1.right = self.mergeTrees(t1.right, t2.right)
        elif t1 is None:
            t1 = t2;
        return t1;
            