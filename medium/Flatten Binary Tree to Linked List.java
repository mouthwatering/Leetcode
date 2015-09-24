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
    public void flatten(TreeNode root) {
       TreeNode newRoot = new TreeNode(0);
       pre = newRoot;
       if(root != null) {
           tranversal(root);
           pre.left = null;
           pre.right = null;
           root= newRoot.right;
       }
    }
    TreeNode pre= new TreeNode(0);
    
    public void tranversal(TreeNode root){
            TreeNode tmp = root.right;// 保存root.righ方法很常用，要学习
            pre.left= null;
            pre.right = root;
            pre =pre.right;

            if(root.left!=null) {
                tranversal(root.left);
            }
            if(tmp!=null) {
                tranversal(tmp);
            }
       
    }
}