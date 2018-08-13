/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int count = 0;
    int value;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);    
        return value;
    }
    
    public void inorder(TreeNode root,int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        count++;
        if(count==k){
           value= root.val;
        }
        inorder(root.right,k);
    }
}