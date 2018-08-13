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
    private int res=0;
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if(root==null){
            return 0;
        }
        DFS(root,sum);
        return res;
    }
    
    public void DFS(TreeNode root,int sum){
        if(root == null){
            return;
        }
        sum = sum*10+root.val;
        if(root.left==null&&root.right==null){
            res =res +sum; 
        }
        DFS(root.left,sum);
        DFS(root.right,sum);
    }
}